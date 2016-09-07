package controller.dice;

import model.dice.DieModel;
import model.dice.DieModelInterface;
import narrTest.NarrTestCase;
import view.dice.SimpleDieViewFactory;

public class SelectableDieControllerTest extends NarrTestCase {

	public void testConstructor() throws Exception {
		SelectableDieController selectableDieController = new SelectableDieController();

		SimpleDieViewFactory dieFactory = assertIsOfTypeAndGet(
				SimpleDieViewFactory.class,
				selectableDieController.getSimpleDieFactory());

		DieController dieController = assertIsOfTypeAndGet(DieController.class,
				selectableDieController.getDieController());
		DieModelInterface dieModel = dieController.getDieModel();
		assertIsOfTypeAndGet(DieModel.class, dieModel);
		assertEquals(6, dieModel.getValue());
		assertSame(dieFactory, dieController.getSimpleDieFactory());
	}
}
