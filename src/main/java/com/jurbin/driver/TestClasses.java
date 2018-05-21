package com.jurbin.driver;

import javax.persistence.Entity;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.blog.hbm.pojo.Employees;

public class TestClasses {

	public static void main(String[] args) {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("persistenceUnit");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		
		Employees employee = entityManager.find(Employees.class, new Long(14));
		System.out.println(employee.getFirstName());
	}

}
