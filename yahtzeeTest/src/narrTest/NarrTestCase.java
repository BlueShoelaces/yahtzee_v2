package narrTest;

import junit.framework.TestCase;

public class NarrTestCase extends TestCase {

	protected static <T> T assertIsOfTypeAndGet(Class<T> type, Object object) {
		assertNotNull("Expected " + type + " but was null", object);
		assertTrue("Expected " + type + " but was " + object.getClass(),
				type.isAssignableFrom(object.getClass()));

		return type.cast(object);
	}

	protected static void assertExtends(
			Class<? extends Object> expectedSuperClass,
			Class<? extends Object> actualClass) {
		assertSame(expectedSuperClass, actualClass.getSuperclass());
	}

	protected static void assertImplementsInterface(
			Class<? extends Object> expectedInterface,
			Class<? extends Object> actualClass) {
		Class<?>[] interfaces = actualClass.getInterfaces();
		boolean implementsInterface = false;
		for (Class<?> actualInterface : interfaces) {
			if (expectedInterface.equals(actualInterface)) {
				implementsInterface = true;
			}
		}
		assertTrue("" + actualClass + " does not implement "
				+ expectedInterface, implementsInterface);
	}

	protected static void assertFail() {
		assertTrue(false);
	}

	protected static void assertFail(String message) {
		assertTrue(message, false);
	}

}
