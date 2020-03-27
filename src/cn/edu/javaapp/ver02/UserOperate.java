package cn.edu.javaapp.ver02;

public class UserOperate extends DBOperate {
	private static volatile DBApi INSTANCE;

	@Override
	protected DBApi factoryMethod() {
		if (null == INSTANCE) {
		    INSTANCE = new User();
		}
		return INSTANCE;
	}
}
