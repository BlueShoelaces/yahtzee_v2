package view.dice;

import junit.framework.Test;
import junit.framework.TestSuite;
import narrTest.NarrTestCase;

public class Suite extends NarrTestCase {

	public static Test suite() {
		TestSuite suite = new TestSuite(Suite.class.getName());

		suite.addTestSuite(DieFaceViewTest.class);
		suite.addTestSuite(OneDieViewTest.class);
		suite.addTestSuite(TwoDieViewTest.class);
		suite.addTestSuite(ThreeDieViewTest.class);
		suite.addTestSuite(FourDieViewTest.class);
		suite.addTestSuite(FiveDieViewTest.class);
		suite.addTestSuite(SixDieViewTest.class);
		suite.addTestSuite(FiveDiceViewTest.class);
		suite.addTestSuite(NullDieViewTest.class);
		suite.addTestSuite(SelectableDieViewTest.class);
		suite.addTestSuite(SimpleDieViewFactoryTest.class);

		return suite;
	}

}
