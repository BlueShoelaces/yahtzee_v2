package controller.dice;

import model.dice.DieModel;
import view.dice.SelectableDieView;
import view.dice.SelectableDieViewInterface;
import view.dice.SimpleDieViewFactory;

public class SelectableDieController {

	private static final int DEFAULT_VALUE = 6;
	private final DieController dieController;
	private boolean selected;
	private final SelectableDieViewInterface selectableDieView;

	public SelectableDieController() {
		this.dieController = new DieController(new DieModel(DEFAULT_VALUE));
		this.selectableDieView = new SelectableDieView(SimpleDieViewFactory
				.instance().buildDie(DEFAULT_VALUE));
	}

	public DieController getDieController() {
		return this.dieController;
	}

	public SelectableDieViewInterface getSelectableDieView() {
		return this.selectableDieView;
	}

	public void toggleSelected() {
		this.selected = !this.selected;
		this.selectableDieView.setLocked(this.selected);
	}

	public boolean isSelected() {
		return this.selected;
	}
}
