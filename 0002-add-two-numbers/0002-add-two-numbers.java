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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode res = new ListNode(0);
        ListNode l3 = res;        
        int carry = 0;
        while(l1 != null || l2 != null){
           
            int sum = carry;
            // If value L not null then use the value of L else equals to 0
            if(l1 != null){
                sum += l1.val;
                l1 = l1.next;
            }
            if(l2 != null){
                sum += l2.val;
                l2 = l2.next;
            }
            carry = sum / 10;
            sum = sum % 10;
            l3.next = new ListNode(sum);
            l3 = l3.next;
        }
        if(carry == 1){
            l3.next = new ListNode(1);
        }
        return res.next;
    }
    
}