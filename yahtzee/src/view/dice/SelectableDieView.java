package view.dice;

import java.util.ArrayList;
import java.util.List;

public class SelectableDieView {

	private static final String UNSELECTED_BOX_STRING = "   [ ]   ";
	private static final String SELECTED_BOX_STRING = "   [X]   ";
	private final List<String> rowsToDraw;
	private final DieFaceView dieFaceView;
	private boolean locked;

	public SelectableDieView(DieFaceView dieFaceView) {
		this.dieFaceView = dieFaceView;
		this.rowsToDraw = new ArrayList<String>();
		this.rowsToDraw.addAll(dieFaceView.getRowsToDraw());
		this.locked = false;
		this.rowsToDraw.add(UNSELECTED_BOX_STRING);
	}

	public List<String> getRowsToDraw() {
		return this.rowsToDraw;
	}

	public DieFaceView getDieFaceView() {
		return this.dieFaceView;
	}

	public boolean isLocked() {
		return this.locked;
	}

	public void setLocked(boolean isLocked) {
		this.locked = isLocked;
		int checkboxRowIndex = this.rowsToDraw.size() - 1;
		if (this.locked) {
			this.rowsToDraw.set(checkboxRowIndex, SELECTED_BOX_STRING);
		} else {
			this.rowsToDraw.set(checkboxRowIndex, UNSELECTED_BOX_STRING);
		}
	}

	public void draw() {
		for (String row : this.rowsToDraw) {
			System.out.println(row);
		}
	}

}
