package com.ui;

import java.util.List;

import com.details.entity.CategoryEntity;
import com.operations.book.Find;

public class Ui7 {
	public static void main(String[] args) {
		Find find = new Find();
		List<CategoryEntity> catList = find.findCategory(7);
		System.out.println(catList.get(0));
	}
}
