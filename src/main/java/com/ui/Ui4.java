package com.ui;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;

import com.details.entity.AuthorEntity;
import com.details.entity.BookEntity;
import com.details.entity.CategoryEntity;
import com.utility.managers.Utility;

public class Ui4 {
	public static void main(String[] args) {
		EntityManagerFactory entityManagerFactory = Utility.createPersistenceInstance();
		EntityManager manager = entityManagerFactory.createEntityManager();
		manager.getTransaction().begin();

		BookEntity booke = manager.find(BookEntity.class, 1);

		AuthorEntity auth = manager.find(AuthorEntity.class, 1);

		booke.setAuthor(auth);

		CategoryEntity category = manager.find(CategoryEntity.class, 5);

		List<BookEntity> list = category.getBooks();

		list.add(booke);

		manager.getTransaction().commit();
//		manager.persist(booke);
//		mana
	}
}
