package view.dice;

import narrTest.NarrTestCase;

public class SimpleDieViewFactoryTest extends NarrTestCase {

	public void testBuildDie_ReturnsDieAccordingToValue() throws Exception {
		SimpleDieFactoryInterface simpleDieFactory = new SimpleDieViewFactory();
		assertIsOfTypeAndGet(OneDieView.class, simpleDieFactory.buildDie(1));
		assertIsOfTypeAndGet(TwoDieView.class, simpleDieFactory.buildDie(2));
		assertIsOfTypeAndGet(ThreeDieView.class, simpleDieFactory.buildDie(3));
		assertIsOfTypeAndGet(FourDieView.class, simpleDieFactory.buildDie(4));
		assertIsOfTypeAndGet(FiveDieView.class, simpleDieFactory.buildDie(5));
		assertIsOfTypeAndGet(SixDieView.class, simpleDieFactory.buildDie(6));

		assertIsOfTypeAndGet(NullDieView.class, simpleDieFactory.buildDie(0));
		assertIsOfTypeAndGet(NullDieView.class, simpleDieFactory.buildDie(7));
	}
}
