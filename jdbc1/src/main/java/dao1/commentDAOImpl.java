package dao1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import dao1. commentDAO ;
import cmmntmodel.Comments;

public class commentDAOImpl implements commentDAO {

	private static Connection con;

	static {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			con = DriverManager.getConnection("jdbc:mysql://localhost/test", "root", "");

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public int insert(Comments comment) {
		int res = -1;
		try {
			PreparedStatement pst = con.prepareStatement("insert into Comments (comment_body) values(?)");
			pst.setString(1,comment.getcomment_Body());
			res = pst.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return res;
	}

	public int update(Comments comment) {
		int res = -1;
		try {
			PreparedStatement pst = con.prepareStatement("update Comments set comment_body = ? where id = ?");

			pst.setString(1,comment.getcomment_Body());
			pst.setInt(2, comment.getId());
			res = pst.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return res;
	}

	public int delete(int id) {
		int res = -1;
		try {
			PreparedStatement pst = con.prepareStatement("delete from Comments where id = ?");
			pst.setInt(1, id);
			res = pst.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return res;
	}

	public List<Comments> view() {

		ArrayList<Comments> list = new ArrayList<Comments>();
		try {
			Statement st = con.createStatement();
			ResultSet rs = st.executeQuery("select * from Comments");
			while (rs.next()) {
				list.add(new Comments(rs.getInt(1), rs.getString(2)));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}

		return list;
	}

	public Comments view(int id) {
		Comments comment = new Comments(id, null);
		try {
			PreparedStatement pst = con.prepareStatement("select * from posts where id = ?");
			pst.setInt(1, id);
			ResultSet rs = pst.executeQuery();
			if (rs.next()) {
				comment = new Comments(rs.getInt(1), rs.getString(2));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return comment;
	}

	
}
