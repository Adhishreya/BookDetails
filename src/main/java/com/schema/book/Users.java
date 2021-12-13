package com.schema.book;

public class Users {
	private String name;
	private byte[] hash;
	private String email;

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	private byte[] salt;

	public void setHash(byte[] hash) {
		this.hash = hash;
	}

	public void setSalt(byte[] salt) {
		this.salt = salt;
	}

	public byte[] getHash() {
		return hash;
	}

	public byte[] getSalt() {
		return salt;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
