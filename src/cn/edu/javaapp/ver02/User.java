package cn.edu.javaapp.ver02;
public class User implements DBApi {
	@Override
	public boolean insert(String data) {
		System.out.println("User insert :" + data);
		return true;
	}

	@Override
	public boolean delete(String data) {
		System.out.println("User delete :" + data);
		return true;
	}

	@Override
	public boolean update(String data) {
		System.out.println("User update :" + data);
		return true;
	}

	@Override
	public boolean select(String data) {
		System.out.println("User select :" + data);
		return true;
	}
}
