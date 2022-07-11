class Solution {
    public List<Integer> rightSideView(TreeNode root) {
        List<Integer> l = new ArrayList<>();
        if(root == null) return l;
        
        // first -> node
        // second-> node level
        Queue<Pair<TreeNode, Integer>> q = new LinkedList<>();
        
        // Starting traversal with root node having level 0
        int level = 0;
        q.add(new Pair(root, level));
        
        while(!q.isEmpty()){
            
            // Node at the top of the queue (for rightmost node of the level)
            l.add(q.peek().getKey().val);
            
            // Clear the complete level from queue after adding children in queue
            while(q.peek() != null && q.peek().getValue() == level){
                TreeNode temp = q.remove().getKey();
                if(temp.right != null) q.add(new Pair(temp.right, level+1));
                if(temp.left != null) q.add(new Pair(temp.left, level+1));
            }
            
            level++;
        }
        
        return l;
    }
}