package view.dice;

import java.util.ArrayList;
import java.util.List;

import view.Drawable;

public class MockSelectableDieView extends Drawable implements SelectableDieViewInterface {

	private boolean locked;

	public MockSelectableDieView() {
		this.rowsToDraw = new ArrayList<String>();
		this.locked = false;
	}

	@Override
	public void draw() {
	}

	@Override
	public void setLocked(boolean isLocked) {
		this.locked = isLocked;
	}

	@Override
	public boolean isLocked() {
		return this.locked;
	}

	@Override
	public Drawable getDieFaceView() {
		return null;
	}

	@Override
	public List<String> getRowsToDraw() {
		return this.rowsToDraw;
	}

	public void setRowsToDraw(List<String> rowsToDraw) {
		this.rowsToDraw = new ArrayList<String>(rowsToDraw);
	}

}
