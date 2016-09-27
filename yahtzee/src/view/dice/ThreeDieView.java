package view.dice;

public class ThreeDieView extends DieFaceView {

	public ThreeDieView() {
		this.rowsToDraw.set(1, "| " + this.DIE_POINT_CHARACTER + "     |");
		this.rowsToDraw.set(2, "|   " + this.DIE_POINT_CHARACTER + "   |");
		this.rowsToDraw.set(3, "|     " + this.DIE_POINT_CHARACTER + " |");
	}
}
