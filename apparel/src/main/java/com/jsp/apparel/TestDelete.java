package com.jsp.apparel;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class TestDelete {
	public static void main(String[] args) {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("mudit");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction = entityManager.getTransaction();
	    Apparel  apparel =  entityManager.find(Apparel.class, 2);
	    if(apparel!=null) {
	    	entityTransaction.begin();
	    	entityManager.remove(apparel);
	    	entityTransaction.commit();
	    	
	    }else {
			System.out.println(" not deleted");
		}
	}

}
