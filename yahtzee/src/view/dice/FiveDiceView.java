package view.dice;

import java.util.ArrayList;
import java.util.List;

public class FiveDiceView {

	private final List<String> rowsToDraw;

	public FiveDiceView() {
		this.rowsToDraw = new ArrayList<String>();
	}

	public List<String> getRowsToDraw() {
		return this.rowsToDraw;
	}

}
