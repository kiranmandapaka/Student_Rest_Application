package com.rest.repository;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.autoconfigure.orm.jpa.TestEntityManager;

import com.rest.model.Student;
@DataJpaTest
@AutoConfigureTestDatabase(replace=AutoConfigureTestDatabase.Replace.NONE)
class StudentRepositoryTest {
	@Autowired
	private StudentRepository studentrepository;

	@Autowired
	private TestEntityManager entitymanger;
	
	@BeforeEach
	void setUp() {
		Student studententity= new Student(44,"xyz",300,"dlf");
		entitymanger.persist(studententity);
	}
	@Test
	public void testFindById()
	{
		Student studententity=studentrepository.findById(44).get();
		assertEquals("xyz", studententity.getSname());
	}
	
}
