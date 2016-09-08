package application;

import junit.framework.Test;
import junit.framework.TestSuite;

public class Suite {

	public static Test suite() {
		TestSuite suite = new TestSuite(Suite.class.getName());

		suite.addTestSuite(ApplicationTest.class);
		suite.addTestSuite(YahtzeeLauncherTest.class);

		return suite;
	}

}
