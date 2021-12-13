package com.ui;

import java.util.List;

import com.operations.book.Find;
import com.operations.book.Insert;
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
//	author.setName("J.K.Rowling");
//	insert.addAuthor(author);
	
	Find find  = new Find();
	System.out.println(find.findAuthor("%Rowling%"));
//	List<Category> cat = find.findCategory(5);
//	for(Category c: cat) {
//		System.out.println(c);
//	}
	
//	List<Details> cat = find.findBookAndPublisher();
//	for(Details c: cat) {
//		System.out.println(c);
//	}
}
}
