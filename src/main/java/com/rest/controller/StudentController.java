package com.rest.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import java.util.*;
import com.rest.model.Student;
import com.rest.service.StudentService;


@RestController
public class StudentController {
	@Autowired
	private StudentService stdser;
	@PostMapping("/save")
	public String save(@RequestBody Student std)
	{
		Student s1=stdser.saveStudent(std);
		String message=null;
		if(s1 !=null)
		{
			message="Student data inserted";
		}
		else
		{
			message="Student data not inserted";
		}
		return message;
	}
	@DeleteMapping("/delete/{id}")
	public void deleteStudent(@PathVariable Integer id)
	{
		stdser.deleteStd(id);
	}
	@GetMapping("get/{id}")
	public Student oneStudent(@PathVariable Integer id)
	{
		Student std=stdser.getOneStudent(id);
		return std;
	}
	@GetMapping("/getAll")
	public List<Student> getStdAll()
	{
		List<Student> list=stdser.getStudent();
		return list;
	}
	@PutMapping("/edit/{id}")
	public Student editStd(@RequestBody Student std,@PathVariable Integer id)
	{
		return stdser.updateStudent(std, id);
	}
	

}
