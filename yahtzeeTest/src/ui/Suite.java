package ui;

import junit.framework.Test;
import junit.framework.TestSuite;
import narrTest.NarrTestCase;

public class Suite extends NarrTestCase {

	public static Test suite() {
		TestSuite suite = new TestSuite(Suite.class.getName());

		suite.addTestSuite(NarrDrawingHelperTest.class);

		return suite;
	}

}
