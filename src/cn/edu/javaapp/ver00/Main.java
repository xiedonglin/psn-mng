package cn.edu.javaapp.ver00;

public class Main {
	private String s;

	public static void main(String[] args) {
//		Main m = new Main("This is a test.");
//		m.p();
		
//		Me me = new Me("hello.");
//		me.say("sss");
		
		IBase base =new Base("test");
		base.say();
	}

	public Main() {
	}

	public Main(String s) {
		this.s = s;
	}

	public void p() {
		System.out.print(s);
	}

	/**
	 * @return the s
	 */
	public String getS() {
		return s;
	}

	/**
	 * @param s the s to set
	 */
	public void setS(String s) {
		this.s = s;
	}

}
