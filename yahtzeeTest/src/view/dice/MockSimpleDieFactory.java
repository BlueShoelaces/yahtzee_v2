package view.dice;

import view.Drawable;

public class MockSimpleDieFactory implements SimpleDieFactoryInterface {

	private int valuePassedToBuild;

	@Override
	public Drawable buildDie(int value) {
		this.valuePassedToBuild = value;
		return new MockDieView();
	}

	public int getValuePassedToBuild() {
		return valuePassedToBuild;
	}

}
