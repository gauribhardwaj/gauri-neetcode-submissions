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
     int maxSum = Integer.MIN_VALUE;
    public int maxPathSum(TreeNode root) {
        maxSum = Integer.MIN_VALUE;
        calculateHeight(root);
        return maxSum;

    }

    private int calculateHeight(TreeNode node) {
        if (node == null) {
           return 0;
        }
        int leftHeight = Math.max(calculateHeight(node.left),0);
        int rightHeight = Math.max(calculateHeight(node.right),0);
        int currentPathSum =  node.val + leftHeight + rightHeight;      
        maxSum = Math.max(maxSum, currentPathSum);

         return node.val + Math.max(leftHeight,rightHeight);
    }
}
