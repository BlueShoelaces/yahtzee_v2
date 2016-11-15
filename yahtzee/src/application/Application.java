package application;

import java.util.ArrayList;

import controller.dice.SelectableDieController;
import ui.NarrDrawingHelper;
import view.dice.SelectableDieViewInterface;

public class Application implements ApplicationInterface {

	private static ApplicationInterface singleton;

	private Application() {

	}

	public static ApplicationInterface instance() {
		if (singleton == null) {
			singleton = new Application();
		}
		return singleton;
	}

	@Override
	public void run() {
		ArrayList<SelectableDieController> dice = new ArrayList<SelectableDieController>();
		for (int i = 0; i < 3; i++) {
			dice.add(new SelectableDieController());
			dice.get(i).getDieController().roll();
		}

		SelectableDieController secondDie = dice.get(1);
		secondDie.toggleSelected();

		NarrDrawingHelper drawingHelper = NarrDrawingHelper.instance();
		SelectableDieViewInterface[] selectableDieViewsToDraw = new SelectableDieViewInterface[dice
				.size()];
		for (int i = 0; i < dice.size(); i++) {
			selectableDieViewsToDraw[i] = dice.get(i).getSelectableDieView();
		}
		drawingHelper.drawSelectableDiceRow(selectableDieViewsToDraw);

	}

}
