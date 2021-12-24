package com.ui;

import com.operations.book.Insert;

public class Ui8 {
	public static void main(String[] args) {
		String postMessage = "What a lame story!";
		int userId = 2;
		Insert insert = new Insert();

		int postId = insert.addPost(postMessage, userId);

		String commentMessage = "That's really rude";
		userId = 1;
		insert.addComments(commentMessage, userId, postId);

		commentMessage = "Well I felt it too boring";
		userId = 3;
		insert.addComments(commentMessage, userId, postId);
	}
}
