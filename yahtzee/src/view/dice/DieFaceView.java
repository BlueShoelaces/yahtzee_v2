package view.dice;

import java.util.ArrayList;

import view.Drawable;

public abstract class DieFaceView extends Drawable {

	protected final char DIE_POINT_CHARACTER = (char) 0x2022;

	public DieFaceView() {
		this.rowsToDraw = new ArrayList<String>();
		this.rowsToDraw.add(" ======= ");
		this.rowsToDraw.add("|       |");
		this.rowsToDraw.add("|       |");
		this.rowsToDraw.add("|       |");
		this.rowsToDraw.add(" ======= ");
	}

}
