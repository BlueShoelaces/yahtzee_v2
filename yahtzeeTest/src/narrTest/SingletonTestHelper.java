package narrTest;

import java.lang.reflect.Field;

import view.dice.MockSimpleDieFactory;
import view.dice.SimpleDieViewFactory;
import application.Application;
import application.MockApplication;

public class SingletonTestHelper extends NarrTestCase {

	public static MockSimpleDieFactory useMockDieFactory() throws Exception {
		Field instanceField = extractSingletonField(SimpleDieViewFactory.class);
		MockSimpleDieFactory mockDieFactory = new MockSimpleDieFactory();
		setInstanceField(instanceField, mockDieFactory);

		return mockDieFactory;
	}

	public static void resetDieFactory() throws Exception {
		Field instanceField = extractSingletonField(SimpleDieViewFactory.class);
		setInstanceField(instanceField, null);
	}

	public static MockApplication useMockApplication() throws Exception {
		Field instanceField = extractSingletonField(Application.class);
		MockApplication mockApplication = new MockApplication();
		setInstanceField(instanceField, mockApplication);

		return mockApplication;
	}

	public static void resetApplication() throws Exception {
		Field instanceField = extractSingletonField(Application.class);
		setInstanceField(instanceField, null);
	}

	private static Field extractSingletonField(
			Class<? extends Object> singletonClass) throws NoSuchFieldException {
		Field instanceField = singletonClass.getDeclaredField("singleton");
		instanceField.setAccessible(true);
		return instanceField;
	}

	private static void setInstanceField(Field instanceField,
			Object mockSingleton) throws IllegalAccessException {
		instanceField.set(null, mockSingleton);
		instanceField.setAccessible(false);
	}
}
