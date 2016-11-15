package ui;

import java.util.ArrayList;
import java.util.List;

import view.dice.SelectableDieViewInterface;

public class NarrDrawingHelper {

	private static final String DIE_ROW_SPACING_BETWEEN_DICE = "   ";
	private static NarrDrawingHelper singleton;

	private NarrDrawingHelper() {

	}

	public static NarrDrawingHelper instance() {
		if (singleton == null) {
			singleton = new NarrDrawingHelper();
		}
		return singleton;
	}

	public List<String> drawSelectableDiceRow(
			SelectableDieViewInterface... selectableDieViewsToDraw) {
		ArrayList<String> rowsToDraw = new ArrayList<String>();

		for (int row = 0; row < selectableDieViewsToDraw[0].getRowsToDraw().size(); row++) {
			String rowToDraw = "";

			for (int die = 0; die < selectableDieViewsToDraw.length; die++) {
				rowToDraw += selectableDieViewsToDraw[die].getRowsToDraw().get(row);
				rowToDraw += die < selectableDieViewsToDraw.length - 1
						? DIE_ROW_SPACING_BETWEEN_DICE : "";
			}
			rowsToDraw.add(rowToDraw);
		}

		for (String rowToDraw : rowsToDraw) {
			System.out.println(rowToDraw);
		}
		return rowsToDraw;
	}

}
