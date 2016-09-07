package view.dice;

import java.util.ArrayList;

import narrTest.NarrTestCase;

public class FiveDieViewTest extends NarrTestCase {

	public void testExtendsDieFaceView() throws Exception {
		assertExtends(DieFaceView.class, FourDieView.class);
	}

	public void testLooksLikeFive() throws Exception {
		FiveDieView fiveDieView = new FiveDieView();
		ArrayList<String> rowsToDraw = assertIsOfTypeAndGet(ArrayList.class,
				fiveDieView.getRowsToDraw());
		assertEquals(5, rowsToDraw.size());

		assertEquals("| •   • |", rowsToDraw.get(1));
		assertEquals("|   •   |", rowsToDraw.get(2));
		assertEquals("| •   • |", rowsToDraw.get(3));
	}
}
