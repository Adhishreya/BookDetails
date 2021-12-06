package com.details.entity;

import javax.persistence.*;

@Entity
@Table(name = "book_details")
public class BookEntity {
	private String bookName;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id ;
//	= PRIMARY.AUTO
	private String isbn;
	@Column(name = "publisher")
	private String publisher;
	private double edition;

	public String getBookName() {
		return bookName;
	}

	public void setBookName(String bookName) {
		this.bookName = bookName;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getIsbn() {
		return isbn;
	}

	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}

	public String getPublisher() {
		return publisher;
	}

	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}

	public double getEdition() {
		return edition;
	}

	public void setEdition(double edition) {
		this.edition = edition;
	}

}
