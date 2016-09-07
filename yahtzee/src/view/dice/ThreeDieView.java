package view.dice;

public class ThreeDieView extends DieFaceView {

	public ThreeDieView() {
		this.rowsToDraw.set(1, "| •     |");
		this.rowsToDraw.set(2, "|   •   |");
		this.rowsToDraw.set(3, "|     • |");
	}
}
