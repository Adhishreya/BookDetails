package com.operations.book;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Query;

import com.details.entity.BookEntity;
import com.schema.book.Details;
import com.utility.managers.Utility;

public class Find {
	public List findAllBooks() {
		BookEntity bookEntity = new BookEntity();
		EntityManagerFactory bookManagerFactory = Utility.createPersistenceInstance();
		EntityManager bookManager = bookManagerFactory.createEntityManager();

		String JPQLs = "Select k from BookEntity k";

		Query query = bookManager.createQuery(JPQLs);

		List<BookEntity> books = query.getResultList();
		List<Details> det = new ArrayList();
		for (BookEntity e : books) {
			Details detail = new Details();
			detail.setBookName(e.getBookName());
			detail.setEdition(e.getEdition());
			detail.setPublisher(e.getPublisher());
			det.add(detail);
		}

		System.out.println(det);
		return det;

	}
}
