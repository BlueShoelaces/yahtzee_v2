package narrTest;

import junit.framework.Test;
import junit.framework.TestSuite;

public class AllTests extends NarrTestCase {

	public static Test suite() {
		TestSuite suite = new TestSuite(AllTests.class.getName());

		suite.addTest(application.Suite.suite());
		suite.addTest(model.dice.Suite.suite());
		suite.addTest(view.dice.Suite.suite());
		suite.addTest(controller.dice.Suite.suite());
		suite.addTest(ui.Suite.suite());

		return suite;
	}

}
