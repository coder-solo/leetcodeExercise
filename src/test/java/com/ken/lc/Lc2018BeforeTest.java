package com.ken.lc;

import org.junit.Assert;
import org.junit.Test;
import sun.awt.SunHints;

import java.util.stream.IntStream;

public class Lc2018BeforeTest {

	@Test
	public void testSingleNum() {

		int[] pa = {2,2,1};
		int ra = Lc2018Before.singleNumber(pa);
		Assert.assertEquals(1, ra);

		int[] pb = {4,1,2,1,2};
		int rb = Lc2018Before.singleNumber(pb);
		Assert.assertEquals(4, rb);
	}

	@Test
	public void testMajorityElement() {

		int[] pa = {3,2,3};
		int ra = Lc2018Before.majorityElement(pa);
		Assert.assertEquals(3, ra);
		int[] pb = {2,2,1,1,1,2,2};
		int rb = Lc2018Before.majorityElement(pb);
		Assert.assertEquals(2, rb);
	}

	@Test
	public void testSearchMatrix() {

		int[][] p = {{1,   4,  7, 11, 15},
				{2,   5,  8, 12, 19},
				{3,   6,  9, 16, 22},
				{10, 13, 14, 17, 24},
				{18, 21, 23, 26, 30}};
		int ta = 5;
		int tb = 20;
		boolean ra = Lc2018Before.searchMatrix(p, ta);
		boolean rb = Lc2018Before.searchMatrix(p, tb );
		Assert.assertTrue(ra);
		Assert.assertFalse(rb);

		IntStream.of(p[0]).forEach(System.out::println);

	}
}
