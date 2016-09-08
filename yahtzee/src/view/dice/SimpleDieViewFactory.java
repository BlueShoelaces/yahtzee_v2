package view.dice;

public class SimpleDieViewFactory implements SimpleDieFactoryInterface {
	
	private static SimpleDieFactoryInterface singleton;
	
	private SimpleDieViewFactory() {
		
	}

	@Override
	public DieFaceView buildDie(int value) {
		switch (value) {
		case 1:
			return new OneDieView();
		case 2:
			return new TwoDieView();
		case 3:
			return new ThreeDieView();
		case 4:
			return new FourDieView();
		case 5:
			return new FiveDieView();
		case 6:
			return new SixDieView();
		default:
			return new NullDieView();
		}
	}

	public static SimpleDieFactoryInterface instance() {
		if (singleton == null) {
			singleton = new SimpleDieViewFactory();
		}
		return singleton;
	}

}
