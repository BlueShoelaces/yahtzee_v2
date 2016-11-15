package view.dice;

import java.util.List;

import org.junit.Test;

import narrTest.NarrTestCase;
import view.Drawable;

public class DieFaceViewTest extends NarrTestCase {

	public static final char DIE_POINT_CHARACTER = (char) 0x2022;

	@Test
	public void testExtendsDrawable() throws Exception {
		assertExtends(Drawable.class, DieFaceView.class);
	}

	public void testDieShape() throws Exception {
		Drawable oneDieView = new OneDieView();
		checkDieShape(oneDieView);

		TwoDieView twoDieView = new TwoDieView();
		checkDieShape(twoDieView);

	}

	private void checkDieShape(Drawable oneDieView) {
		List<String> rowsToDraw = oneDieView.getRowsToDraw();
		assertNotNull(rowsToDraw);
		int expectedNumberOfRows = 5;
		assertEquals(expectedNumberOfRows, rowsToDraw.size());

		String expectedTopAndBottom = " ======= ";
		int expectedRowLength = expectedTopAndBottom.length();
		for (String row : rowsToDraw) {
			assertEquals(expectedRowLength, row.length());
		}

		String topOfDie = rowsToDraw.get(0);
		String bottomOfDie = rowsToDraw.get(expectedNumberOfRows - 1);

		assertEquals(expectedTopAndBottom, topOfDie);
		assertEquals(expectedTopAndBottom, bottomOfDie);

		char expectedSide = '|';
		for (int rowIndex = 1; rowIndex < expectedNumberOfRows - 1; rowIndex++) {
			assertEquals(expectedSide, rowsToDraw.get(rowIndex).charAt(0));
			assertEquals(expectedSide, rowsToDraw.get(rowIndex).charAt(expectedRowLength - 1));
		}
	}

}
