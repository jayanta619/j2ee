package callable;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Types;
import java.util.Scanner;

import java.sql.CallableStatement;

public class Test {
	public static void main(String[] args) {

		try {
			Class.forName("com.mysql.cj.jdbc.Driver");

			System.out.println("driver is loaded");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost/test", "root", "");
			System.out.println("connection created");
//			CallableStatement cst=   con.prepareCall("call updatepost_body(?,?)");
//			cst.setInt(1,3);
//			cst.setString(2,"newpost");
//			cst.registerOutParameter(2,Types.VARCHAR);
			
//			
//			CallableStatement cst1=   con.prepareCall("call insertpost_body(?,?)");
//			cst1.setInt(1,1);
//			cst1.setString(2,"sugar");
//			cst1.registerOutParameter(2,Types.VARCHAR);
//			
			CallableStatement cst2=   con.prepareCall("call deletepost_body(?)");
			cst2.setInt(1,3);
			cst2.registerOutParameter(1,Types.INTEGER);
			int res=cst2.executeUpdate();
	
			String post=cst2.getString(1);
			System.out.println(post);
		}

		catch (Exception e) {
			e.printStackTrace();
		}
	}
}