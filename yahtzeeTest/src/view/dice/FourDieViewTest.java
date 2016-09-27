package view.dice;

import java.util.List;

import narrTest.NarrTestCase;

public class FourDieViewTest extends NarrTestCase {

	public void testExtendsDieFaceView() throws Exception {
		assertExtends(DieFaceView.class, FourDieView.class);
	}

	public void testLooksLikeFour() throws Exception {
		FourDieView fourDieView = new FourDieView();
		List<String> rowsToDraw = fourDieView.getRowsToDraw();
		assertNotNull(rowsToDraw);
		assertEquals(5, rowsToDraw.size());

		assertEquals("| " + DieFaceViewTest.DIE_POINT_CHARACTER + "   "
				+ DieFaceViewTest.DIE_POINT_CHARACTER + " |", rowsToDraw.get(1));
		assertEquals("|       |", rowsToDraw.get(2));
		assertEquals("| " + DieFaceViewTest.DIE_POINT_CHARACTER + "   "
				+ DieFaceViewTest.DIE_POINT_CHARACTER + " |", rowsToDraw.get(3));
	}
}
