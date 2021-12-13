package com.schema.book;

public class Author {
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
	@Override
	public String toString() {
		return "Author [authorID=" + authorID + ", name=" + name + "]";
	}
	public void setName(String name) {
		this.name = name;
	}

}
