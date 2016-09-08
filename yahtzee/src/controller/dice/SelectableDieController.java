package controller.dice;

import model.dice.DieModel;

public class SelectableDieController {

	private static final int DEFAULT_VALUE = 6;
	private final DieController dieController;

	public SelectableDieController() {
		this.dieController = new DieController(new DieModel(DEFAULT_VALUE));
	}

	public DieController getDieController() {
		return this.dieController;
	}

}
