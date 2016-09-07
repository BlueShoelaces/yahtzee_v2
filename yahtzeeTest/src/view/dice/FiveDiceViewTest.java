package view.dice;

import java.util.ArrayList;

import narrTest.NarrTestCase;

public class FiveDiceViewTest extends NarrTestCase {

	public void testConstructor() throws Exception {
		FiveDiceView fiveDiceView = new FiveDiceView();
		assertIsOfTypeAndGet(ArrayList.class, fiveDiceView.getRowsToDraw());

	}
}
