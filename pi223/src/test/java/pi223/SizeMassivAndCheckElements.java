package pi223;

import static org.junit.Assert.*;

import org.junit.BeforeClass;
import org.junit.Test;

import Laba2.FiveElements;

public class SizeMassivAndCheckElements {
	static FiveElements testing;
	@BeforeClass
	public static void testUser323() {
		testing = new FiveElements();
	}
	@Test
	public void test() {
		assertEquals(5, testing.odnomerniyMassiv.length);
		for (int i = 1; i < testing.odnomerniyMassiv.length; i++) {
			assertNotNull(testing.odnomerniyMassiv[i]);
		}
		
	}

}
