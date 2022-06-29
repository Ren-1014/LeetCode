public class N572 {
    public boolean isSubtree(TreeNode root, TreeNode subRoot) {
        if (root == null) {
            return false;
        }
        return isSubtreeWithRoot(root, subRoot) || isSubtree(root.left, subRoot)
                || isSubtree(root.right, subRoot);
    }

    private boolean isSubtreeWithRoot(TreeNode root, TreeNode subRoot) {
        if (root == null && subRoot == null) {
            return true;
        }
        if (root == null || subRoot == null) {
            return false;
        }
        if (root.val != subRoot.val) {
            return false;
        }
        return isSubtreeWithRoot(root.left, subRoot.left) && isSubtreeWithRoot(root.right, subRoot.right);

    }
}
