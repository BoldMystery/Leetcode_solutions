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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode temp = head;
        int count = 0;

        while(temp != null){
            count++;
            temp = temp.next;
        }
        temp = head;
        ListNode curr = null;

        int i = 0;

        if(count == n){
            if(temp.next == null){
                head = null;
                return head;
            }
            head = head.next;
            return head;
        }

        while(i != (count - n)){
            curr = temp;
            temp = temp.next;
            i++;
        }
        if(temp.next != null){
            curr.next = temp.next;
        }else{
            curr.next = null;
        }
        return head;
    }
}