package pi223;

import static org.junit.Assert.*;

import org.junit.Test;

import Laba2.GenerateRandomNumbers;

public class CheckGenerateNumber {
int i = GenerateRandomNumbers.Rnd();
	@Test
	public void test() {
		assertTrue((i >= 100) && (i <= 200));
	}

}
