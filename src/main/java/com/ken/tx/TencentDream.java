package com.ken.tx;

import com.ken.tx.ext.ListNode;

/**
 * https://leetcode-cn.com/problemset/50/
 */
public class TencentDream {

	/**
	 * 寻找两个有序数组的中位数
	 * <p>https://leetcode-cn.com/problems/median-of-two-sorted-arrays/</p>
	 *
	 * @param nums1
	 * @param nums2
	 * @return
	 */
	public static double findMedianSortedArrays(int[] nums1, int[] nums2) {

		int m1 = 0, m2 = 0, n1 = nums1.length - 1, n2 = nums2.length - 1;
		boolean isZone1 = false;
		boolean isZone2 = false;

		while ((n1 - m1 + n2 - m2) > 0) {

			if (nums1[m1] < nums2[m2]) {
				m1++;
			} else {
				m2++;
			}
			if (nums1[n1] > nums2[n2]) {
				n1--;
			} else {
				n2--;
			}
			if (m1 > n1) {
				isZone1 = true;
				break;
			}
			if (m2 > n2) {
				isZone2 = true;
				break;
			}
		}
		double r = 0d;
		if (isZone1 || isZone2) {
			if (isZone1) {
				while (n2 - m2 > 1) {
					n2--;
					m2++;
				}
				r = n2 > m2 ? ((double) (nums2[m2] + nums2[n2])) / 2 : nums2[m2];
			} else {
				while (n1 - m1 > 1) {
					n1--;
					m1++;
				}
				r = n1 > m1 ? ((double) (nums1[m1] + nums1[n1])) / 2 : nums1[m1];
			}
		} else {
			r = ((double) (nums1[m1] + nums2[m2])) / 2;
		}

		return r;
	}

	/**
	 * Definition for singly-linked list.
	 * public class ListNode {
	 * int val;
	 * ListNode next;
	 * ListNode(int x) { val = x; }
	 * <p>
	 * <p>
	 * </p>
	 * }
	 */
	public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {

		ListNode t1 = l1;
		ListNode t2 = l2;
		int vt = t1.val + t2.val;
		ListNode last = new ListNode(vt % 10);
		ListNode r = last;
		ListNode t = last;
		t1 = t1.next;
		t2 = t2.next;
		vt /= 10;

		while (t1 != null || t2 != null) {
			vt = (t1 == null ? 0 : t1.val) + (t2 == null ? 0 : t2.val) + vt;
			t = new ListNode(vt % 10);
			last.next = t;
			last = t;
			vt /= 10;
			if (t1 != null) t1 = t1.next;
			if (t2 != null) t2 = t2.next;
		}
		if (vt > 0) last.next = new ListNode(vt);

		return r;
	}
}
