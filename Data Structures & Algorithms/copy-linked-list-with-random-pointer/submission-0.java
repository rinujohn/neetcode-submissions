/*
// Definition for a Node.
class Node {
    int val;
    Node next;
    Node random;

    public Node(int val) {
        this.val = val;
        this.next = null;
        this.random = null;
    }
}
*/

class Solution {
    public Node copyRandomList(Node head) {
        
        Node current = head;
        if (head == null){
            return head;
        }
        Map<Node, Node> nodeMap = new HashMap<>();
        Node prevNew = null;
        //int count = 0;
        Node newHead = null;
        while(current !=null){
           
            Node newNode = new Node(current.val);
            if (current == head){
                newHead = newNode;
            }
            nodeMap.put(current,newNode);
             if(prevNew != null){
                prevNew.next = newNode;
            }
            prevNew = newNode;
            current = current.next;
           // count++;

        }
        

        //for(Node key, Node newNodeValue : nodeMap.entrySet() ){
        for(Map.Entry<Node, Node> entry : nodeMap.entrySet() ){
            Node key = entry.getKey();
            Node newNodeValue = entry.getValue();
            if(key.random != null){
                newNodeValue.random = nodeMap.get(key.random);
            }
        }
     // current = head;
        // while(current != null){
        //     System.out.println(current.val);
        //     current = current.next;
        // }

        return newHead;

    }
}
/*
create a simple copy

keep an hashmap with value as key and value as node pointer

*/