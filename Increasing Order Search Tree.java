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
    public TreeNode increasingBST(TreeNode root) {
        Queue<TreeNode> queue = new LinkedList();
        fillQueue(queue, root);
        TreeNode ans = new TreeNode(queue.poll().val);
        root = ans;
        while(!queue.isEmpty()){
            root.right = new TreeNode(queue.poll().val);
            root = root.right;
        }
        return ans;
    }
    
    public void fillQueue(Queue<TreeNode> queue, TreeNode root){
        if(root.left != null){
            fillQueue(queue, root.left);
        }
        queue.add(root);
        if(root.right != null){
            fillQueue(queue, root.right);
        }
    }
}