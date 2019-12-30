class BinaryTreePruning_Recursion {
    class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        public TreeNode (int _val) {
            this.val = _val;
        }
    }

    public TreeNode pruneTree (TreeNode root) {
        return containsOne(root) ? root : null;
    }
    private boolean containsOne (TreeNode node) {
        if (node == null) return false;
        boolean left = containsOne(node.left);
        boolean right = containsOne(node.right);
        if (!left) node.left = null;
        if (!right) node.right = null;
        return (node.val == 1) || left || right;
    }
}