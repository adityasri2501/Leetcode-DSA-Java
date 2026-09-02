
public class Zig {
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
    class Pair {
        Integer depth;
        TreeNode curr;

        Pair(int depth, TreeNode curr) {
            this.depth = depth;
            this.curr = curr;
        }
    }

    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> list = new ArrayList<>();
        ArrayDeque<Pair> qu = new ArrayDeque<>();

        if (root == null) {
            return list;
        }

        qu.offer(new Pair(1, root));

        while (qu.size() > 0) {
            Pair C = qu.poll();

            if (C.depth > list.size()) {
                list.add(new ArrayList<>(List.of(C.curr.val)));
            } else {
                list.get(list.size() - 1).add(C.curr.val);
            }

            if (C.curr.left != null) {
                qu.offer(new Pair(C.depth + 1, C.curr.left));
            }

            if (C.curr.right != null) {
                qu.offer(new Pair(C.depth + 1, C.curr.right));
            }

        }

        for (int i = 0; i < list.size(); i++) {
            if (i % 2 != 0) {
                Collections.reverse(list.get(i));
            }
        }

        return list;
    }
}
