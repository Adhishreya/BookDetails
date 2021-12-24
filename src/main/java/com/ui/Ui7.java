package com.ui;

import java.util.List;

import com.details.entity.CategoryEntity;
import com.operations.book.Delete;
import com.operations.book.Find;

public class Ui7 {
	public static void main(String[] args) {
		Delete delete = new Delete();
//		delete.deleteCategory(8);
		
		delete.deleteBookByCatgoryBookID(8, 5);
		
	}
}
