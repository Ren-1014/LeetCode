public class N226 {
    public TreeNode invertTree(TreeNode root) {
        if (root == null) {
            return null;
        }
        TreeNode l = root.left;
        root.left = invertTree(root.right);
        root.right = invertTree(l);
        return root;
    }
}
