public class N437 {
    public int pathSum(TreeNode root, int targetSum) {
        if (root == null) {
            return 0;
        }
        int res = rootSum(root, targetSum) + pathSum(root.left, targetSum) + pathSum(root.right, targetSum);
        return res;
    }

    public int rootSum(TreeNode root, int targetSum) {
        if (root == null) {
            return 0;
        }
        int ans = 0;
        if (root.val == targetSum) {
            ans++;
        }

        ans += rootSum(root.left, targetSum - root.val) + rootSum(root.right, targetSum - root.val);
        return ans;
    }
}
