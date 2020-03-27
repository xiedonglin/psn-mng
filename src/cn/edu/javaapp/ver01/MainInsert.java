package cn.edu.javaapp.ver01;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Scanner;

public class MainInsert {

	public static void main(String[] args) {
		String driver = "com.mysql.jdbc.Driver";
		String url = "jdbc:mysql://localhost:3306/fuhbdb?useUnicode=true&characterEncoding=UTF-8";
		Scanner sc = new Scanner(System.in);
		String username = "root";
		String password = "";

		try {
			Class.forName(driver);// classLoader,���ض�Ӧ����
			Connection conn = (Connection) DriverManager.getConnection(url, username, password);

			System.out.print("�������֣�");
			String name = sc.nextLine();
			System.out.print("�����ַ��");
			String address = sc.nextLine();
			System.out.print("���뼶��");
			String level = sc.nextLine();
			System.out.print("������֯��");
			String org = sc.nextLine();
			System.out.print("�����ʾ˳��");
			String order = sc.nextLine();

			String sqlInsert = "INSERT INTO users(name,address,level,org,`order`)VALUES(?,?,?,?,?) ";
			PreparedStatement pstmtUpdate = (PreparedStatement) conn.prepareStatement(sqlInsert);
			pstmtUpdate.setString(1, name);
			pstmtUpdate.setString(2, address);
			pstmtUpdate.setString(3, level);
			pstmtUpdate.setString(4, org);
			pstmtUpdate.setInt(5, Integer.valueOf(order));

			int updateCount = pstmtUpdate.executeUpdate();
			if (updateCount == 1) {
				System.out.println("����ɹ�");
			} else {

				System.out.println("����ʧ��");
				return;
			}

			String sql = "select id from users order by id desc limit 1 ";
			PreparedStatement pstmt = (PreparedStatement) conn.prepareStatement(sql);
			ResultSet rsLast = pstmt.executeQuery();
			rsLast.next();
			int lastid = rsLast.getInt("id");

			String sqlSel = "select * from users where id = ? ";
			PreparedStatement pstmtQuery = (PreparedStatement) conn.prepareStatement(sqlSel);
			pstmtQuery.setInt(1, lastid);
			ResultSet rs = pstmtQuery.executeQuery();
			System.out.println("��׷�ӵ����ݣ�");
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
		sc.close();

	}

}
