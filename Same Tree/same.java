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
class Same {

    public boolean check(TreeNode p, TreeNode q){

        if((p.val != q.val) ||
        (p.left == null && q.left != null) ||
        (p.left != null && q.left == null) ||
        (p.right == null && q.right != null) ||
        (p.right != null && q.right == null)
        ){
            return false;
        }

        boolean ans = true;

        if(p.left != null){
            ans &= check(p.left, q.left);
        }

        if(p.right != null){
            ans &= check(p.right, q.right);
        }

        return ans;
    }

    public boolean isSameTree(TreeNode p, TreeNode q) {
        if(p == null){
            if(q == null){
                return true;
            } else {
                return false;
            }
        } else{
            if(q == null){
                return false;
            }
        }
        return check(p,q);
    }
}