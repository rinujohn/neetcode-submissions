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
    public void reorderList(ListNode head) {
        /*
        identify the mid point
        reverse the second half
        iterate through both of them
        */
        // ListNode mid = findMidPoint(head);
        // mid.next = null;
        // ListNode newHead = reverseList(mid);
        // ListNode node = head;
        //  while(node != null){
        //     System.out.println(node.val);
        //     node = node.next;
        // }


        // ListNode nodeOne = head;
        // ListNode nodeTwo = newHead;
        // while( nodeTwo != null){
        //     ListNode temp = nodeOne.next;
        //     ListNode tempTwo = nodeTwo.next;
        //     nodeOne.next = nodeTwo;
        //     nodeTwo.next = temp;
        //     nodeOne = temp;
        //     nodeTwo = tempTwo;

        // }
        
        // while(node != null){
        //     System.out.println(node.val);
        //     node = node.next;
        // }

        if (head == null || head.next == null || head.next.next == null) {
        return;
    }
    
    // 1. Identify the midpoint (using the first-middle strategy)
    ListNode mid = findMidPoint(head);
    
    // 2. Sever the first half from the second half to prevent cycles
    ListNode secondHalfStart = mid.next;
    mid.next = null; 
    
    // 3. Reverse the second half
    ListNode newHead = reverseList(secondHalfStart);
    
    // 4. Interleave both halves
    ListNode nodeOne = head;
    ListNode nodeTwo = newHead;
    while (nodeTwo != null) {
        ListNode temp = nodeOne.next;
        ListNode tempTwo = nodeTwo.next;
        
        nodeOne.next = nodeTwo;
        nodeTwo.next = temp;
        
        nodeOne = temp;
        nodeTwo = tempTwo;
    }
    
    // 5. Print out the result safely
    ListNode node = head;
    while (node != null) {
        System.out.println(node.val);
        node = node.next;
    }
    }
    public ListNode reverseList(ListNode head){
        ListNode prev = null;
        ListNode current = head;
        ListNode temp = null;
        while(current != null){
            temp = current.next;
            current.next = prev;
            prev = current;
            current = temp;
        }
        return prev;

    }
    public ListNode findMidPoint(ListNode head){
        ListNode fast = head.next;
        ListNode slow = head;

        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
            
            //System.out.println(slow.val);
        }
        
        return slow;
    }
}
