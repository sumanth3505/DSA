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
    public int maxLevelSum(TreeNode root) {
        Queue<TreeNode> q=new LinkedList<>();
        q.offer(root);
        int level=1;
        int maxlevel=1;
        int maxSum=Integer.MIN_VALUE;
        while(!q.isEmpty()){
            int size=q.size();
            int lsum=0;
            for(int i=0;i<size;i++){
                TreeNode n=q.poll();
                lsum+=n.val;
                if(n.left!=null)q.offer(n.left);
                if(n.right!=null)q.offer(n.right);
            }
            if(lsum>maxSum){
                maxSum=lsum;
                maxlevel=level;
            }
            level++;
        }
        return maxlevel;
    }
}