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
}
