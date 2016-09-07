package controller.dice;

import model.dice.MockDieModel;
import narrTest.NarrTestCase;
import view.dice.DieFaceView;
import view.dice.MockSimpleDieFactory;

public class DieControllerTest extends NarrTestCase {

	public void testConstructor() throws Exception {

		MockDieModel mockDieModel = new MockDieModel();
		int expectedValue = 37;
		mockDieModel.setValue(expectedValue);
		MockSimpleDieFactory mockSimpleDieFactory = new MockSimpleDieFactory();
		DieController dieController = new DieController(mockDieModel,
				mockSimpleDieFactory);

		assertSame(mockDieModel, dieController.getDieModel());

		assertIsOfTypeAndGet(DieFaceView.class, dieController.getDieView());

		assertEquals(expectedValue,
				mockSimpleDieFactory.getValuePassedToBuild());

		assertSame(mockSimpleDieFactory, dieController.getSimpleDieFactory());
	}
}
