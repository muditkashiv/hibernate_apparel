package com.jsp.apparel;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class TestSave {
	public static void main(String[] args) {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("mudit");
		EntityManager entityManager =entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction = entityManager.getTransaction();
		Apparel apparel = new Apparel();
		//apparel.setId(1);
		apparel.setName("shorts");
		apparel.setMaterial("denim");
		apparel.setBrand("old navy");
		apparel.setPrice(1235.99);
		entityTransaction.begin();
		entityManager.persist(apparel);
		entityTransaction.commit();
	}

}
