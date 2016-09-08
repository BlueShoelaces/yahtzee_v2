package application;

import narrTest.NarrTestCase;
import narrTest.SingletonTestHelper;

import org.junit.Test;

public class YahtzeeLauncherTest extends NarrTestCase {

	private MockApplication mockApplication;

	@Override
	protected void setUp() throws Exception {
		this.mockApplication = SingletonTestHelper.useMockApplication();
		super.setUp();
	}

	@Override
	protected void tearDown() throws Exception {
		SingletonTestHelper.resetApplication();
		super.tearDown();
	}

	@Test
	public void testMainMethodCallsApplicationRun() throws Exception {
		YahtzeeLauncher.main(null);
		assertTrue(this.mockApplication.runWasCalled());
	}
}
