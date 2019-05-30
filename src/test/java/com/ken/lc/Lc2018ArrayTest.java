package com.ken.lc;

import org.junit.Assert;
import org.junit.Test;

public class Lc2018ArrayTest {

	@Test
	public void testMaxProduct() {

//		int[] pa = {2,3,-2,4};
//		int ra = Lc2018Array.maxProductEx(pa);
//		Assert.assertEquals(6, ra);
//
//		int[] pb = {0,2};
//		int rb = Lc2018Array.maxProductEx(pb);
//		Assert.assertEquals(2, rb);

		int[] pc = {1,5,0,4,7,0,2,8};
		int rc = Lc2018Array.maxProductEx(pc);
		Assert.assertEquals(28, rc);
	}

}
