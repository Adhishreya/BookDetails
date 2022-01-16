package com.details.entity;

import javax.persistence.*;

@Entity
@Table(name = "book_details")
@NamedQueries({ @NamedQuery(name = "findNameAndPublisher", query = "Select k.bookName,k.publisher from BookEntity k") })
public class BookEntity {
	private String bookName;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String isbn;
	@Column(name = "publisher")
	private String publisher;
	private Double edition;
	private String image;

	private Double price;

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	// one author can write many books and one book can be co-authored by multiple
	// authors
//	@ManyToMany(cascade = CascadeType.ALL,mappedBy = "authors")
	// cascade all would result in an error

	@ManyToOne(cascade = CascadeType.PERSIST)
	@JoinColumn(name = "author_id", unique = false)
	private AuthorEntity author;

	public AuthorEntity getAuthor() {
		return author;
	}

//	@ManyToOne(cascade = CascadeType.ALL)
//	private CategoryEntity category;
//	

	public void setAuthor(AuthorEntity author) {
		this.author = author;
	}

//	public CategoryEntity getCategory() {
//		return category;
//	}
//
//	public void setCategory(CategoryEntity category) {
//		this.category = category;
//	}


	public String getImage() {
		return image;
	}

	public void setImage(String image) {
		this.image = image;
	}

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

	public Double getEdition() {
		return edition;
	}

	public void setEdition(Double edition) {
		this.edition = edition;
	}

}
