package view.dice;

import java.util.List;

import org.junit.Test;

import narrTest.NarrTestCase;
import view.Drawable;

public class SelectableDieViewTest extends NarrTestCase {

	private final static String UNSELECTED_BOX_STRING = "   [ ]   ";
	private final static String SELECTED_BOX_STRING = "   [X]   ";

	@Test
	public void testExtendsDrawable() throws Exception {
		assertExtends(Drawable.class, SelectableDieView.class);
	}

	public void testConstructor() throws Exception {
		MockDieView expectedDieView = new MockDieView();
		SelectableDieViewInterface selectableDieView = new SelectableDieView(expectedDieView);

		assertSame(expectedDieView, selectableDieView.getDieFaceView());

		assertNotNull(selectableDieView.getRowsToDraw());
		List<String> selectableDieRowsToDraw = selectableDieView.getRowsToDraw();

		List<String> dieRowsToDraw = expectedDieView.getRowsToDraw();
		assertNotSame(dieRowsToDraw, selectableDieRowsToDraw);

		int numberOfDieRows = dieRowsToDraw.size();

		assertEquals(selectableDieRowsToDraw.size(), numberOfDieRows + 1);
		int rowIndex = 0;
		for (rowIndex = 0; rowIndex < numberOfDieRows; rowIndex++) {
			assertEquals(dieRowsToDraw.get(rowIndex), selectableDieRowsToDraw.get(rowIndex));
		}

		assertFalse(selectableDieView.isLocked());
		assertEquals(selectableDieRowsToDraw.get(rowIndex), UNSELECTED_BOX_STRING);
	}

	public void testLockedPropertyIsBoundToCheckbox() throws Exception {
		SelectableDieViewInterface selectableDieView = new SelectableDieView(new MockDieView());
		List<String> rowsToDraw = selectableDieView.getRowsToDraw();
		int checkboxRowIndex = rowsToDraw.size() - 1;
		assertEquals(UNSELECTED_BOX_STRING, rowsToDraw.get(checkboxRowIndex));

		selectableDieView.setLocked(true);
		assertEquals(SELECTED_BOX_STRING, rowsToDraw.get(checkboxRowIndex));

		selectableDieView.setLocked(false);
		assertEquals(UNSELECTED_BOX_STRING, rowsToDraw.get(checkboxRowIndex));
	}
}
