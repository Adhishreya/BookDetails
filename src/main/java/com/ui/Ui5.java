package com.ui;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;

import com.details.entity.AuthorEntity;
import com.details.entity.BookEntity;
import com.details.entity.CategoryEntity;
import com.operations.book.Update;
import com.utility.managers.Utility;

public class Ui5 {
	public static void main(String[] args) {
		EntityManagerFactory entityManagerFactory = Utility.createPersistenceInstance();
		EntityManager manager = entityManagerFactory.createEntityManager();
		manager.getTransaction().begin();

		Update update = new Update();
		update.updateBookPrice(3, 236.55);
		
	}
}
