package model.dice;

import narrTest.NarrTestCase;

public class DieModelTest extends NarrTestCase {

	public void testConstructor() throws Exception {
		int expectedValue = 713;
		DieModelInterface dieModel = new DieModel(expectedValue);
		assertEquals(expectedValue, dieModel.getValue());
	}
}
