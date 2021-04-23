package pi223;

import static org.junit.Assert.*;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

import Laba2.FiveElements;
import Laba2.SortBuble;

public class ChechTrueRun {
	static int[] testing;
	static FiveElements n;
	
	@BeforeClass
	public static void testUser423 () {
		n = new FiveElements ();
		testing = new int [n.odnomerniyMassiv.length];
		for (int i = 0; i< n.odnomerniyMassiv.length; i++ ) {
			testing[i] = n.odnomerniyMassiv [i];
		}
	}
	@Test
	public void test() {
		SortBuble.sortbuble(testing);
	}
	
	@AfterClass
	public static void testUser4232() {
		for (int i=2; i< testing.length; i++ ) {
			assertTrue (testing [i-1]<=testing[i]);
		}
	}

}
