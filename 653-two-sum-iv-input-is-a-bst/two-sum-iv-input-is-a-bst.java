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
    public boolean findTarget(TreeNode root, int k) {
        if(root==null){
            return false;
        }
        Bst l=new Bst(root,false);
        Bst r=new Bst(root,true);
        int i=l.next();
        int j=r.next();
        while (i < j) {
            if (i + j == k) {
                // If the sum is found,
                // return true
                return true;
            } else if (i + j < k) {
                // Move to the next element
                // from the left iterator
                i = l.next();
            } else {
                // Move to the next element
                // from the right iterator
                j = r.next();
            }
        }
        return false;
    }
}
class Bst{
    private Stack<TreeNode> st;
    boolean rev;
    public Bst(TreeNode root,boolean isrev){
        st=new Stack<>();
        rev=isrev;
        pushAll(root);
    }
    public boolean hasNext(){
        return !st.isEmpty();
    }
    public int next(){
        TreeNode temp=st.pop();
        if (!rev) {
            
            pushAll(temp.right);
        } else {

            pushAll(temp.left);
        }

        return temp.val;
    }
    public void pushAll(TreeNode node){
        while(node!=null){
            st.push(node);
            if (rev) {
                node = node.right;
            } else {
                node = node.left;
            }
        }
    }
}