package com.schema.book;

public class Details {
	private String bookName;
	private String isbn;
	private String publisher;
	private double edition;
	private int id;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getBookName() {
		return bookName;
	}

	public void setBookName(String bookName) {
		this.bookName = bookName;
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

	@Override
	public String toString() {
		return "Details [bookName=" + bookName + ", isbn=" + isbn + ", publisher=" + publisher + ", edition=" + edition
				+ ", id=" + id + "]";
	}

	public void setEdition(double edition) {
		this.edition = edition;
	}
}
