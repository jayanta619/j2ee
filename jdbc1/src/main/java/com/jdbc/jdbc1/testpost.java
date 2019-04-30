package com.jdbc.jdbc1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class testpost {
	public static void main(String[] args) {

		try {
			Class.forName("com.mysql.cj.jdbc.Driver");

			System.out.println("driver is loaded");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost/test", "root", "");
			System.out.println("connection created");
//			String q = "insert into posts values(?,?)";
//				String q="select * from posts";
//			String q = "DELETE FROM posts WHERE ID=?";
			String q = "update posts set post_body=? where id=?";
			Scanner scan = new Scanner(System.in);
			System.out.println("enter id");
			int id = scan.nextInt();
			System.out.println("enter postbody");
			String post_body = scan.next();

			PreparedStatement pst = con.prepareStatement(q);

			pst.setInt(2, id);
			pst.setString(1, post_body);
			int i = pst.executeUpdate();
			System.out.println("rows affected" + i);

		}

		catch (Exception e) {
			e.printStackTrace();
		}
	}
}