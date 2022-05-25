package com.onetoonebi;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class TestGetVehicle {
public static void main(String[] args) {
	EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("vikas");
	EntityManager entityManager=entityManagerFactory.createEntityManager();
	EntityTransaction entityTransaction=entityManager.getTransaction();
	
	Vehicle vehicle=entityManager.find(Vehicle.class, 2);
	if(vehicle!=null)
	{
		System.out.println("The name is :"+vehicle.getName());
		System.out.println("The cost is :"+vehicle.getCost());
		Chassis chassis=vehicle.getChassis();
		System.out.println("The Chassis no is :"+chassis.getChassis_no());
		System.out.println("The type is :"+chassis.getType());
	}
	else
	{
		System.out.println("No vehicle available");
	}
}
}
