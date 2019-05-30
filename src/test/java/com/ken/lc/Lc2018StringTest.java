package com.ken.lc;

import org.junit.Assert;
import org.junit.Test;

public class Lc2018StringTest {

	@Test
	public void testIsPalindrome() {

//		boolean ra = Lc2018String.isPalindrome("A man, a plan, a canal: Panama");
		boolean rb = Lc2018String.isPalindrome("0P");
//		Assert.assertTrue(ra);
		Assert.assertFalse(rb);
	}
}
