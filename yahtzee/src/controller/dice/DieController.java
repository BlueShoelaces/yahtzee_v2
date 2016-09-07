package controller.dice;

import model.dice.DieModelInterface;
import view.dice.DieFaceView;
import view.dice.SimpleDieFactoryInterface;

public class DieController {

	private final DieModelInterface dieModel;
	private final DieFaceView dieView;
	private final SimpleDieFactoryInterface simpleDieFactory;

	public DieController(DieModelInterface dieModel,
			SimpleDieFactoryInterface simpleDieFactory) {
		this.dieModel = dieModel;
		this.simpleDieFactory = simpleDieFactory;
		this.dieView = this.simpleDieFactory.buildDie(dieModel.getValue());
	}

	public DieModelInterface getDieModel() {
		return this.dieModel;
	}

	public DieFaceView getDieView() {
		return this.dieView;
	}

	public SimpleDieFactoryInterface getSimpleDieFactory() {
		return this.simpleDieFactory;
	}

}
