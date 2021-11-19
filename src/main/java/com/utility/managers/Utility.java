package com.utility.managers;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import javax.persistence.PersistenceContext;
public class Utility {
private EntityManagerFactory entityManagerFactory= null;
public EntityManagerFactory createPersistenceInstance()
{	
	if(entityManagerFactory == null)
		entityManagerFactory = Persistence.createEntityManagerFactory("unit1");
	return entityManagerFactory;
}
}
