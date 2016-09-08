package application;

import narrTest.NarrTestCase;

import org.junit.Test;

public class ApplicationTest extends NarrTestCase {

	@Test
	public void testImplementsInterface() throws Exception {
		assertImplementsInterface(ApplicationInterface.class, Application.class);
	}

	@Test
	public void testIsSingleton() throws Exception {
		ApplicationInterface firstInstance = Application.instance();
		assertNotNull(firstInstance);

		ApplicationInterface secondInstance = Application.instance();
		assertSame(firstInstance, secondInstance);
	}

	@Test
	public void testRun() throws Exception {
		assertFail("Use a DiceSetFactory to build the dice, and/or use a UIHelper to control all the drawing");
	}
}
