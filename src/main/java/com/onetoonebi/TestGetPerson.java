package com.onetoonebi;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class TestGetPerson {
	public static void main(String[] args) {
		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("vikas");
		EntityManager entityManager=entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction=entityManager.getTransaction();
		
		Person person=entityManager.find(Person.class,1);
		System.out.println("Name is "+person.getName());
		System.out.println("Phone is "+person.getPhone());
		System.out.println("Email is "+person.getEmail());
		Pan pan=person.getPan();
		System.out.println("Pan num is "+pan.getPan_num());
		System.out.println("Address is "+pan.getAddress());
		
	}
}
