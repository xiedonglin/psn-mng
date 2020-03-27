package cn.edu.javaapp.ver02;

public class OrgOperate extends DBOperate {
	private static volatile DBApi INSTANCE;

	@Override
	protected DBApi factoryMethod() {
		if (null == INSTANCE) {
		    INSTANCE = new Org();
		}
		return INSTANCE;
	}
}
