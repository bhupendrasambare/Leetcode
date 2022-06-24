/*
// Definition for a Node.
class Node {
    public int val;
    public Node left;
    public Node right;
    public Node next;

    public Node() {}
    
    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, Node _left, Node _right, Node _next) {
        val = _val;
        left = _left;
        right = _right;
        next = _next;
    }
};
*/

class Solution {
    public Node connect(Node root) {
        if(root == null) return null;
        Queue<Node> queue = new LinkedList<Node>();
        queue.add(root);
        int lvl = 1;
        int count = 1;
        while(!queue.isEmpty()){      
            Node popElement = queue.poll();
            if(count == lvl){
                popElement.next = null;
                lvl = 1 + lvl*2;
            }
            else
                popElement.next = queue.peek();
            
            if(popElement.left != null){
                queue.add(popElement.left);
                queue.add(popElement.right);
            }
            
            ++count;
        }
        return root;
    }
}