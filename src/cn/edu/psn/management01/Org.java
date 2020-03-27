package cn.edu.psn.management01;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.nio.charset.Charset;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Scanner;

public class Org {
	private String driver = "com.mysql.jdbc.Driver";
	private String url = "jdbc:mysql://192.168.254.132:3306/FANGZHENG?useSSL=false";
	private Connection conn = null ;
	public Org(){
		System.out.println("1 追加数据");
		System.out.println("2 更新数据");
		System.out.println("3 删除数据");
		System.out.println("4 查询数据");
		System.out.println("5 退出");
		
		try {
			Class.forName(driver);
			conn = (Connection) DriverManager.getConnection(url, "root", "root");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void command(){
		
		String cmd = "";
		Scanner sc = new Scanner(System.in);
		while(!"5".equals((cmd = sc.nextLine()))){
			if ("1".equals(cmd)){
			// 追加数据

				
				System.out.println("追加成功");
			}else if("2".equals(cmd)){
			// 更新数据	
				
				
				System.out.println("更新成功");
			}else if("3".equals(cmd)){
			// 删除数据	
				
				
				System.out.println("删除成功");
			}else if("4".equals(cmd)){
			// 查询数据	
				try{
					String sql = "select * from ORGINFO_NEW where ORG_NAME = ? ";
					PreparedStatement pstmt = (PreparedStatement) conn.prepareStatement(sql);
					InputStreamReader ipr = new InputStreamReader(System.in,Charset.forName("UTF-8"));
					BufferedReader br = new BufferedReader(ipr);
					String orgName = br.readLine();
//					String orgName = sc.nextLine();
					System.out.println(orgName);
					pstmt.setString(1, orgName);
					ResultSet rs = pstmt.executeQuery();
					while (rs.next()) {
						System.out.println(rs.getString("ORG_UUID"));
					}
					
				}catch(Exception e){
					e.printStackTrace();
				}
				
				System.out.println("查询成功");
			}
		}
		System.out.println("组织管理退出 成功");
	}
	
	
}
