package com.operations.book;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Query;

import com.details.entity.BookEntity;
import com.utility.managers.Utility;

public class Delete {
	public void deleteBook(int id) {
		EntityManagerFactory entityManagerFactory = Utility.createPersistenceInstance();
		EntityManager entityManager = entityManagerFactory.createEntityManager();
//		String jpql = "Select k from genres k where k.book_id = ?2";
//		Query query = entityManager.createQuery(jpql);
//		query.setParameter(2, id);
//		
//		Object obj = query.getResultList().get(0);
//		System.out.println(obj);
		entityManager.getTransaction().begin();
		BookEntity etityResult = entityManager.find(BookEntity.class, id);
		if(etityResult != null) {
			entityManager.remove(etityResult);
			entityManager.getTransaction().commit();
		}
	}

}
