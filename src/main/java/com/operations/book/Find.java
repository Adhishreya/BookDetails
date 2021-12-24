package com.operations.book;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Query;

import com.details.entity.AuthorEntity;
import com.details.entity.BookEntity;
import com.details.entity.CategoryEntity;
import com.details.entity.Comments;
import com.details.entity.PostEntity;
import com.details.entity.UserEntity;
import com.schema.book.Author;
import com.schema.book.Category;
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
			detail.setImage(e.getImage());
			detail.setPrice(e.getPrice());
			det.add(detail);
		}

		System.out.println(det);
		return det;

	}

	public Details findBooksId(int id) {
		BookEntity bookEntity = new BookEntity();
		EntityManagerFactory bookManagerFactory = Utility.createPersistenceInstance();
		EntityManager bookManager = bookManagerFactory.createEntityManager();

		String JPQLs = "Select k from BookEntity k where k.id = ?";

		Query query = bookManager.createQuery(JPQLs);
		query.setParameter(1, id);

		List<BookEntity> books = query.getResultList();
		List<Details> det = new ArrayList();
		for (BookEntity e : books) {
			Details detail = new Details();
			detail.setBookName(e.getBookName());
			detail.setEdition(e.getEdition());
			detail.setPublisher(e.getPublisher());
			detail.setImage(e.getImage());
			det.add(detail);
		}

		System.out.println(det);
		return det.get(0);

	}

//	public List findUsersByEmail(String email) {
//		UserEntity entity = new UserEntity();
//		EntityManagerFactory userManagerFactory = Utility.createPersistenceInstance();
//		EntityManager userManager = userManagerFactory.createEntityManager();
//
//		String JPQLs = "Select k.hash,h.salt from UserEntity k where k.email = ?1";
//
//		Query query = userManager.createQuery(JPQLs);
//		query.setParameter(1, email);
//
//		List<UserEntity> books = query.getResultList();
//		List<Details> det = new ArrayList();
//		for (BookEntity e : books) {
//			Details detail = new Details();
//			detail.setBookName(e.getBookName());
//			detail.setEdition(e.getEdition());
//			detail.setPublisher(e.getPublisher());
//			detail.setImage(e.getImage());
//			det.add(detail);
//		}
//
//		System.out.println(det);
//		return det;
//	}
	public AuthorEntity findAuthor(String author) {
		EntityManagerFactory authorManagerFactory = Utility.createPersistenceInstance();
		EntityManager authorManager = authorManagerFactory.createEntityManager();

		Query query = authorManager.createNamedQuery("findAuthor");
		query.setParameter(1, "%" + author + "%");
		List<AuthorEntity> authors = query.getResultList();
		if (authors.isEmpty()) {
			return null;
		}
//		authors.get(0);
//		
//		Author authorResult = new Author();
//		authorResult.setName(authors.get(0).getName());

//		return authorResult;
		return authors.get(0);

	}

	public List findCategory(int id) {
		EntityManagerFactory categoryManagerFactory = Utility.createPersistenceInstance();
		EntityManager categoryManager = categoryManagerFactory.createEntityManager();

		Query query = categoryManager.createNamedQuery("findById");
		query.setParameter(1, id);

		List<CategoryEntity> categories = query.getResultList();
		List<Category> caregoryList = new ArrayList();
		for (CategoryEntity ent : categories) {
			Category cat = new Category();
			cat.setCategory(ent.getCategory());
			cat.setBooks(ent.getBooks());
			cat.setCategoryID(ent.getCategoryID());
			caregoryList.add(cat);
		}
		return caregoryList;
	}

	public List findBookAndPublisher() {
		EntityManagerFactory bookManagerFactory = Utility.createPersistenceInstance();
		EntityManager bookManager = bookManagerFactory.createEntityManager();
		Query query = bookManager.createNamedQuery("findNameAndPublisher");
		List<AuthorEntity> authors = query.getResultList();

		List<BookEntity> books = query.getResultList();
		List<Details> det = new ArrayList();
		for (Object e : books) {
			Object objs[] = (Object[]) e;
			Details detail = new Details();
			detail.setBookName((String) objs[0]);
			detail.setPublisher((String) objs[1]);
			det.add(detail);
		}
		return det;
	}

	public Category findCategory(String category) {
		EntityManagerFactory categoryFactory = Utility.createPersistenceInstance();
		EntityManager categoryManager = categoryFactory.createEntityManager();

		Query query = categoryManager.createNamedQuery("findByName");
		query.setParameter(1, "%" + category + "%");
		List<CategoryEntity> catEntityList = query.getResultList();

		List<Category> catList = new ArrayList();
		for (CategoryEntity cat : catEntityList) {
			Category c = new Category();
			c.setCategory(cat.getCategory());
			c.setBooks(cat.getBooks());
			c.setCategoryID(cat.getCategoryID());
			catList.add(c);
		}
		if (catList.isEmpty()) {
			return null;
		}
		return catList.get(0);

	}

	public void findCategoryAndBook(int id) {
//		String query = "Select k.book"
	}

	public void findPosts(int id) {
		EntityManagerFactory postManagerFactory = Utility.createPersistenceInstance();
		EntityManager postManager = postManagerFactory.createEntityManager();

//		PostEntity postEntity = postManager.find(PostEntity.class,id);
		String jpql = "Select post from Comments post where post.id = ?1";

		Query query = postManager.createQuery(jpql);
		query.setParameter(1, id);

		List<Comments> postList = query.getResultList();

		System.out.println(postList.get(0));
	}

	public void findJoinCategoryAndBook(int bookId) {
		EntityManagerFactory entityManagerFactory = Utility.createPersistenceInstance();
		EntityManager entityManager = entityManagerFactory.createEntityManager();

//		String jpql = "Select book.,category from BookEntity join CategoryEntity category";
		String jpql = "Select category.books from CategoryEntity category where category.id = 5 ";
		Query query = entityManager.createQuery(jpql);

		List<Object> objRes = query.getResultList();

		for (Object obj : objRes) {
//			Object[] objArrays = (Object[]) obj;
			BookEntity bookEntity = (BookEntity) obj;
//			CategoryEntity catEntity = (CategoryEntity) objArrays[1];
			Details detail = new Details();
			detail.setBookName(bookEntity.getBookName());
			System.out.println(detail);
//			Category category = new Category();
//			category.setCategory(catEntity.getCategory());
		}
	}
}
