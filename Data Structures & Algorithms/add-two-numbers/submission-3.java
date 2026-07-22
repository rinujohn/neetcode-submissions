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

        ListNode pOne = l1;
        ListNode pTwo = l2;
        int cf = 0;

        ListNode result = null;
        ListNode prev = null;
        while(pOne !=null || pTwo != null){
            ListNode sumNode = new ListNode();
            if(result == null){
                result = sumNode; 
            }
           int sumValue = cf;
            if (pOne != null){
            sumValue += pOne.val;
            pOne = pOne.next ;
            }
            if (pTwo != null){
            sumValue += pTwo.val;
            pTwo = pTwo.next;
            }
            sumNode.val = sumValue%10;
            cf = sumValue/10;

            if (prev!=null){
                prev.next = sumNode;
            }
            prev = sumNode;
            
        }
        if(cf !=0){
            ListNode extraNode = new ListNode(cf);
            prev.next = extraNode;
        }
        return result;
        
    }
}
