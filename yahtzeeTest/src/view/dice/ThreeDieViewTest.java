package view.dice;

import java.util.List;

import narrTest.NarrTestCase;

public class ThreeDieViewTest extends NarrTestCase {

	public void testExtendsDieFaceView() throws Exception {
		assertExtends(DieFaceView.class, ThreeDieView.class);
	}

	public void testLooksLikeThree() throws Exception {
		ThreeDieView threeDieView = new ThreeDieView();
		List<String> rowsToDraw = threeDieView.getRowsToDraw();
		assertNotNull(rowsToDraw);
		assertEquals(5, rowsToDraw.size());

		assertEquals("| •     |", rowsToDraw.get(1));
		assertEquals("|   •   |", rowsToDraw.get(2));
		assertEquals("|     • |", rowsToDraw.get(3));
	}
}
