package cn.edu.javaapp.ver02;

public interface DBApi {
	public boolean insert(String data);
	public boolean delete(String data);
	public boolean update(String data);
	public boolean select(String data);
}
