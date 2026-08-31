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

class Pair {
    Integer depth;
    Integer dia;

    Pair(int depth, int dia){
        this.depth = depth;
        this.dia = dia;
    }
}

class Dia {

    public Pair find(TreeNode root){
        if(root == null){
            return new Pair(0,0);
        }

        Pair L = find(root.left);
        Pair R = find(root.right);

        int curr = L.depth + R.depth;

        return new Pair(Math.max(L.depth, R.depth) + 1, Math.max(curr, Math.max(L.dia, R.dia)));
    }

    public int diameterOfBinaryTree(TreeNode root) {
        if(root == null){
            return 0;
        }
        return find(root).dia;
    }
}