package view.dice;

import static org.junit.Assert.*;

import org.junit.Test;

import narrTest.NarrTestCase;

public class SimpleDieViewFactoryTest extends NarrTestCase {
	
	@Test
	public void testIsASingleton() throws Exception {
		SimpleDieFactoryInterface firstInstance = SimpleDieViewFactory.instance();
		assertNotNull(firstInstance);
		
		SimpleDieFactoryInterface secondInstance = SimpleDieViewFactory.instance();
		assertSame(firstInstance, secondInstance);
	}

	public void testBuildDie_ReturnsDieAccordingToValue() throws Exception {
		SimpleDieFactoryInterface simpleDieFactory = SimpleDieViewFactory.instance();
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
