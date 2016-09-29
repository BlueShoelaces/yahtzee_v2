package ui;

import org.junit.Test;

import narrTest.NarrTestCase;

public class NarrDrawingHelperTest extends NarrTestCase {

	@Test
	public void testIsSingleton() throws Exception {
		NarrDrawingHelper firstInstance = assertIsOfTypeAndGet(NarrDrawingHelper.class,
				NarrDrawingHelper.instance());

		NarrDrawingHelper secondInstance = NarrDrawingHelper.instance();
		assertSame(firstInstance, secondInstance);
	}

	@Test
	public void testDrawSelectableDie() throws Exception {
		NarrDrawingHelper drawingHelper = NarrDrawingHelper.instance();
		drawingHelper.drawSelectableDie();

		assertFail("Test me, test me!");
	}

}
