package view.dice;

public class MockSimpleDieFactory implements SimpleDieFactoryInterface {

	private int valuePassedToBuild;

	@Override
	public DieFaceView buildDie(int value) {
		this.valuePassedToBuild = value;
		return new NullDieView();
	}

	public int getValuePassedToBuild() {
		return valuePassedToBuild;
	}
}
