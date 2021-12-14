package com.details.entity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "category")
@NamedQueries({ @NamedQuery(name = "findById", query = "Select K from CategoryEntity K where K.categoryID =?1"),
		@NamedQuery(name = "findByName", query = "select k from CategoryEntity k where k.category like ?1") })
public class CategoryEntity {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int categoryID;
	private String category;

	@OneToMany(cascade = CascadeType.PERSIST)
	@JoinTable(name = "genres", joinColumns = { @JoinColumn(name = "genre_id") }, inverseJoinColumns = {
			@JoinColumn(name = "book_id", unique = true) })
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
