package com.schema.book;

public class Details {
	private String bookName;
	private String isbn;
	private String publisher;
	private double edition;
	private int id;
	private String image;
	private double price;
	
	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public String getImage() {
		return image;
	}

	public void setImage(String image) {
		this.image = image;
	}

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
