public class N669 {
    public TreeNode trimBST(TreeNode root, int low, int high) {
        if (root == null) {
            return null;
        }
        if (root.val > high) {
            return trimBST(root.left, low, high);
        }
        if (root.val < low) {
            return trimBST(root.right, low, high);
        }
        root.right = trimBST(root.left, low, high);
        root.right = trimBST(root.right, low, high);
        return root;
    }
}
