package com.ui;

import java.util.List;

import com.operations.book.Find;
import com.operations.book.Insert;
import com.operations.book.Update;
import com.schema.book.Author;
import com.schema.book.Category;
import com.schema.book.Details;

public class Ui {
public static void main(String[] args) {
	Insert insert = new Insert();
//	Category category = new Category();
//	category.setCategory("Crime and Thrillers");
//	
//	insert.addCategory(category);
	
//	Author author = new Author();
//	author.setName("Charles Dikenson");
//	insert.addAuthor(author);
//	
	Find find  = new Find();
//	System.out.println(find.findAuthor("%Rowling%"));
//	List<Category> cat = find.findCategory(5);
//	for(Category c: cat) {
//		System.out.println(c);
//	}
	
//	List<Details> cat = find.findBookAndPublisher();
//	for(Details c: cat) {
//		System.out.println(c);
//	}
	
	Update update = new Update();
	update.updateCategory("Crime");
//	update.updateBookAuthor(1, "Rowling");
//	System.out.println(find.updateCategory("Crime"));
}
}
