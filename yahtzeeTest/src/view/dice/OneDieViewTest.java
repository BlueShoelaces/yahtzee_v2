package view.dice;

import java.util.List;

import narrTest.NarrTestCase;

public class OneDieViewTest extends NarrTestCase {

	public void testExtendsDieFaceView() throws Exception {
		assertExtends(DieFaceView.class, OneDieView.class);
	}

	public void testLooksLikeOne() throws Exception {
		OneDieView oneDieView = new OneDieView();
		List<String> rowsToDraw = oneDieView.getRowsToDraw();
		assertNotNull(rowsToDraw);
		assertEquals(5, rowsToDraw.size());

		assertEquals("|       |", rowsToDraw.get(1));
		assertEquals("|   •   |", rowsToDraw.get(2));
		assertEquals("|       |", rowsToDraw.get(3));
	}

}
