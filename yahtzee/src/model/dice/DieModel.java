package model.dice;

public class DieModel implements DieModelInterface {

	private final int value;

	public DieModel(int value) {
		this.value = value;
	}

	@Override
	public int getValue() {
		return this.value;
	}

}
