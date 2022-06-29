
import java.util.ArrayList;
import java.util.Deque;
import java.util.LinkedList;
import java.util.List;

public class Test {
    public List<Integer> postorderTraversal(TreeNode root) {
        List<Integer> res = new ArrayList<>();
        if (root == null) {
            return res;
        }
        Deque<TreeNode> stack = new LinkedList<>();
        TreeNode node = null;
        while (!stack.isEmpty() || root != null) {
            while (root != null) {
                stack.push(root);
                root = root.left;
            }
            root = stack.pop();
            if (node.right == null || root.right == node) {
                res.add(root.val);
                node = root;
                root = null;
            } else {
                stack.push(root);
                root = root.right;
            }
        }

        return res;
        /**
         * List<Integer> ret = new ArrayList<>();
         * Stack<TreeNode> stack = new Stack<>();
         * stack.push(root);
         * while(!stack.isEmpty()){
         * TreeNode node = stack.pop();
         * if(node == null) continue;
         * ret.add(node.val);
         * stack.push(node.left);
         * stack.push(node.right);
         * }
         * Collections.reverse(ret);
         * return ret;
         */
    }

    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> res = new ArrayList<>();
        if (root == null) {
            return res;
        }
        Deque<TreeNode> stack = new LinkedList<>();
        TreeNode node = root;
        while (!stack.isEmpty() || node != null) {
            while (node != null) {
                stack.push(node);
                node = node.left;
            }
            node = stack.pop();
            res.add(node.val);
            node = node.right;
        }

        return res;
    }

    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> res = new ArrayList<>();
        if (root == null) {
            return res;
        }
        Deque<TreeNode> stack = new LinkedList<>();
        TreeNode node = root;
        while (!stack.isEmpty() || node != null) {
            while (node != null) {
                res.add(node.val);
                stack.push(node);
                node = node.left;
            }
            node = stack.pop();
            node = node.right;
        }

        return res;
    }

    /*
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
