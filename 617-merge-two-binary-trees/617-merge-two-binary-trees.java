/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public TreeNode mergeTrees(TreeNode root1, TreeNode root2) {
    if(root1 == null && root2 == null) {
	  // nothing to do if both are null
      return null;
    }
    
	  // if both are nonnull, then we need to add the values and merge their subtrees
    if(root1 != null && root2 != null) {
      root1.val += root2.val;
      root1.left = mergeTrees(root1.left, root2.left);
      root1.right = mergeTrees(root1.right, root2.right);
      return root1;
    }
    
    // Exactly one of root1 and root2 are null at this point
    if(root1 == null) {
      // we need to merge
      return root2;
    }
    
	  // only root1 can be non null at this point
    return root1;
  }
}