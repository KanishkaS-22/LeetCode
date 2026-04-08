// Last updated: 4/8/2026, 8:22:03 PM
1class Solution {
2    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
3        ListNode dummyHead = new ListNode(0);
4        ListNode curr = dummyHead;
5        int carry = 0;
6
7        while (l1 != null || l2 != null || carry != 0) {
8            int x = (l1 != null) ? l1.val : 0;
9            int y = (l2 != null) ? l2.val : 0;
10            int sum = carry + x + y;
11
12            carry = sum / 10;
13            curr.next = new ListNode(sum % 10);
14            curr = curr.next;
15
16            if (l1 != null) l1 = l1.next;
17            if (l2 != null) l2 = l2.next;
18        }
19        return dummyHead.next;
20    }
21}