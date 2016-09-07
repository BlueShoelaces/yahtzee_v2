package view.dice;

public class TwoDieView extends DieFaceView {

	public TwoDieView() {
		this.rowsToDraw.set(1, "| •     |");
		this.rowsToDraw.set(3, "|     • |");
	}
}
