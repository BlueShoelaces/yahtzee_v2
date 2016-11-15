package view.dice;

import java.util.ArrayList;
import java.util.List;

import view.Drawable;

public class SelectableDieView extends Drawable implements SelectableDieViewInterface {

	private static final String UNSELECTED_BOX_STRING = "   [ ]   ";
	private static final String SELECTED_BOX_STRING = "   [X]   ";
	private final Drawable dieFaceView;
	private boolean locked;

	public SelectableDieView(Drawable dieFaceView) {
		this.dieFaceView = dieFaceView;
		this.rowsToDraw = new ArrayList<String>();
		this.rowsToDraw.addAll(dieFaceView.getRowsToDraw());
		this.locked = false;
		this.rowsToDraw.add(UNSELECTED_BOX_STRING);
	}

	@Override
	public List<String> getRowsToDraw() {
		return this.rowsToDraw;
	}

	@Override
	public Drawable getDieFaceView() {
		return this.dieFaceView;
	}

	@Override
	public boolean isLocked() {
		return this.locked;
	}

	@Override
	public void setLocked(boolean isLocked) {
		this.locked = isLocked;
		int checkboxRowIndex = this.rowsToDraw.size() - 1;
		if (this.locked) {
			this.rowsToDraw.set(checkboxRowIndex, SELECTED_BOX_STRING);
		} else {
			this.rowsToDraw.set(checkboxRowIndex, UNSELECTED_BOX_STRING);
		}
	}

	@Override
	public void draw() {
		for (String row : this.rowsToDraw) {
			System.out.println(row);
		}
	}

}
