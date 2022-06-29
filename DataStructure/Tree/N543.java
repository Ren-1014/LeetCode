public class N543 {
    private int max;

    public int diameterOfBinaryTree(TreeNode root) {
        maxRoot(root);
        return max;
    }

    private int maxRoot(TreeNode root) {
        if (root == null) {
            return 0;
        }
        int l = maxRoot(root.left);
        int r = maxRoot(root.right);
        max = Math.max(max, l + r);
        return Math.max(l, r) + 1;
    }
}
