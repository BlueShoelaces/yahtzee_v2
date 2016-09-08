package view.dice;

import java.util.List;

import narrTest.NarrTestCase;

public class TwoDieViewTest extends NarrTestCase {

	public void testExtendsDieFaceView() throws Exception {
		assertExtends(DieFaceView.class, TwoDieView.class);
	}

	public void testLooksLikeTwo() throws Exception {
		TwoDieView twoDieView = new TwoDieView();
		List<String> rowsToDraw = twoDieView.getRowsToDraw();
		assertNotNull(rowsToDraw);
		assertEquals(5, rowsToDraw.size());

		assertEquals("| •     |", rowsToDraw.get(1));
		assertEquals("|       |", rowsToDraw.get(2));
		assertEquals("|     • |", rowsToDraw.get(3));
	}
}
