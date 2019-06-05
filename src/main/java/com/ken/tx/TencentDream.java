package com.ken.tx;

import com.ken.tx.ext.ListNode;

/**
 * https://leetcode-cn.com/problemset/50/
 */
public class TencentDream {

	/**
	 * 最长回文子串
	 * <p>https://leetcode-cn.com/problems/longest-palindromic-substring/</p>
	 *
	 * @param s
	 * @return
	 */
	public static String longestPalindrome(String s) {

		if (s == null || "".equals(s)) {
			return "";
		}

		char[] chars = s.toCharArray();
		int len = chars.length;
		int ti = 0;
		int tj = 0;
		int k = 0;
		String r = "";
		int tMax = 1;
		String tMaxStr = chars[0] + "";
		boolean isR = true;

		for (int i = 0; i < len - 1; i++) {
			k = 1;
			r = "" + chars[i];
			ti = i - 1;
			tj = i + 1;
			while (ti > -1 && tj < len) {
				if (chars[ti] == chars[tj]) {
					k = k + 2;
					r = chars[ti] + r + chars[tj];
					ti--;
					tj++;
				} else {
					break;
				}
			}
			if (k > tMax) {
				tMax = k;
				tMaxStr = r;
			}

			if (chars[i] == chars[i + 1]) {
				k = 2;
				r = "" + chars[i] + chars[i + 1];

				ti = i - 1;
				tj = i + 2;
				while (ti > -1 && tj < len) {
					if (chars[ti] == chars[tj]) {
						k = k + 2;
						r = chars[ti] + r + chars[tj];
						ti--;
						tj++;
					} else {
						break;
					}
				}
				if (k > tMax) {
					tMax = k;
					tMaxStr = r;
				}
			}
		}

		return tMaxStr;
	}

	/**
	 * 最长回文子串
	 * <p>https://leetcode-cn.com/problems/longest-palindromic-substring/</p>
	 *
	 * @param s
	 * @return
	 */
	public static String longestPalindromeBad(String s) {

		if (s == null || "".equals(s)) {
			return "";
		}

		char[] chars = s.toCharArray();
		int len = chars.length;
		int ti = 0;
		int tj = 0;
		int k = 0;
		String r = "";
		int tMax = 0;
		String tMaxStr = "";
		boolean isR = true;

		for (int i = 0; i < len; i++) {
			k = 0;
			r = "";
			for (int j = len - 1; j > i; j--) {
				ti = i;
				tj = j;
				k = 0;
				r = "";
				isR = true;
				for (; tj >= ti; tj--, ti++) {
					if (chars[ti] != chars[tj]) {
						isR = false;
						break;
					} else {
						k = tj == ti ? k + 1 : k + 2;
						r = r + chars[ti];
					}
				}
				if (isR) {
					if (k > tMax) {
						tMax = k;
						tMaxStr = r;
					}
				}
			}
		}
		if (tMax > 0) {
			char[] rChars = tMaxStr.toCharArray();
			String result = "";
			for (int i = tMax % 2 == 1 ? rChars.length - 2 : rChars.length - 1; i > -1; i--) {
				tMaxStr += rChars[i];
			}
		} else {
			tMaxStr = chars[0] + "";
		}

		return tMaxStr;
	}

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
		boolean isZone1 = nums1.length == 0 ? true : false;
		boolean isZone2 = nums2.length == 0 ? true : false;

		while ((n1 - m1 + n2 - m2) > 0 && (!isZone1 && !isZone2)) {

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
			}
			if (m2 > n2) {
				isZone2 = true;
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

	public static double findMedianSortedArrays2(int[] nums1, int[] nums2) {

		int m1 = 0, m2 = 0, n1 = nums1.length - 1, n2 = nums2.length - 1;
		int t1 = 0, t2 = 0, t = 0;
		boolean isZone1 = nums1.length == 0 ? true : false;
		boolean isZone2 = nums2.length == 0 ? true : false;
		boolean isLarge1 = false;

		while ((n1 - m1 + n2 - m2) > 0 && (!isZone1 && !isZone2)) {
			t1 = (m1 + n1) / 2;
			t2 = (m2 + n2) / 2;
			isLarge1 = (n1 - m1) > (n2 - m2);
			t = !isLarge1 ? (t1 - m1 + 1) : (t2 - m2 + 1);
			if (nums1[t1] > nums2[t2]) {
				if (isLarge1) {
					n2 = n2 - t;
					m1 = m1 + t;
				} else {
					n1 = n1 - t;
					m2 = m2 + t;
				}
			} else {
				if (!isLarge1) {
					n2 = n2 - t;
					m1 = m1 + t;
				} else {
					n1 = n1 - t;
					m2 = m2 + t;
				}
			}
			if (m1 > n1) {
				isZone1 = true;
			}
			if (m2 > n2) {
				isZone2 = true;
			}
		}

		double r = 0d;
		if (isZone1 || isZone2) {
			if (isZone1) {
				r = (n2 - m2) % 2 == 1 ? ((double) (nums2[(m2 + n2) / 2] + nums2[(m2 + n2) / 2 + 1])) / 2 : nums2[(m2 + n2) / 2];
			} else {
				r = (n1 - m1) % 2 == 1 ? ((double) (nums1[(m1 + n1) / 2] + nums1[(m1 + n1) / 2 + 1])) / 2 : nums1[(m1 + n1) / 2];
			}
		} else {
			r = ((double) (nums1[m1] + nums2[m2])) / 2;
		}

		return 0d;
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
