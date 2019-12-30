import java.util.ArrayList;
import java.util.List;

class PrintBinaryTree_mysolution {
    class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        public TreeNode (int _val) {
            val = _val;
        }
    }

    public List<List<String>> printTree(TreeNode root) {
        // 1. Get the depth of the tree
        int maxDepth = getDepth(root);
        // 2. Calculate the width of the 2-d List
        int width = 0, count = maxDepth;
        while (count-- > 0) {
            width = width * 2 + 1;
        }
        // 3. Initialize the 2-d List
        List<List<String>> res = new ArrayList<>(maxDepth);
        for (int i = 0; i < maxDepth; i++) {
            List<String> list = new ArrayList<>();
            for (int j = 0; j < width; j++) {
                list.add("");
            }
            res.add(list);
        }
        helper (root, 1, 0, width, res);
        return res;
    }

    private void helper (TreeNode root, int depth, int start, int end, List<List<String>> res) {
        if (root == null || start > end) return;
        int insert = start + (end - start) / 2;
        for (int i = start; i <= end; i++){
            if (i == insert) {
                res.get(depth - 1).set(i, root.val + "");
                break;
            }
        }
        helper(root.left, depth + 1, start, insert - 1, res);
        helper(root.right, depth + 1, insert + 1, end, res);
    }

    private int getDepth (TreeNode root) {
        if (root == null) return 0;
        return Math.max(getDepth(root.left), getDepth(root.right)) + 1;
    }
};