 package com.rest.service;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.Optional;

import org.junit.jupiter.api.BeforeEach;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;

import com.rest.model.Student;
import com.rest.repository.StudentRepository;

import ch.qos.logback.core.joran.action.Action;
@SpringBootTest
class StudentServiceTest {

	@Autowired
	private StudentService studentservice;
	@MockBean
	private StudentRepository studentrepository;
	
	@BeforeEach
	void setUp()
	{
		Optional<Student> student=Optional.of(new Student(1,"ink",290,"kin"));
		Mockito.when(studentrepository.findById(1)).thenReturn(student);
	}
	
	public void testGetStudentById_Success()
	{
		String studentname="ink";
		Student studentById=studentservice.getOneStudent(1);
		assertEquals(studentname,studentById.getSname());
		
	}

}
