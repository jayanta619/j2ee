package com.jdbc.jdbc1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

/**
 * Hello world!
 *
 */
public class Posts {
	public static void main(String[] args) {

		try {
			Class.forName("com.mysql.cj.jdbc.Driver");

			System.out.println("driver is loaded");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost/test", "root", "");
			System.out.println("connection created");
			for (int j = 90; j < 95; j++) {
//				String q = "delete from posts where id>50";
				String q="select * from posts";
				Statement st = con.createStatement();
//				int i = st.executeUpdate(q);
//				System.out.println("rows affected" + i);
				ResultSet rs = st.executeQuery(q); 
				System.out.println("id\tTitle\tBody");
				while(rs.next()) {
					System.out.println(rs.getString(1)+"\t"+rs.getString(2));
			
			}
		}
		}

		catch (Exception e) {
			e.printStackTrace();
		}
	}
}
