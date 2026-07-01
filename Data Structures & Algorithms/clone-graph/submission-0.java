/*
Definition for a Node.
class Node {
    public int val;
    public List<Node> neighbors;
    public Node() {
        val = 0;
        neighbors = new ArrayList<Node>();
    }
    public Node(int _val) {
        val = _val;
        neighbors = new ArrayList<Node>();
    }
    public Node(int _val, ArrayList<Node> _neighbors) {
        val = _val;
        neighbors = _neighbors;
    }
}
*/

class Solution {
    public Node cloneGraph(Node node) {
        HashMap<Node, Node> nodeMap = new HashMap();
        Queue<Node> queue = new LinkedList();
        Node root = null;
        if(node != null){
        root = new Node(node.val, new ArrayList<Node>());
        nodeMap.put(node,root);
        queue.add(node);
        }
       

        while(!queue.isEmpty()){
            Node current = queue.remove();
            Node newCurrent = nodeMap.get(current);
            for (Node neighbor : current.neighbors){
                Node next = null;
                if(!nodeMap.containsKey(neighbor)){
                    next = new Node(neighbor.val, new ArrayList<Node>());
                    nodeMap.put(neighbor,next);
                    queue.add(neighbor);
                }else{
                    next = nodeMap.get(neighbor);
                    
                }

                newCurrent.neighbors.add(next);
            }
        }
        return root;
    }
}

