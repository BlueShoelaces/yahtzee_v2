package application;

public class MockApplication implements ApplicationInterface {

	private boolean runWasCalled = false;

	public boolean runWasCalled() {
		return this.runWasCalled;
	}

	@Override
	public void run() {
		this.runWasCalled = true;
	}

}
