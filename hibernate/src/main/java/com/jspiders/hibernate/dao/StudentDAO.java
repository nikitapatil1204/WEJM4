package com.jspiders.hibernate.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.jspiders.hibernate.dto.StudentDTO;

public class StudentDAO {
	public static void main(String[] args) {
		
	
	EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("student");
	EntityManager entityManager= entityManagerFactory.createEntityManager();
	EntityTransaction entityTransaction=entityManager.getTransaction();
	entityTransaction.begin();
	StudentDTO student = new StudentDTO();
	student.setId(1);
	student.setName("Nikita");
	student.setEmail("nikita12@gmail.com");
	student.setContact(8605638815L);
	student.setCity("pune");
    entityManager .persist(student);
	entityTransaction.commit();
	entityManagerFactory.close();
	entityManager.close();
	
    
	}
}
