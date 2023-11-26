import java.util.LinkedList;
import java.util.Queue;

public class Node {
    Node right;
    Node left;
    int data;
    
    public Node (int data) {
        this.data = data;
        this.left = this.right = null;
    }
}

class BinaryTree {
    Node root;

    public BinaryTree() {
        root = null;
    }

    public int countNodes(Node node) {
        if (node == null)
            return 0;
        return 1 + countNodes(node.left) + countNodes(node.right);
    }

    public void inOrderTraversal(Node node) {
        if (node != null) {
            inOrderTraversal(node.left);
            System.out.print(node.data + " ");
            inOrderTraversal(node.right);
        }
    }

    public void preOrderTraversal(Node node) {
        if (node != null) {
            System.out.print(node.data + " ");
            preOrderTraversal(node.left);
            preOrderTraversal(node.right);
        }
    }

    public void postOrderTraversal(Node node) {
        if (node != null) {
            postOrderTraversal(node.left);
            postOrderTraversal(node.right);
            System.out.print(node.data + " ");
        }
    }

    public void levelOrderTraversal(Node root) {
        if (root == null)
            return;
        Queue<Node> queue = new LinkedList<>();
        queue.add(root);

        while (!queue.isEmpty()) {
            Node tempNode = queue.poll();
            System.out.print(tempNode.data + " ");

            if (tempNode.left != null)
                queue.add(tempNode.left);

            if (tempNode.right != null)
                queue.add(tempNode.right);
        }
    }

    public int height(Node node) {
        if (node == null)
            return 0;
        int leftHeight = height(node.left);
        int rightHeight = height(node.right);
        return Math.max(leftHeight, rightHeight) + 1;
    }

    public int depth(Node node, int value, int depth) {
        if (node == null)
            return -1;

        if (node.data == value)
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

    public boolean isBalanced(Node node) {
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
        Queue<Node> queue = new LinkedList<>();
        queue.add(root);
        boolean nonFullNodeFound = false;

        while (!queue.isEmpty()) {
            Node node = queue.poll();

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

    public void remove(int value) {
        root = remove(root, value);
    }

    private Node remove(Node node, int value) {
        if (node == null)
            return node;

        if (value < node.data)
            node.left = remove(node.left, value);
        else if (value > node.data)
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

    private int minValue(Node node) {
        int minValue = node.data;
        while (node.left != null) {
            minValue = node.left.data;
            node = node.left;
        }
        return minValue;
    }

    public boolean search(int value) {
        return search(root, value);
    }

    private boolean search(Node node, int value) {
        if (node == null)
            return false;
        if (node.data == value)
            return true;
        return search(node.left, value) || search(node.right, value);
    }

    public int sumNodes() {
        return sumNodes(root);
    }

    private int sumNodes(Node node) {
        if (node == null)
            return 0;
        return node.data + sumNodes(node.left) + sumNodes(node.right);
    }
}
