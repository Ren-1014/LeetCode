public class N111 {
    public int minDepth(TreeNode root) {
        if (root == null) {
            return 0;
        }
        int left = minDepth(root.left);
        int right = minDepth(root.right);
        if (left == 0 || right == 0) {
            return left + right + 1;
        }
        return Math.min(left, right) + 1;
        // if (root == null) {
        // return 0;
        // }
        // if (root.left == null) {
        // return minDepth(root.right) + 1;
        // } else if (root.right == null) {
        // return minDepth(root.left) + 1;
        // }
        // return Math.min(minDepth(root.left), minDepth(root.right)) + 1;
    }
}
