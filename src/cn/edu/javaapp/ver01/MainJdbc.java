package cn.edu.javaapp.ver01;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class MainJdbc {

	public static void main(String[] args) {
		String driver = "com.mysql.jdbc.Driver";
		String url = "jdbc:mysql://localhost:3306/fuhbdb";
		String username = "root";
		String password = "";
		try {
			Class.forName(driver);// classLoader,���ض�Ӧ����
			Connection conn = (Connection) DriverManager.getConnection(url, username, password);
			String sql = "select * from users";
			PreparedStatement pstmt = (PreparedStatement) conn.prepareStatement(sql);
			ResultSet rs = pstmt.executeQuery();
			System.out.println("id	name	address	level	org	order");
			while (rs.next()) {
				System.out.print(rs.getInt("id"));
				System.out.print("\t");
				System.out.print(rs.getString("name"));
				System.out.print("\t");
				System.out.print(rs.getString("address"));
				System.out.print("\t");
				System.out.print(rs.getString("level"));
				System.out.print("\t");
				System.out.print(rs.getString("org"));
				System.out.print("\t");
				System.out.println(rs.getInt("order"));
			}
			conn.close();
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
