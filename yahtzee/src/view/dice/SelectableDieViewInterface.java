package view.dice;

import java.util.List;

import view.Drawable;

public interface SelectableDieViewInterface {

	void draw();

	void setLocked(boolean isLocked);

	boolean isLocked();

	Drawable getDieFaceView();

	List<String> getRowsToDraw();

}
