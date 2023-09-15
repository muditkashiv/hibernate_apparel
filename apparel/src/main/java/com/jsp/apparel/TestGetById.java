package com.jsp.apparel;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class TestGetById {
	public static void main(String[] args) {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("mudit");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		Apparel apparel =entityManager.find(Apparel.class, 1);
		System.out.println(apparel.getId());
		System.out.println(apparel.getName());
		System.out.println(apparel.getMaterial());
		System.out.println(apparel.getBrand());
		System.out.println(apparel.getPrice());
	}

}
