package com.operations.book;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Query;

import com.details.entity.AuthorEntity;
import com.details.entity.BookEntity;
import com.details.entity.CategoryEntity;
import com.schema.book.Author;
import com.schema.book.Category;
import com.schema.book.Details;
import com.utility.managers.Utility;

public class Update {
//	public void updateBookAuthor(int id,String author) {
//		BookEntity bookEntity = new BookEntity();
//		EntityManagerFactory bookManagerFactory = Utility.createPersistenceInstance();
//		EntityManager bookManager = bookManagerFactory.createEntityManager();
//
////		String JPQLs = "Update BookEntity k set k.image ?1 where k.id =?2"/;
//
//		Find find  = new Find();
//		Author auth = find.findAuthor("%Rowling%");
//		System.out.println(auth);
//		String JPQLs = "Update BookEntity k set k.author.authorID = ?1 where k.id = ?2";
//		Query query = bookManager.createQuery(JPQLs);
//		query.setParameter(1, auth.getAuthorID());
//		query.setParameter(2, id);
//		
////		Query query = bookManager.createQuery(JPQLs);
//
//		bookManager.getTransaction().begin();
////		bookManager.persist(entity);
//		int result = query.executeUpdate();
//
//		bookManager.getTransaction().commit();
//		System.out.println("records updated = "+result);
////		Utility.disconnectManager();
//	}
//	public void updateBookAuthor(int id,String author) {
//		BookEntity bookEntity = new BookEntity();
//		EntityManagerFactory bookManagerFactory = Utility.createPersistenceInstance();
//		EntityManager bookManager = bookManagerFactory.createEntityManager();
//		
//		Find find  = new Find();
//		AuthorEntity authorResult = find.findAuthor("%"+author+"%");
//		
////		String JPQL = "Update BookEntity k set k.author_id = ?2 where k.id = ?1";
////		
////		Query query = bookManager.createQuery(JPQL);
////		query.setParameter(1, id);
////		query.setParameter(2, authorResult.getAuthorID());
//		
////		String JPQLs = "Update BookEntity k set k.image ?1 where k.id =?2";
//
////		Query query = bookManager.createQuery(JPQLs);
////		query.setParameter(1, e);
//		
////		Query query = bookManager.createQuery(JPQLs);
//		System.out.println(authorResult.getAuthorID());
//
//		bookManager.getTransaction().begin();
//		BookEntity detail = bookManager.find(BookEntity.class, id);
////		bookManager.getTransaction().begin();
//		AuthorEntity ae = bookManager.find(AuthorEntity.class, authorResult.getAuthorID());
//		detail.setAuthor(ae);
//				
//		bookManager.getTransaction().commit();
//	}
	
	public void updateCategory(String category) {
		EntityManagerFactory categoryFactory = Utility.createPersistenceInstance();
		EntityManager categoryManager = categoryFactory.createEntityManager();
		Find find = new Find();
		categoryManager.getTransaction().begin();
		Category cat =  find.findCategory(category);
		
		CategoryEntity ce = categoryManager.find(CategoryEntity.class,cat.getCategoryID());
		System.out.println(ce.getCategoryID());
		BookEntity be = categoryManager.find(BookEntity.class,6 );
		List <BookEntity> bList = ce.getBooks();
		
		bList.add(be);
		categoryManager.getTransaction().commit();
	}
	
}
