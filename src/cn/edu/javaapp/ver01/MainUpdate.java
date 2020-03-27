package cn.edu.javaapp.ver01;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Scanner;

public class MainUpdate {

	public static void main(String[] args) {
		String driver = "com.mysql.jdbc.Driver";
		String url = "jdbc:mysql://localhost:3306/fuhbdb?useUnicode=true&characterEncoding=UTF-8";
		Scanner sc = new Scanner(System.in);
		String username = "root";
		String password = "";

		try {
			Class.forName(driver);// classLoader,���ض�Ӧ����
			Connection conn = (Connection) DriverManager.getConnection(url, username, password);

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
//			System.out.print("������µ�ǰ���ݵ����֣�");
//			String name = sc.nextLine();

			String sqlDelete = "delete from users where id = ? ";
			PreparedStatement pstmtUpdate = (PreparedStatement) conn.prepareStatement(sqlDelete);
			pstmtUpdate.setInt(1, Integer.parseInt(id));
			int updateCount = pstmtUpdate.executeUpdate();
			if (updateCount == 1) {

				System.out.print("ɾ���ɹ�");
			} else {

				System.out.print("ɾ��ʧ��");
			}

			conn.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		sc.close();

	}

}
