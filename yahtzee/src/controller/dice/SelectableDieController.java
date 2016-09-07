package controller.dice;

import model.dice.DieModel;
import view.dice.SimpleDieFactoryInterface;
import view.dice.SimpleDieViewFactory;

public class SelectableDieController {

	private static final int DEFAULT_VALUE = 6;
	private final SimpleDieFactoryInterface dieFactory;
	private final DieController dieController;

	public SelectableDieController() {
		this.dieFactory = new SimpleDieViewFactory();
		this.dieController = new DieController(new DieModel(DEFAULT_VALUE),
				this.dieFactory);
	}

	public SimpleDieFactoryInterface getSimpleDieFactory() {
		return this.dieFactory;
	}

	public DieController getDieController() {
		return this.dieController;
	}

}
