package cn.edu.javaapp.ver01;

public class Base implements IBase {
	protected String base;

	public Base(String base) {
		this.base = base;
	}

	@Override
	public void say() {
		System.out.print(base);
	}

}
