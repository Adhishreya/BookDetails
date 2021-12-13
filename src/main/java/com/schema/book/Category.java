package com.schema.book;

import java.util.List;

import com.details.entity.BookEntity;

public class Category {
	@Override
	public String toString() {
		return "Category [categoryID=" + categoryID + ", category=" + category + ", books=" + books + "]";
	}
	private int categoryID;
	private String category;
	private List<BookEntity> books;
	public int getCategoryID() {
		return categoryID;
	}
	public void setCategoryID(int categoryID) {
		this.categoryID = categoryID;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public List<BookEntity> getBooks() {
		return books;
	}
	public void setBooks(List<BookEntity> books) {
		this.books = books;
	}
}
