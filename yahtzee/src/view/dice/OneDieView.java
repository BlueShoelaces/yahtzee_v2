package view.dice;

public class OneDieView extends DieFaceView {

	public OneDieView() {
		this.rowsToDraw.set(2, "|   " + this.DIE_POINT_CHARACTER + "   |");
	}
}
