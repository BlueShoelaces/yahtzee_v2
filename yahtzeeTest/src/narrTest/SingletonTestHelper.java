package narrTest;

import java.lang.reflect.Field;

import view.dice.MockSimpleDieFactory;
import view.dice.SimpleDieViewFactory;

public class SingletonTestHelper extends NarrTestCase {

	public static MockSimpleDieFactory useMockDieFactory() throws Exception {
		Field instanceField = SimpleDieViewFactory.class.getDeclaredField("singleton");
		instanceField.setAccessible(true);
		MockSimpleDieFactory mockDieFactory = new MockSimpleDieFactory();
		instanceField.set(null, mockDieFactory);
		instanceField.setAccessible(false);
		return mockDieFactory;
	}
	
	public static void resetDieFactory() throws Exception {
		Field instanceField = SimpleDieViewFactory.class.getDeclaredField("singleton");
		instanceField.setAccessible(true);
		instanceField.set(null, null);
		instanceField.setAccessible(false);
	}
}
