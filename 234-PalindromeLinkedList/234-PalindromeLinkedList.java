// Last updated: 4/8/2026, 8:17:20 PM
/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */

class Solution {
     public ListNode middleNode(ListNode head) {
        if(head==null)
            return null;
        ListNode fast=head;
        ListNode slow=head;
        while(fast!=null&&fast.next!=null){
        fast=fast.next.next;
        slow=slow.next;
    }
    return slow;
}
 public ListNode reverseList(ListNode head) {
        ListNode h2=null;
        while(head!=null){
            ListNode temp=head;
            head=head.next;
            temp.next=h2;
            h2=temp;
        }
        return h2;
    }
    public boolean isPalindrome(ListNode h1) {
        ListNode midE1=middleNode(h1);
        ListNode h2=reverseList(midE1);
        while(h2!=null){
            if(h1.val!=h2.val)return false;
            h1=h1.next;
            h2=h2.next;
        }
        return true;
    }
}