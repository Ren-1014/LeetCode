public class N110 {
    private boolean res = true;

    public boolean isBalanced(TreeNode root) {
        maxDepth(root);
        return res;
    }

    public int maxDepth(TreeNode root) {
        if (root == null) {
            return 0;
        }
        int l = maxDepth(root.left);
        int r = maxDepth(root.right);
        if (Math.abs(l - r) > 1) {
            res = false;
        }
        return Math.max(l, r) + 1;
    }
}
