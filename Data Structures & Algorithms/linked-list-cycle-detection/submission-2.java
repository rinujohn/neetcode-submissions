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
    public boolean hasCycle(ListNode head) {
        //O(n) space requirements
        // Set<Integer> indexSet = new HashSet<>();
        // ListNode current = head;
        // while(current != null){
        //     if(!indexSet.add(current.val)){
        //         return true;
        //     }
        //     current = current.next;
        // }
        // return false;

        ListNode current = head;
        while(current.next != null){
            if(current.val>=current.next.val){
                return true;
            }
            current = current.next;
        }
        return false;
    }
}
