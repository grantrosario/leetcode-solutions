package algorithm.solutions;


public class Q2 {
	
	public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
	    ListNode dummyHead = new ListNode(0);
	    ListNode p = l1, q = l2, curr = dummyHead;
	    int carry = 0;
	    while (p != null || q != null) {
	        int x = (p != null) ? p.val : 0;
	        int y = (q != null) ? q.val : 0;
	        int sum = carry + x + y;
	        carry = sum / 10;
	        curr.next = new ListNode(sum % 10);
	        curr = curr.next;
	        if (p != null) p = p.next;
	        if (q != null) q = q.next;
	    }
	    if (carry > 0) {
	        curr.next = new ListNode(carry);
	    }
	    return dummyHead.next;
	}
	
	public void printListNode(ListNode l1) {
		while(l1 != null) {
			if(l1.next != null) {
				System.out.print(l1.val + " -> ");
			}
			else {
				System.out.print(l1.val);
			}
			l1 = l1.next;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Q2 q2 = new Q2();
		ListNode l1 = new ListNode(2);
		l1.next = new ListNode(4);
		l1.next.next = new ListNode(3);
		
		ListNode l2 = new ListNode(5);
		l2.next = new ListNode(6);
		l2.next.next = new ListNode(4);
		
		
		System.out.print("   ");
		q2.printListNode(l1);
		System.out.print("\n + ");
		q2.printListNode(l2);
		System.out.print("\n----------------\n   ");
		q2.printListNode(q2.addTwoNumbers(l1, l2));
		System.out.print("  (reversed)");
	}

}
