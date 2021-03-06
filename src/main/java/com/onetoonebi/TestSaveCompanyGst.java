package com.onetoonebi;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class TestSaveCompanyGst {
	public static void main(String[] args) {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("vikas");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction = entityManager.getTransaction();

		Company company = new Company();
		company.setName("TCS");
		company.setWebsite("tcs.com");
		Gst gst = new Gst();
		gst.setGstno("JAIDJ6663");
		gst.setState("Karnataka");
		company.setGst(gst);
		gst.setCompany(company);

		entityTransaction.begin();
		entityManager.persist(company);
		entityManager.persist(gst);
		entityTransaction.commit();

	}
}
