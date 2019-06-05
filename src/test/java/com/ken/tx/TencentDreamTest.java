package com.ken.tx;

import com.ken.tx.ext.ListNode;
import org.junit.Assert;
import org.junit.Test;

public class TencentDreamTest {

	@Test
	public void testLongestPalindrome() {

		String r = TencentDream.longestPalindrome("babad");
		Assert.assertEquals("bab", r);
	}

	@Test
	public void testLongestPalindrome2() {

		String r = TencentDream.longestPalindrome("cbbd");
		Assert.assertEquals("bb", r);
	}

	@Test
	public void testLongestPalindrome3() {

		String r = TencentDream.longestPalindrome("ccc");
		Assert.assertEquals("ccc", r);
	}

	@Test
	public void testFindMedianSortedArrays() {

		int[] nums1 = {1, 3};
		int[] nums2 = {2};
		double r = TencentDream.findMedianSortedArrays2(nums1, nums2);
		Assert.assertEquals(2, r, 0.01);
	}

	@Test
	public void testFindMedianSortedArrays2() {

		int[] nums1 = {1, 2};
		int[] nums2 = {3, 4};
		double r = TencentDream.findMedianSortedArrays2(nums1, nums2);
		Assert.assertEquals(2.5, r, 0.01);
	}

	@Test
	public void testFindMedianSortedArrays3() {

		int[] nums1 = {1, 2, 3, 4, 5, 6, 7, 8, 9,10,11};
		int[] nums2 = {1, 2, 3, 4, 5, 6, 7, 8, 9,10,11};
		double r = TencentDream.findMedianSortedArrays2(nums1, nums2);
		System.out.println(r);
	}

	@Test
	public void testFindMedianSortedArrays4() {

		int[] nums1 = {};
		int[] nums2 = {1};
		double r = TencentDream.findMedianSortedArrays2(nums1, nums2);
		System.out.println(r);
	}

	@Test
	public void testAddTwoNumbers() {

		ListNode l1 = new ListNode(2, new ListNode(4, new ListNode(3)));
		ListNode l2 = new ListNode(5, new ListNode(6, new ListNode(4)));

		ListNode r = TencentDream.addTwoNumbers(l1, l2);

		Assert.assertEquals(7, r.val);
		Assert.assertEquals(0, r.next.val);
		Assert.assertEquals(8, r.next.next.val);
	}

	@Test
	public void testAddTwoNumbers2() {

		ListNode l1 = new ListNode(9);
		ListNode l2 = new ListNode(1, new ListNode(9, new ListNode(9, new ListNode(9,
				new ListNode(9, new ListNode(9, new ListNode(9, new ListNode(9, new ListNode(9, new ListNode(9, new ListNode(9)))))))))));

		ListNode r = TencentDream.addTwoNumbers(l1, l2);

		Assert.assertEquals("000000000001", r.toString());
	}
}
