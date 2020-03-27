package cn.edu.javaapp.ver02;
public class Org implements DBApi {
	@Override
	public boolean insert(String data) {
		System.out.println("Org insert :" + data);
		return true;
	}

	@Override
	public boolean delete(String data) {
		System.out.println("Org delete :" + data);
		return true;
	}

	@Override
	public boolean update(String data) {
		System.out.println("Org update :" + data);
		return true;
	}

	@Override
	public boolean select(String data) {
		System.out.println("Org select :" + data);
		return true;
	}
}
