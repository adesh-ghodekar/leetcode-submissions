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
        // ListNode temp=head;
        // int count=0;
        // while(temp!=null){
        //     count++;
        //     temp=temp.next;
        // }
        // temp=head;
        // int middle=count/2;
        // ListNode middleNode=null;
        // for(int i=0;i<middle;i++){
        //     temp=temp.next;
        // }
        // middleNode=temp;
        // return middleNode;

        ListNode slow=head;
        ListNode fast=head;
        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        return slow;
    }
}