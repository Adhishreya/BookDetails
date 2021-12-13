package com.operations.book;

import com.details.entity.AuthorEntity;
import com.details.entity.BookEntity;
import com.details.entity.CategoryEntity;
import com.details.entity.UserEntity;
import com.schema.book.Author;
import com.schema.book.Category;
import com.schema.book.Details;
import com.schema.book.Users;

import javax.persistence.EntityManagerFactory;
import com.utility.managers.Utility;
import javax.persistence.Query;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;

public class Insert {
	public void addBook(Details book) {
		EntityManagerFactory bookManagerFactory = Utility.createPersistenceInstance();
		EntityManager bookManager = bookManagerFactory.createEntityManager();

		BookEntity entity = new BookEntity();
		entity.setBookName(book.getBookName());
		entity.setEdition(book.getEdition());
		entity.setIsbn(book.getIsbn());
		entity.setPublisher(book.getPublisher());
		entity.setImage(book.getImage());

		bookManager.getTransaction().begin();
		bookManager.persist(entity);

		bookManager.getTransaction().commit();
//		Utility.disconnectManager();
	}
	
	public void addUsers(Users user) {
		UserEntity entity = new UserEntity();
		EntityManagerFactory userManagerFactory = Utility.createPersistenceInstance();
		EntityManager userManager = userManagerFactory.createEntityManager();

		
		entity.setEmail(user.getEmail());
		entity.setName(user.getName());
		entity.setHash(user.getHash());
		entity.setSalt(user.getSalt());


		userManager.getTransaction().begin();
		userManager.persist(entity);

		userManager.getTransaction().commit();
	}
	public void addCategory(Category category) {
		CategoryEntity entity = new CategoryEntity();
		EntityManagerFactory categoryManagerFactory = Utility.createPersistenceInstance();
		EntityManager categoryManager = categoryManagerFactory.createEntityManager();
		
		
		entity.setCategoryID(category.getCategoryID());
		entity.setCategory(category.getCategory());
		entity.setBooks(category.getBooks());



		categoryManager.getTransaction().begin();
		categoryManager.persist(entity);

		categoryManager.getTransaction().commit();
	}
	public void addAuthor(Author author) {
		AuthorEntity entity = new AuthorEntity();
		EntityManagerFactory authorManagerFactory = Utility.createPersistenceInstance();
		EntityManager authorManager = authorManagerFactory.createEntityManager();
		
		entity.setName(author.getName());

		authorManager.getTransaction().begin();
		authorManager.persist(entity);

		authorManager.getTransaction().commit();
	}
	
	

	
	
	
}
