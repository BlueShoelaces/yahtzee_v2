package controller.dice;

import model.dice.DieModel;
import model.dice.DieModelInterface;
import narrTest.NarrTestCase;
import narrTest.SingletonTestHelper;

import org.junit.Test;

import view.dice.DieFaceView;
import view.dice.MockSimpleDieFactory;
import view.dice.SelectableDieView;

public class SelectableDieControllerTest extends NarrTestCase {

	private MockSimpleDieFactory mockDieFactory;

	@Override
	protected void setUp() throws Exception {
		this.mockDieFactory = SingletonTestHelper.useMockDieFactory();
		super.setUp();
	}

	@Override
	protected void tearDown() throws Exception {
		SingletonTestHelper.resetDieFactory();
		super.tearDown();
	}

	public void testConstructor() throws Exception {

		SelectableDieController selectableDieController = new SelectableDieController();

		DieController dieController = assertIsOfTypeAndGet(DieController.class,
				selectableDieController.getDieController());

		DieModelInterface dieModel = dieController.getDieModel();
		assertIsOfTypeAndGet(DieModel.class, dieModel);
		assertEquals(6, dieModel.getValue());

		SelectableDieView selectableDieView = assertIsOfTypeAndGet(
				SelectableDieView.class,
				selectableDieController.getSelectableDieView());
		assertIsOfTypeAndGet(DieFaceView.class,
				selectableDieView.getDieFaceView());

		assertEquals(dieModel.getValue(),
				this.mockDieFactory.getValuePassedToBuild());

		assertFalse(selectableDieController.isSelected());
	}

	@Test
	public void testToggleSelected() throws Exception {
		SelectableDieController selectableDieController = new SelectableDieController();
		SelectableDieView dieView = assertIsOfTypeAndGet(
				SelectableDieView.class,
				selectableDieController.getSelectableDieView());

		assertFalse(selectableDieController.isSelected());
		assertFalse(dieView.isLocked());

		selectableDieController.toggleSelected();
		assertTrue(selectableDieController.isSelected());
		assertTrue(dieView.isLocked());

		selectableDieController.toggleSelected();
		assertFalse(selectableDieController.isSelected());
		assertFalse(dieView.isLocked());
	}

	@Test
	public void testDoThis() throws Exception {
		assertFail("Make SelectableDieController listen for its Controller's View to update...");
	}
}
