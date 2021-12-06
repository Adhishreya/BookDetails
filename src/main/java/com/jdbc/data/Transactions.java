package com.jdbc.data;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.schema.book.Details;

public class Transactions {
	private static PreparedStatement prepStmt;
	private static Connection conn;

	public void insertData(Details detail) throws SQLException, ClassNotFoundException {
//		Class.forName("com.mysql.cj.jdbc.Driver");
		String SQL = "Insert into bookDetails (bookName,isbn,publisher,edition) values(?,?,?,?)";
		conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/bookdetails", "root", "297099*adhiS");
		prepStmt = conn.prepareStatement(SQL);
		prepStmt.setString(1, detail.getBookName());
		prepStmt.setString(2, detail.getIsbn());
		prepStmt.setString(3, detail.getPublisher());
		prepStmt.setDouble(4, detail.getEdition());
		prepStmt.execute();
		if (conn != null) {
			conn.close();
		}
	}

	public static List<Details> getDetails() throws SQLException {
		String SQL = "Select * from bookDetails";
		conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/bookDetails", "root", "297099*adhiS");
		prepStmt = conn.prepareStatement(SQL);
		ResultSet result = prepStmt.executeQuery();
		List<Details> queryList = new ArrayList<>();
		Details details = null;
		while (result.next()) {
			details = new Details();
			details.setBookName(result.getString("bookName"));
			details.setEdition(result.getDouble("edition"));
			details.setIsbn(result.getString("isbn"));
			details.setPublisher(result.getString("publisher"));

			queryList.add(details);
		}
		if (conn != null) {
			conn.close();
		}
		return queryList;
	}

}
