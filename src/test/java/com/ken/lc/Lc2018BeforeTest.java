package com.ken.lc;

import org.junit.Assert;
import org.junit.Test;

public class Lc2018BeforeTest {

	@Test
	public void testSingleNum() {

		int[] pa = {2, 2, 1};
		int ra = Lc2018Before.singleNumber(pa);
		Assert.assertEquals(1, ra);

		int[] pb = {4, 1, 2, 1, 2};
		int rb = Lc2018Before.singleNumber(pb);
		Assert.assertEquals(4, rb);
	}

	@Test
	public void testMajorityElement() {

		int[] pa = {3, 2, 3};
		int ra = Lc2018Before.majorityElement(pa);
		Assert.assertEquals(3, ra);
		int[] pb = {2, 2, 1, 1, 1, 2, 2};
		int rb = Lc2018Before.majorityElement(pb);
		Assert.assertEquals(2, rb);
	}

	@Test
	public void testSearchMatrix() {

		int[][] p = {{1, 4, 7, 11, 15},
				{2, 5, 8, 12, 19},
				{3, 6, 9, 16, 22},
				{10, 13, 14, 17, 24},
				{18, 21, 23, 26, 30}};
		int ta = 5;
		int tb = 20;
		boolean ra = Lc2018Before.searchMatrix(p, ta);
		boolean rb = Lc2018Before.searchMatrix(p, tb);
		Assert.assertTrue(ra);
		Assert.assertFalse(rb);
	}

	@Test
	public void testSearchMatrixEx() {

		int[][] p = {{1, 4, 7, 11, 15},
				{2, 5, 8, 12, 19},
				{3, 6, 9, 16, 22},
				{10, 13, 14, 17, 24},
				{18, 21, 23, 26, 30}};
		int ta = 5;
		int tb = 20;
		boolean ra = Lc2018Before.searchMatrixEx(p, ta);
		boolean rb = Lc2018Before.searchMatrixEx(p, tb);
		Assert.assertTrue(ra);
		Assert.assertFalse(rb);
	}

	@Test
	public void testSearchMatrixEx1() {

		int[][] p = {{-5}};
		int ta = 1;
		boolean ra = Lc2018Before.searchMatrixEx(p, ta);
		Assert.assertFalse(ra);
	}

	@Test
	public void testSearchMatrixEx2() {

		int[][] p = {{1, 2, 3, 4, 5}, {6, 7, 8, 9, 10}, {11, 12, 13, 14, 15}, {16, 17, 18, 19, 20}, {21, 22, 23, 24, 25}};
		int ta = 15;
		boolean ra = Lc2018Before.searchMatrixEx(p, ta);
		Assert.assertTrue(ra);
	}
}
