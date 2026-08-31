public class Balance {
    /**
     * Definition for a binary tree node.
     * public class TreeNode {
     * int val;
     * TreeNode left;
     * TreeNode right;
     * TreeNode() {}
     * TreeNode(int val) { this.val = val; }
     * TreeNode(int val, TreeNode left, TreeNode right) {
     * this.val = val;
     * this.left = left;
     * this.right = right;
     * }
     * }
     */

    public class Pair {
        Integer depth;
        Boolean isBal;

        Pair(int depth, boolean isBal) {
            this.depth = depth;
            this.isBal = isBal;
        }
    }

    public Pair check(TreeNode root) {

        if (root == null) {
            return new Pair(0, true);
        }

        Pair left = check(root.left);
        Pair right = check(root.right);

        if (Math.abs(left.depth - right.depth) > 1 || !left.isBal || !right.isBal) {
            return new Pair(0, false);
        } else {
            return new Pair(Math.max(left.depth, right.depth) + 1, true);
        }

    }

    public boolean isBalanced(TreeNode root) {

        if (root == null) {
            return true;
        }

        return check(root).isBal;

    }
}
