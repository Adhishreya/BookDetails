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
	public void addBook(Details book,String category,String author) {
		EntityManagerFactory bookManagerFactory = Utility.createPersistenceInstance();
		EntityManager bookManager = bookManagerFactory.createEntityManager();

		BookEntity entity = new BookEntity();
		entity.setBookName(book.getBookName());
		entity.setEdition(book.getEdition());
		entity.setIsbn(book.getIsbn());
		entity.setPublisher(book.getPublisher());
		entity.setImage(book.getImage());

		Find find = new Find();
		Category categoryResult = find.findCategory(category);
		AuthorEntity authorEntity = find.findAuthor(author);
		
		List<BookEntity> categoryList;
		AuthorEntity aEntity;
		
		bookManager.getTransaction().begin();
		
		if(categoryResult!=null) {
			CategoryEntity cEntity  = bookManager.find(CategoryEntity.class, categoryResult.getCategoryID());
			categoryList = cEntity.getBooks();
		}else {
			Category cat = new Category();
			cat.setCategory(category);
			int catID = addCategory(cat);
			CategoryEntity cEntity  = bookManager.find(CategoryEntity.class, catID);
			categoryList = cEntity.getBooks();
		}
		
		if(authorEntity!=null) {
			aEntity = bookManager.find(AuthorEntity.class, authorEntity.getAuthorID());
		}else {
			Author auth = new Author();
			auth.setName(author);
			int authID = addAuthor(auth);
			aEntity = bookManager.find(AuthorEntity.class, authID);
		}
		
		entity.setAuthor(aEntity);
		categoryList.add(entity);

		bookManager.getTransaction().commit();
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

	public int addCategory(Category category) {
		CategoryEntity entity = new CategoryEntity();
		EntityManagerFactory categoryManagerFactory = Utility.createPersistenceInstance();
		EntityManager categoryManager = categoryManagerFactory.createEntityManager();

		entity.setCategoryID(category.getCategoryID());
		entity.setCategory(category.getCategory());
		entity.setBooks(category.getBooks());

		categoryManager.getTransaction().begin();
		categoryManager.persist(entity);

		categoryManager.getTransaction().commit();

		return entity.getCategoryID();
	}

	public int addAuthor(Author author) {
		AuthorEntity entity = new AuthorEntity();
		EntityManagerFactory authorManagerFactory = Utility.createPersistenceInstance();
		EntityManager authorManager = authorManagerFactory.createEntityManager();

		entity.setName(author.getName());

		authorManager.getTransaction().begin();
		authorManager.persist(entity);

		authorManager.getTransaction().commit();
		
		return entity.getAuthorID();
	}

}
