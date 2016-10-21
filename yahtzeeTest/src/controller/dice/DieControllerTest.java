package controller.dice;

import model.dice.DieModel;
import model.dice.DieModelInterface;
import model.dice.MockDieModel;
import narrTest.NarrTestCase;
import narrTest.SingletonTestHelper;

import org.junit.Test;

import view.Drawable;
import view.dice.DieFaceView;
import view.dice.FiveDieView;
import view.dice.FourDieView;
import view.dice.MockSimpleDieFactory;
import view.dice.OneDieView;
import view.dice.SixDieView;
import view.dice.ThreeDieView;
import view.dice.TwoDieView;

public class DieControllerTest extends NarrTestCase {

	private MockSimpleDieFactory mockSimpleDieFactory;

	@Override
	protected void setUp() throws Exception {
		this.mockSimpleDieFactory = SingletonTestHelper.useMockDieFactory();
		super.setUp();
	}

	@Override
	protected void tearDown() throws Exception {
		SingletonTestHelper.resetDieFactory();
		super.tearDown();
	}

	public void testConstructor() throws Exception {

		MockDieModel mockDieModel = new MockDieModel();
		int expectedValue = 37;
		mockDieModel.setValue(expectedValue);
		DieController dieController = new DieController(mockDieModel);

		assertSame(mockDieModel, dieController.getDieModel());

		assertIsOfTypeAndGet(DieFaceView.class, dieController.getDieView());

		assertEquals(expectedValue,
				this.mockSimpleDieFactory.getValuePassedToBuild());
	}

	@Test
	public void testRoll_UpdatesDieModelWithRandomValue() throws Exception {
		MockDieModel originalMockDieModel = new MockDieModel();
		originalMockDieModel.setValue(27);
		DieController dieController = new DieController(originalMockDieModel);

		dieController.roll();
		DieModelInterface updatedDieModel = assertIsOfTypeAndGet(
				DieModel.class, dieController.getDieModel());

		boolean valueIsAlwaysBetweenOneAndSix = true;
		boolean[] possibleValues = new boolean[6];

		for (int i = 0; i < 100; i++) {
			dieController.roll();
			updatedDieModel = dieController.getDieModel();
			int updatedValue = updatedDieModel.getValue();
			if (updatedValue < 1 || updatedValue > 6) {
				valueIsAlwaysBetweenOneAndSix = false;
				break;
			}
			possibleValues[updatedValue - 1] = true;
		}

		assertTrue("Value " + updatedDieModel.getValue()
				+ " was less than 1 or greater than 6.",
				valueIsAlwaysBetweenOneAndSix);

		for (int i = 0; i < possibleValues.length; i++) {
			assertTrue("Never got a " + (i + 1), possibleValues[i]);
		}
	}

	@Test
	public void testRoll_CreatesNewDieView() throws Exception {
		SingletonTestHelper.resetDieFactory();
		DieController dieController = new DieController(new MockDieModel());

		for (int i = 0; i < 100; i++) {
			dieController.roll();

			DieModel updatedDieModel = assertIsOfTypeAndGet(DieModel.class,
					dieController.getDieModel());
			int value = updatedDieModel.getValue();

			Drawable updatedDieView = assertIsOfTypeAndGet(
					DieFaceView.class, dieController.getDieView());

			checkDieViewForValue(value, updatedDieView);
		}

	}

	private void checkDieViewForValue(int value, Drawable updatedDieView) {
		String message = "Value was " + value + " but die view was "
				+ updatedDieView.getClass();

		switch (value) {
		case 1:
			assertTrue(message, updatedDieView instanceof OneDieView);
			break;
		case 2:
			assertTrue(message, updatedDieView instanceof TwoDieView);
			break;
		case 3:
			assertTrue(message, updatedDieView instanceof ThreeDieView);
			break;
		case 4:
			assertTrue(message, updatedDieView instanceof FourDieView);
			break;
		case 5:
			assertTrue(message, updatedDieView instanceof FiveDieView);
			break;
		case 6:
			assertTrue(message, updatedDieView instanceof SixDieView);
			break;
		default:
			assertFail("Value " + value + " was less than 1 or greater than 6.");
		}
	}
}
