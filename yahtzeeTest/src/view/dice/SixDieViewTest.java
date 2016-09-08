package view.dice;

import java.util.List;

import narrTest.NarrTestCase;

public class SixDieViewTest extends NarrTestCase {

	public void testExtendsDieFaceView() throws Exception {
		assertExtends(DieFaceView.class, FourDieView.class);
	}

	public void testLooksLikeFour() throws Exception {
		SixDieView sixDieView = new SixDieView();
		List<String> rowsToDraw = sixDieView.getRowsToDraw();
		assertNotNull(rowsToDraw);
		assertEquals(5, rowsToDraw.size());

		assertEquals("| •   • |", rowsToDraw.get(1));
		assertEquals("| •   • |", rowsToDraw.get(2));
		assertEquals("| •   • |", rowsToDraw.get(3));
	}
}
