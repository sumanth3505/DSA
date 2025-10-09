/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */

class Solution {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if(root==null)return null;
        TreeNode curr=root;
        if(curr.val>p.val && curr.val>q.val){
            return lowestCommonAncestor(root.left, p, q);
        }
        if(curr.val<p.val && curr.val<q.val){
            return lowestCommonAncestor(root.right, p,q);
        }
        return root;
    }
}