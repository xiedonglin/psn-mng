package cn.edu.psn.management01;

import java.util.Scanner;

public class Application {
	private static Scanner sc;

	
	public static void main(String[] args) {
        for (int i = 1; i <= 100; i++) {
            if (i == 99)
                break;
            System.out.print(i + " ");
        }
        System.out.println();
		
		
		System.out.println("---------------欢迎登陆人员管理系统---------------");
		System.out.println("1 组织管理");
		System.out.println("2 人员管理");
		System.out.println("3 退出");
		System.out.println("---------------欢迎登陆人员管理系统---------------");
		sc = new Scanner(System.in);
		String cmd = "";
		while(!"3".equals((cmd = sc.nextLine()))){
			if ("1".equals(cmd)){
			// 组织管理
				Org org = new Org();
				org.command();
				
				
			}else if("2".equals(cmd)){
			// 人员管理	
				
				
			}
		}
		System.out.println("人员管理系统 退出成功");
	}
}
