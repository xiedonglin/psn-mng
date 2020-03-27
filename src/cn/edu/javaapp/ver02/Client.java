package cn.edu.javaapp.ver02;

public class Client {

	public static void main(String[] args){
		UserOperate user = new UserOperate();
		user.insert(" user1");
		user.update(" user1");
		user.select(" user1");
		user.delete(" user1");

		DBOperate org = new OrgOperate();
		org.insert(" org1");
		user.select(" user3");
		org.update(" org1");
		org.select(" org1");
		org.delete(" org1");
		System.out.println("hello world");
	}
	
}
