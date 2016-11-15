package ui;

import java.util.Arrays;
import java.util.List;

import org.junit.Test;

import narrTest.NarrTestCase;
import view.dice.DieFaceViewTest;
import view.dice.MockSelectableDieView;

public class NarrDrawingHelperTest extends NarrTestCase {

	private static final String DIE_ROW_SPACING_BETWEEN_DICE = "   ";

	@Test
	public void testIsSingleton() throws Exception {
		NarrDrawingHelper firstInstance = assertIsOfTypeAndGet(NarrDrawingHelper.class,
				NarrDrawingHelper.instance());

		NarrDrawingHelper secondInstance = NarrDrawingHelper.instance();
		assertSame(firstInstance, secondInstance);
	}

	@Test
	public void testDrawSelectableDiceRow_OneDie() throws Exception {
		NarrDrawingHelper drawingHelper = NarrDrawingHelper.instance();
		MockSelectableDieView mockSelectableDieView = new MockSelectableDieView();
		List<String> dieFaceRowsToDraw = Arrays.asList(
				"first row to be drawn", "here's the second row", "here's a string "
						+ DieFaceViewTest.DIE_POINT_CHARACTER + " interrupted by a character.",
				"look at all those characters!");
		mockSelectableDieView.setRowsToDraw(dieFaceRowsToDraw);
		List<String> actualRowsToDraw = drawingHelper.drawSelectableDiceRow(mockSelectableDieView);

		assertEquals(dieFaceRowsToDraw.size(), actualRowsToDraw.size());
		for (int i = 0; i < dieFaceRowsToDraw.size(); i++) {
			assertEquals(dieFaceRowsToDraw.get(i), actualRowsToDraw.get(i));
		}
	}

	@Test
	public void testDrawSelectableDiceRow_TwoDice() throws Exception {
		NarrDrawingHelper drawingHelper = NarrDrawingHelper.instance();

		MockSelectableDieView firstDie = new MockSelectableDieView();
		String die1row1 = "firstDie, first row";
		String die1row2 = "| " + DieFaceViewTest.DIE_POINT_CHARACTER
				+ "die1row2\t! (firstDie, second row)";
		List<String> firstDieRowsToDraw = Arrays.asList(die1row1, die1row2);
		firstDie.setRowsToDraw(firstDieRowsToDraw);

		MockSelectableDieView secondDie = new MockSelectableDieView();
		String die2row1 = "secondDie, first row " + DieFaceViewTest.DIE_POINT_CHARACTER + "  | "
				+ DieFaceViewTest.DIE_POINT_CHARACTER;
		String die2row2 = "secondDie, second row";
		List<String> secondDieRowsToDraw = Arrays.asList(die2row1, die2row2);
		secondDie.setRowsToDraw(secondDieRowsToDraw);

		List<String> actualRowsToDraw = drawingHelper.drawSelectableDiceRow(firstDie, secondDie);
		String expectedFirstRowToDraw = die1row1 + DIE_ROW_SPACING_BETWEEN_DICE + die2row1;
		String expectedSecondRowToDraw = die1row2 + DIE_ROW_SPACING_BETWEEN_DICE + die2row2;

		assertEquals(2, actualRowsToDraw.size());
		assertEquals(expectedFirstRowToDraw, actualRowsToDraw.get(0));
		assertEquals(expectedSecondRowToDraw, actualRowsToDraw.get(1));
	}

}
