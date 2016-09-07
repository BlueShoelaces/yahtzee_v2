package model.dice;

public class MockDieModel implements DieModelInterface {

	private int value;

	@Override
	public int getValue() {
		return this.value;
	}

	public void setValue(int value) {
		this.value = value;
	}
}
