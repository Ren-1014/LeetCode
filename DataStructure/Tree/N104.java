public class N104 {
    public int maxDepth(TreeNode root) {
        // DFS
        if (root == null) {
            return 0;
        } else {
            int leftHeight = maxDepth(root.left);
            int rightHeight = maxDepth(root.right);
            return Math.max(leftHeight, rightHeight) + 1;
        }

        // BFS
        // if (root == null) {
        // return 0;
        // }
        // Queue<TreeNode> queue = new LinkedList<TreeNode>();
        // queue.offer(root);
        // int ans = 0;
        // while (!queue.isEmpty()) {
        // int size = queue.size();
        // while (size > 0) {
        // TreeNode node = queue.poll();
        // if (node.left != null) {
        // queue.offer(node.left);
        // }
        // if (node.right != null) {
        // queue.offer(node.right);
        // }
        // size--;
        // }
        // ans++;
        // }
        // return ans;

    }
}
