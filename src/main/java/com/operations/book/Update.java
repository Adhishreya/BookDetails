package com.operations.book;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Query;

import com.details.entity.BookEntity;
import com.schema.book.Details;
import com.utility.managers.Utility;

public class Update {
	public void updateBook(Details book) {
		BookEntity bookEntity = new BookEntity();
		EntityManagerFactory bookManagerFactory = Utility.createPersistenceInstance();
		EntityManager bookManager = bookManagerFactory.createEntityManager();

		String JPQLs = "Update BookEntity k set k.image ?1 where k.id =?2";

		Query query = bookManager.createQuery(JPQLs);
//		query.setParameter(1, e);
		
//		Query query = bookManager.createQuery(JPQLs);

		bookManager.getTransaction().begin();
//		bookManager.persist(entity);

		bookManager.getTransaction().commit();
//		Utility.disconnectManager();
	}
	public void updateBookAuthor(Details book) {
		BookEntity bookEntity = new BookEntity();
		EntityManagerFactory bookManagerFactory = Utility.createPersistenceInstance();
		EntityManager bookManager = bookManagerFactory.createEntityManager();

//		String JPQLs = "Update BookEntity k set k.image ?1 where k.id =?2";

		Query query = bookManager.createQuery(JPQLs);
//		query.setParameter(1, e);
		
//		Query query = bookManager.createQuery(JPQLs);

		bookManager.getTransaction().begin();
//		bookManager.persist(entity);

		bookManager.getTransaction().commit();
//		Utility.disconnectManager();
	}
	
}
