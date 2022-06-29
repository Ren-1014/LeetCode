import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class N144 {
    public List<Integer> preorderTraversal(TreeNode root) {
        // 非递归
        List<Integer> ret = new ArrayList<>();
        Stack<TreeNode> stack = new Stack<>();
        stack.push(root);
        while (!stack.isEmpty()) {
            TreeNode node = stack.pop();
            ret.add(node.val);
            if (node.right != null) {
                stack.push(node.right);
            }
            if (node.left != null) {
                stack.push(node.left);
            }

        }
        return ret;
    }

    /*
     * 递归
     * public List<Integer> preorderTraversal(TreeNode root) {
     * List<Integer> res = new ArrayList<>();
     * preorder(root, res);
     * return res;
     * }
     * 
     * public void preorder(TreeNode root, List<Integer> res) {
     * if (root == null) {
     * return;
     * }
     * res.add(root.val);
     * preorder(root.left, res);
     * preorder(root.right, res);
     * }
     */
}
