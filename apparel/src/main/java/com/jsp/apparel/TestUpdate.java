package com.jsp.apparel;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;



public class TestUpdate {
	public static void main(String[] args) {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("mudit");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction = entityManager.getTransaction();
		Apparel apparel = entityManager.find(Apparel.class, 3);
		apparel.setMaterial("cotton");//value to be updated
		entityTransaction.begin();
		entityManager.merge(apparel);
		entityTransaction.commit();
	}

}
