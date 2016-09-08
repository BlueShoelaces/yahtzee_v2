package controller.dice;

import model.dice.DieModel;
import model.dice.DieModelInterface;
import view.dice.DieFaceView;
import view.dice.SimpleDieViewFactory;

public class DieController {

	private DieModelInterface dieModel;
	private final DieFaceView dieView;

	public DieController(DieModelInterface dieModel) {
		this.dieModel = dieModel;
		this.dieView = generateDieViewFromModel(dieModel);
	}

	private DieFaceView generateDieViewFromModel(DieModelInterface dieModel) {
		return SimpleDieViewFactory.instance().buildDie(dieModel.getValue());
	}

	public void roll() {
		this.dieModel = new DieModel((int) (Math.random() * 6) + 1);
	}

	public DieModelInterface getDieModel() {
		return this.dieModel;
	}

	public DieFaceView getDieView() {
		return this.dieView;
	}

}
