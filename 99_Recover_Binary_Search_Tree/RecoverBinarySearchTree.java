class RecoverBinarySearchTree {
    class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode (int _val) {
            val = _val;
        }
    }

    public void recoverTree (TreeNode root) {
        TreeNode a = new TreeNode(0);
        TreeNode b = new TreeNode(0);


    }

    private int preorder (TreeNode t) {
        if (t == null) return 0;
        int l = preorder(t.left);
        int r = preorder(t.right);
        
    }
}