package com.ken.tx.ext;

public class ListNode {

	public int val;
	public ListNode next;

	public ListNode(int x) {
		val = x;
	}

	public ListNode(int x, ListNode next) {
		this.val = x;
		this.next = next;
	}

	public String toString() {
		StringBuilder sb = new StringBuilder().append(val);
		ListNode t = this;
		while(t.next != null) {
			t = t.next;
			sb.append(t.val);
		}
		return sb.toString();
	}
}
