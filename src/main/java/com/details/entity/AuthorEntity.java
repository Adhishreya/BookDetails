package com.details.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

@Entity
@Table(name = "authors")
@NamedQueries({ @NamedQuery(name = "findAuthor", query = "from AuthorEntity e where e.name like :name") })
public class AuthorEntity {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int authorID;
	private String name;

	public int getAuthorID() {
		return authorID;
	}

	public void setAuthorID(int authorID) {
		this.authorID = authorID;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
