package view.dice;

public class TwoDieView extends DieFaceView {

	public TwoDieView() {
		this.rowsToDraw.set(1, "| " + this.DIE_POINT_CHARACTER + "     |");
		this.rowsToDraw.set(3, "|     " + this.DIE_POINT_CHARACTER + " |");
	}
}
