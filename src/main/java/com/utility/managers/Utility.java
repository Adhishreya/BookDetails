package com.utility.managers;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import javax.persistence.PersistenceContext;

public class Utility {
	private static EntityManagerFactory entityManagerFactory;

	public static EntityManagerFactory createPersistenceInstance() {
		if (entityManagerFactory == null)
			entityManagerFactory = Persistence.createEntityManagerFactory("unit1");
		return entityManagerFactory;
	}

	public static void disconnectManager() {
		if (entityManagerFactory != null || entityManagerFactory.isOpen() == true)
			entityManagerFactory.close();
	}
}
