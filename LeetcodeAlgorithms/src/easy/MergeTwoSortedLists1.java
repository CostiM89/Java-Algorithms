package easy;

public class MergeTwoSortedLists1 {
	public static ListNode mergeTwoLists(ListNode list1, ListNode list2) {
		ListNode head = new ListNode();
		ListNode tail = head;
		
		while(list1 != null && list2 != null) {
			if (list1.val < list2.val) {
				tail.next = list1;
				list1 = list1.next;
				tail = tail.next;
			} else {
				tail.next = list2;
				list2 = list2.next;
				tail = tail.next;
			}
		}
		
		tail.next = (list1 != null) ? list1 : list2;
		return head.next;
	}
}
