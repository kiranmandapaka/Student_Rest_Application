package com.rest.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

import com.rest.model.Student;
import com.rest.repository.StudentRepository;

@Service
@Profile(value= {"purview1","purview2","purview3"})
public class StudentService {
	@Autowired
	private StudentRepository stdrepo;
	
	public Student saveStudent(Student std)
	{
		Student s1=stdrepo.save(std);
		return s1;
	}
	public void deleteStd(Integer id)
	{
		stdrepo.deleteById(id);
	}
	public Student getOneStudent(Integer id)
	{
		Student st=stdrepo.findById(id).get();
		return st;
	}
	public List<Student> getStudent()
	{
		List<Student> list=stdrepo.findAll();
		return list;
	}
	public Student updateStudent(Student std,Integer id)
	{
		Student oldstd=stdrepo.findById(id).get();
		oldstd.setSname(std.getSname());
		oldstd.setSfee(std.getSfee());
		return stdrepo.save(oldstd);
	}

}
