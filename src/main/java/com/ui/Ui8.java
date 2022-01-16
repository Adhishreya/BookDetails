package com.ui;

import com.operations.book.Find;
import com.operations.book.Insert;

public class Ui8 {
	public static void main(String[] args) {
//		String postMessage = "Worst Book Ever!!";
//		int userId = 1;
		Insert insert = new Insert();
//		int postId = insert.addPost(postMessage, userId);

		String commentMessage = "DISGRACE";
		int userId = 2;
		int postId = 1;
		insert.addComments(commentMessage, userId, postId);

//		commentMessage = "Well I felt it too boring";
//		userId = 3;
//		insert.addComments(commentMessage, userId, postId);
	}
}
