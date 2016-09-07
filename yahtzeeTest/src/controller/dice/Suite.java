package controller.dice;

import junit.framework.Test;
import junit.framework.TestSuite;

public class Suite {

	public static Test suite() {
		TestSuite suite = new TestSuite(Suite.class.getName());

		suite.addTestSuite(DieControllerTest.class);
		suite.addTestSuite(SelectableDieControllerTest.class);

		return suite;
	}

}
