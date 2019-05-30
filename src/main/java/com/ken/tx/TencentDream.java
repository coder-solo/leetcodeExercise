package com.ken.tx;

import com.ken.tx.ext.ListNode;

/**
 * https://leetcode-cn.com/problemset/50/
 */
public class TencentDream {

	/**
	 * Definition for singly-linked list.
	 * public class ListNode {
	 * int val;
	 * ListNode next;
	 * ListNode(int x) { val = x; }
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

		while(t1 != null || t2 != null) {
			vt = t1.val + t2.val + vt;
			t = new ListNode(vt % 10);
			last.next = t;
			last = t;
			vt /= 10;
		}

		return r;

		// base
//		long v1 = parseListNode(l1);
//		long v2 = parseListNode(l2);
//
//		return pickListNode(v1 + v2);
	}

	public static long parseListNode(ListNode ln) {
		long v = ln.val;
		for(int i = 1; (ln = ln.next) != null; i++) {
			v =  ln.val * (long)(Math.pow(10, i)) + v;
		}
		return v;
	}

	public static ListNode pickListNode(long v) {

		int vi = (int) (v % 10);
		ListNode r = new ListNode(vi);
		ListNode last = r;
		ListNode lt = null;
		long vt = v / 10;
		while (vt > 0) {
			if(vt < 10) {
				last.next = new ListNode((int)vt);
				break;
			}
			vi = (int) (vt % 10);
			lt = new ListNode(vi);
			last.next = lt;
			last = lt;
			vt = vt / 10;
		}
		return r;
	}
}
