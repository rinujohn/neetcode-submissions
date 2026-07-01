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

/*
two list ,

identify the list with smallest first node value

treat it as head, 
treat other list head as second 
iterate through the first list,
    starting from current = head
    compare, current value with second list node value
        if they are equal 
        store the next pointer to next_first
        make current.next = second list node
        second.next = null 
        store second.next to next_second
        update current = current.next
    compare next_first to second_next
     
}

*/
class Solution {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode dummy = new ListNode(-1,null);
       ListNode current = dummy;
        while(list1!=null && list2!=null){
            if(list1.val<=list2.val){
                current.next = list1;
                list1 = list1.next;
            }else{
                current.next = list2;
                list2 = list2.next;
            }
            current = current.next;
        }
        if(list1 != null){
            current.next = list1;
        }else{
            current.next = list2;
        }
        return dummy.next;
      /*

      my failed attempt: too complex logic and failed to work
        ListNode current = null;
        ListNode head = null;
         if(list1== null && list2!=null){
             if(current != null){
               current.next = list2; 
            
            }else{
                current= list2;
                head = current;
            }
            return head;
        }
        else if(list1!= null && list2==null){
            if(current != null){
               current.next = list1; 
            }else{
                current= list1;
                head = current;
            }
         return head;
        }
        else if(list1== null && list2==null){

        return head;
        }else{

        while(true){
            if(list1== null && list2!=null){
             
               current.next = list2; 
            break;

        }
        else if(list1!= null && list2==null){
            
               current.next = list1; 
            break;

        }else if(list1== null && list2==null){
            break;
        }else if(list1!= null && list2!=null){
            if(list1.val<list2.val){
                 if(head == null){
                        head = list1;
                }
                current.next = list1;
                ListNode next1 = list1.next;
                //list1.next = null;
                list1 = next1;
                current = current.next;
               

            }else if(list1.val==list2.val){
                if(head == null){
                        head = list1;
                        current = head;
                }
                current.next = list1;
                ListNode next1 = list1.next;
                //list1.next = null;
                list1 = next1;
                 current = current.next;
                  current.next = list2;
                 ListNode next2 = list2.next;
                //list2.next = null;
                list2 = next2;
                 current = current.next;
                 
            }else{
                if(head == null){
                        head = list2;
                }
                 current.next = list2;
                ListNode next2 = list2.next;
                //list2.next = null;
                list2 = next2;
                current = current.next;
            }
        }
           }
           }
           return head;
      */
    }
}