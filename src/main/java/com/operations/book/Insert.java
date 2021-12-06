package com.operations.book;

import com.details.entity.BookEntity;
import com.schema.book.Details;
import javax.persistence.EntityManagerFactory;
import com.utility.managers.Utility;
import javax.persistence.Query;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;

public class Insert {
	public void addBook(Details book) {
		BookEntity bookEntity = new BookEntity();
		EntityManagerFactory bookManagerFactory = Utility.createPersistenceInstance();
		EntityManager bookManager = bookManagerFactory.createEntityManager();

		BookEntity entity = new BookEntity();
		Details details = new Details();
		entity.setBookName(book.getBookName());
		entity.setEdition(book.getEdition());
		entity.setIsbn(book.getIsbn());
		entity.setPublisher(book.getPublisher());

		bookManager.getTransaction().begin();
		bookManager.persist(entity);

		bookManager.getTransaction().commit();
//		Utility.disconnectManager();
	}

	public void findAllBooks() {
		BookEntity bookEntity = new BookEntity();
		EntityManagerFactory bookManagerFactory = Utility.createPersistenceInstance();
		EntityManager bookManager = bookManagerFactory.createEntityManager();
		
		String JPQLs = "Select k from BookEntity k";
		
		Query query = bookManager.createQuery(JPQLs);
		
		List<BookEntity> books = query.getResultList();
		List<Details> det = new ArrayList();
		for(BookEntity e : books) {
			Details detail  = new Details();
			detail.setBookName(e.getBookName());
			detail.setEdition(e.getEdition());
			det.add(detail);
		}
		
		
		System.out.println(det);
		
		
	}
}
