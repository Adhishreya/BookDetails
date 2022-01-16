package com.schema.book;

public class Details {
	private String bookName;
	private String isbn;
	private String publisher;
	private Double edition;
	private int id;
	private String image;
	private Double price;
	
	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
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

	public Double getEdition() {
		return edition;
	}

	@Override
	public String toString() {
		return "Details [bookName=" + bookName + ", isbn=" + isbn + ", publisher=" + publisher + ", edition=" + edition
				+ ", id=" + id + "]";
	}

	public void setEdition(Double edition) {
		this.edition = edition;
	}
}
