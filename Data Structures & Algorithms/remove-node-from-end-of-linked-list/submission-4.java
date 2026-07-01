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
    
    int count = 0;
    ListNode current = head;
   // ListNode prev = null;

    while(current != null){
        count ++;
        //prev = current;
        current = current.next;
    }
    System.out.println(count);

    int target = count+1 - n;

    if(target == 1 ){
        head = head.next;
        return head;
    }

    count = 1;
    current = head;
    ListNode prev = null;
    while(current != null){
        if(count == target){
            prev.next = current.next;
            break;
        }
        prev = current;
        count ++;
        current = current.next;
    }
    return head;
    }
}

/**
remove nth node from end

find the length of linked list O(n)

then find length - n node 
remove the node from the list O(n)

total runtime is O(n)

//remove node:
current = head
count = 1
prev = null
while(current.next!= null){

if (count == target){
    prev.next = current.next
}
prev = current
current = current.next
count ++
}

*/