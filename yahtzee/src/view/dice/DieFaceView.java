package view.dice;

import java.util.ArrayList;
import java.util.List;

public abstract class DieFaceView {

	protected final char DIE_POINT_CHARACTER = (char) 0x2022;
	protected List<String> rowsToDraw;

	public DieFaceView() {
		this.rowsToDraw = new ArrayList<String>();
		this.rowsToDraw.add(" ======= ");
		this.rowsToDraw.add("|       |");
		this.rowsToDraw.add("|       |");
		this.rowsToDraw.add("|       |");
		this.rowsToDraw.add(" ======= ");
	}

	public List<String> getRowsToDraw() {
		return this.rowsToDraw;
	}

}
