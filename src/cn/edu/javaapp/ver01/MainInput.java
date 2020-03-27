package cn.edu.javaapp.ver01;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class MainInput {

	public static void main(String[] args) throws SQLException {

		Scanner sc = new Scanner(System.in);

		Connection conn = 饿汉数据库连接.getInstance().getConn();
		System.out.print("������������ʾ�ĵڼ�����");
		String id = sc.nextLine();
		String sql = "select * from users where id = ? ";
		PreparedStatement pstmt = (PreparedStatement) conn.prepareStatement(sql);
		pstmt.setInt(1, Integer.parseInt(id));
		ResultSet rs = pstmt.executeQuery();
		System.out.println("��DB����ȡ������ֵ��");
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
		sc.close();
	}

}
