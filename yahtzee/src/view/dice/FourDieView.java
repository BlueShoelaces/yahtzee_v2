package view.dice;

public class FourDieView extends DieFaceView {

	public FourDieView() {
		this.rowsToDraw.set(1,
				"| " + this.DIE_POINT_CHARACTER + "   " + this.DIE_POINT_CHARACTER + " |");
		this.rowsToDraw.set(3,
				"| " + this.DIE_POINT_CHARACTER + "   " + this.DIE_POINT_CHARACTER + " |");
	}
}
