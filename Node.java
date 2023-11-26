import java.util.LinkedList;
import java.util.Queue;

public class Node {
    String data;
    TreeNode left;
    TreeNode right;

    public Node(String data) {
        this.data = data;
        this.left = null;
        this.right = null;
    }
}

class BinaryTree {
    TreeNode root;

    public BinaryTree() {
        root = null;
    }

    public int countNodes(TreeNode node) {
        if (node == null)
            return 0;
        return 1 + countNodes(node.left) + countNodes(node.right);
    }

    public void inOrderTraversal(TreeNode node) {
        if (node != null) {
            inOrderTraversal(node.left);
            System.out.print(node.data + " ");
            inOrderTraversal(node.right);
        }
    }

    public void preOrderTraversal(TreeNode node) {
        if (node != null) {
            System.out.print(node.data + " ");
            preOrderTraversal(node.left);
            preOrderTraversal(node.right);
        }
    }

    public void postOrderTraversal(TreeNode node) {
        if (node != null) {
            postOrderTraversal(node.left);
            postOrderTraversal(node.right);
            System.out.print(node.data + " ");
        }
    }

    public void levelOrderTraversal(TreeNode root) {
        if (root == null)
            return;
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);

        while (!queue.isEmpty()) {
            TreeNode tempNode = queue.poll();
            System.out.print(tempNode.data + " ");

            if (tempNode.left != null)
                queue.add(tempNode.left);

            if (tempNode.right != null)
                queue.add(tempNode.right);
        }
    }

    public int height(TreeNode node) {
        if (node == null)
            return 0;
        int leftHeight = height(node.left);
        int rightHeight = height(node.right);
        return Math.max(leftHeight, rightHeight) + 1;
    }

    public int depth(TreeNode node, String value, int depth) {
        if (node == null)
            return -1;

        if (node.data.equals(value))
            return depth;

        int leftDepth = depth(node.left, value, depth + 1);
        if (leftDepth != -1)
            return leftDepth;

        int rightDepth = depth(node.right, value, depth + 1);
        return rightDepth;
    }

    public boolean isFull() {
        int height = height(root);
        return countNodes(root) == (1 << height) - 1;
    }

    public boolean isBalanced(TreeNode node) {
        if (node == null)
            return true;
        int leftHeight = height(node.left);
        int rightHeight = height(node.right);
        return Math.abs(leftHeight - rightHeight) <= 1 && isBalanced(node.left) && isBalanced(node.right);
    }

    public boolean isPerfect() {
        int height = height(root);
        return countNodes(root) == (1 << height) - 1;
    }

    public boolean isComplete() {
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        boolean nonFullNodeFound = false;

        while (!queue.isEmpty()) {
            TreeNode node = queue.poll();

            if (node == null)
                nonFullNodeFound = true;
            else {
                if (nonFullNodeFound)
                    return false;
                queue.add(node.left);
                queue.add(node.right);
            }
        }
        return true;
    }

    public void remove(String value) {
        root = remove(root, value);
    }

    private TreeNode remove(TreeNode node, String value) {
        if (node == null)
            return node;

        if (value.compareTo(node.data) < 0)
            node.left = remove(node.left, value);
        else if (value.compareTo(node.data) > 0)
            node.right = remove(node.right, value);
        else {
            if (node.left == null)
                return node.right;
            else if (node.right == null)
                return node.left;
            node.data = minValue(node.right);
            node.right = remove(node.right, node.data);
        }
        return node;
    }

    private String minValue(TreeNode node) {
        String minValue = node.data;
        while (node.left != null) {
            minValue = node.left.data;
            node = node.left;
        }
        return minValue;
    }

    public void add(String value) {
        root = add(root, value);
    }

    private TreeNode add(TreeNode node, String value) {
        if (node == null)
            return new TreeNode(value);

        if (value.compareTo(node.data) < 0)
            node.left = add(node.left, value);
        else if (value.compareTo(node.data) > 0)
            node.right = add(node.right, value);
        return node;
    }

    public boolean search(String value) {
        return search(root, value);
    }

    private boolean search(TreeNode node, String value) {
        if (node == null)
            return false;
        if (node.data.equals(value))
            return true;
        return search(node.left, value) || search(node.right, value);
    }
}
