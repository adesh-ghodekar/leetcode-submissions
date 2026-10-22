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
    public ListNode deleteMiddle(ListNode head) {
        ListNode head1=null;
        if(head==null || head.next==null){
            return head1;
        }
        ListNode fast=head;
        ListNode slow=head;
        int count=0;
        while(fast!=null && fast.next!=null){
            fast=fast.next.next;
            slow=slow.next;
            count++;
        }
        ListNode middleNext=slow.next;
        fast=head;
        for(int i=0;i<count-1;i++){
            fast=fast.next;
        }
        fast.next=middleNext;
        return head;
    }
}