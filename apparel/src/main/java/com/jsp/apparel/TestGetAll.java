package com.jsp.apparel;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;



public class TestGetAll {
	public static void main(String[] args) {
		EntityManagerFactory entityManagerFactory =Persistence.createEntityManagerFactory("mudit");
		EntityManager entityManager =entityManagerFactory.createEntityManager();
		String sql = "SELECT e FROM Apparel e";
		Query query =entityManager.createQuery(sql);
		@SuppressWarnings("unchecked")
		List<Apparel> apparel = query.getResultList();
		for (Apparel a : apparel) {
			System.out.println("====================================");
			System.out.println(a.getId());
			System.out.println(a.getName());
			System.out.println(a.getMaterial());
			System.out.println(a.getBrand());
			System.out.println(a.getPrice());
			System.out.println("=======================================");
		}
	}
	}


