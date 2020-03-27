/**
 * MIT License
 * <p>
 * Copyright (c) 2017 James
 * <p>
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 * <p>
 * The above copyright notice and this permission notice shall be included in all
 * copies or substantial portions of the Software.
 * <p>
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
 * SOFTWARE.
 */
package cn.edu.javaapp.ver01;

import java.sql.Connection;
import java.sql.DriverManager;
import java.util.Scanner;

/**
 * “饿汉式” 的单例实现方式
 * <p>
 * 可以保证线程安全
 */
public final class 饿汉数据库连接 {

  /**
   * 静态的本类实例
   */
  private static final 饿汉数据库连接 INSTANCE = new 饿汉数据库连接();

  private static Connection conn = null;
  
  
  public static Connection getConn() {
	return conn;
}


/**
   * 私有化的构造方法保证不被其它类调用
   */
  private 饿汉数据库连接() {
		String driver = "com.mysql.jdbc.Driver";
		String url = "jdbc:mysql://localhost:3306/fuhbdb";
		Scanner sc = new Scanner(System.in);
		String username = "root";
		String password = "";

		try {
			Class.forName(driver);// classLoader,���ض�Ӧ����
			conn = (Connection) DriverManager.getConnection(url, username, password);
			
		}catch (Exception e){
			
		}
  }

  /**
   * 客户端调用获取单例实例
   *
   * @return 单例实例
   */
  public static 饿汉数据库连接 getInstance() {
    return INSTANCE;
  }
}
