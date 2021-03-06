package controller.dice;

import model.dice.DieModel;
import model.dice.DieModelInterface;
import view.Drawable;
import view.dice.SimpleDieViewFactory;

public class DieController {

	private DieModelInterface dieModel;
	private Drawable dieView;

	public DieController(DieModelInterface dieModel) {
		this.dieModel = dieModel;
		setDieViewFromModel(dieModel);
	}

	private void setDieViewFromModel(DieModelInterface dieModel) {
		this.dieView = SimpleDieViewFactory.instance().buildDie(
				dieModel.getValue());
	}

	public void roll() {
		this.dieModel = new DieModel((int) (Math.random() * 6) + 1);
		setDieViewFromModel(this.dieModel);
	}

	public DieModelInterface getDieModel() {
		return this.dieModel;
	}

	public Drawable getDieView() {
		return this.dieView;
	}

}
