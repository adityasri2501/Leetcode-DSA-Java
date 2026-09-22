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

    public void pre(TreeNode sub_root, List<Integer> res){
        if(sub_root == null){
            return;
        }

        res.add(sub_root.val);

        pre(sub_root.left, res);

        pre(sub_root.right, res);

    }

    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> res = new ArrayList<>();

        pre(root, res);

        return res;
    }
}