package com.onetoonebi;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class TestGetPan {
	public static void main(String[] args) {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("vikas");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction = entityManager.getTransaction();

		Pan pan = entityManager.find(Pan.class, 1);
		System.out.println("Pan num is " + pan.getPan_num());
		System.out.println("Address is " + pan.getAddress());
		System.out.println("--------------------------------");
		Person person = pan.getPerson();

		System.out.println("Name is " + person.getName());
		System.out.println("Phone is " + person.getPhone());
		System.out.println("Email is " + person.getEmail());
	}
}
