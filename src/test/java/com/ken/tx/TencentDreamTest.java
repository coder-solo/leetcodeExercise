package com.ken.tx;

import com.ken.tx.ext.ListNode;
import org.junit.Assert;
import org.junit.Test;

public class TencentDreamTest {

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

		System.out.println(l1);
		System.out.println(l2);
		ListNode r = TencentDream.addTwoNumbers(l1, l2);

		System.out.println(r);
	}

	@Test
	public void testIntLength() {
		long a = 9999999991L + 9L;
		System.out.println(a);
	}

	@Test
	public void testListNode() {

/*		ListNode l1 = new ListNode(2, new ListNode(4, new ListNode(3)));
		long v = TencentDream.parseListNode(l1);
		System.out.println(v);*/

		ListNode r1 = TencentDream.pickListNode(807L);
		System.out.println(r1);
		System.out.println(10L % 10);
		System.out.println(10L / 10);

	}
}
