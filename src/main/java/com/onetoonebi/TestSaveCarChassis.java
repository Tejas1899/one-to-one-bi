package com.onetoonebi;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class TestSaveCarChassis {
public static void main(String[] args) {
	EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("vikas");
	EntityManager entityManager=entityManagerFactory.createEntityManager();
	EntityTransaction entityTransaction=entityManager.getTransaction();
	
	Vehicle vehicle=new Vehicle();
	vehicle.setName("XUV 300");
	vehicle.setCost(500000);
	
	Chassis chassis=new Chassis();
	chassis.setChassis_no("IHSUHDUIK595");
	chassis.setType("Rally");
	
	vehicle.setChassis(chassis);
	
	entityTransaction.begin();
	entityManager.persist(vehicle);
	entityTransaction.commit();
}
}
