package view.dice;

import java.util.ArrayList;

import narrTest.NarrTestCase;

public class NullDieViewTest extends NarrTestCase {

	public void testExtendsDieView() throws Exception {
		assertExtends(DieFaceView.class, NullDieView.class);
	}

	public void testLooksEmpty() throws Exception {

		NullDieView nullDieView = new NullDieView();
		ArrayList<String> rowsToDraw = assertIsOfTypeAndGet(ArrayList.class,
				nullDieView.getRowsToDraw());
		assertEquals(5, rowsToDraw.size());

		assertEquals("|       |", rowsToDraw.get(1));
		assertEquals("|       |", rowsToDraw.get(2));
		assertEquals("|       |", rowsToDraw.get(3));
	}
}
