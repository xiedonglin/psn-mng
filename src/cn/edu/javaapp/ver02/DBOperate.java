package cn.edu.javaapp.ver02;

public abstract class DBOperate {

	public boolean insert(String data){
		DBApi api = factoryMethod();
		return api.insert(data);
	}

	public boolean update(String data){
		DBApi api = factoryMethod();
		return api.update(data);
	}
	
	public boolean delete(String data){
		DBApi api = factoryMethod();
		return api.delete(data);
	}

	public boolean select(String data){
		DBApi api = factoryMethod();
		return api.select(data);
	}
	
	protected abstract DBApi factoryMethod();
	
}
