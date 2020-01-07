class BinaryTreeCameras {
    class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode (int _val) {
            val = _val;
        }
    }

    public int minCameraCover (TreeNode root) {
        TreeNode r = new TreeNode(0);
        r.left = root;
        dfs(r);
        return count;
    }

    int count = 0;

    private int dfs (TreeNode t) {
        if (t == null) return 0;

        int l = dfs(t.left);
        int r = dfs(t.right);

        if (l + r == 0) {
            return 1;
        } else if (l == 1 || r == 1) {
            count++;
            return 2;
        } else { // If this node has a child that is equal to 2, then this node can be regarded as null.
            return 0;
        }
    }
}