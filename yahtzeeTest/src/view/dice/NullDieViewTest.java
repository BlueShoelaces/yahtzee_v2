package view.dice;

import java.util.List;

import narrTest.NarrTestCase;

public class NullDieViewTest extends NarrTestCase {

	public void testExtendsDieView() throws Exception {
		assertExtends(DieFaceView.class, NullDieView.class);
	}

	public void testLooksEmpty() throws Exception {

		NullDieView nullDieView = new NullDieView();
		List<String> rowsToDraw = nullDieView.getRowsToDraw();
		assertNotNull(rowsToDraw);
		assertEquals(5, rowsToDraw.size());

		assertEquals("|       |", rowsToDraw.get(1));
		assertEquals("|       |", rowsToDraw.get(2));
		assertEquals("|       |", rowsToDraw.get(3));
	}
}
