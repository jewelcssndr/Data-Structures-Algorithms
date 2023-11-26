public class BTTest {
    
    public static void main(String[] args) {
        
        BinaryTree tree = new BinaryTree();
        
        tree.root = new Node(55);
        tree.root.left = new Node(23);
        tree.root.right = new Node(75);
        tree.root.left.left = new Node(11);
        tree.root.left.right = new Node(50);
        tree.root.left.left.left = new Node(15);
        tree.root.left.left.right = new Node(25);
        tree.root.right.right = new Node(60);
        tree.root.right.right.left = new Node(63);
        tree.root.right.right.right = new Node(69);

        System.out.println("Number of nodes: " + tree.countNodes(tree.root));

        System.out.print("In-order traversal: ");
        tree.inOrderTraversal(tree.root);
        System.out.println();

        System.out.print("Pre-order traversal: ");
        tree.preOrderTraversal(tree.root);
        System.out.println();

        System.out.print("Post-order traversal: ");
        tree.postOrderTraversal(tree.root);
        System.out.println();

        System.out.print("Level order traversal: ");
        tree.levelOrderTraversal(tree.root);
        System.out.println();

        System.out.println("Height of the binary tree: " + tree.height(tree.root));

        int valueToFind = 50;
        System.out.println("Depth of: " + tree.depth(tree.root, valueToFind, 0));

        System.out.println("Is the binary tree full? " + tree.isFull());

        System.out.println("Is the binary tree balanced? " + tree.isBalanced(tree.root));

        System.out.println("Is the binary tree perfect? " + tree.isPerfect());

        System.out.println("Is the binary tree complete? " + tree.isComplete());

        tree.remove(50);
        tree.remove(60);
        tree.remove(75);

        System.out.println("Number of nodes: " + tree.countNodes(tree.root));
        
        System.out.print("In-order traversal: ");
        tree.inOrderTraversal(tree.root);
        System.out.println();
        System.out.print("Pre-order traversal: ");
        tree.preOrderTraversal(tree.root);
        System.out.println();
        System.out.print("Post-order traversal: ");
        tree.postOrderTraversal(tree.root);
        System.out.println();
        System.out.print("Level order traversal: ");
        tree.levelOrderTraversal(tree.root);
        System.out.println();
        System.out.println("Height of the binary tree: " + tree.height(tree.root));
        
        System.out.println("Depth of " + valueToFind + ": " + tree.depth(tree.root, valueToFind, 0));

        System.out.println("Is the binary tree full? " + tree.isFull());

        System.out.println("Is the binary tree balanced? " + tree.isBalanced(tree.root));

        System.out.println("Is the binary tree perfect? " + tree.isPerfect());

        System.out.println("Is the binary tree complete? " + tree.isComplete());
        
        tree.root.left.left.left.left = new Node(5);
        tree.root.left.left.left.right = new Node(10);
        tree.root.left.left.right.left = new Node(20);
        
        System.out.println("Number of nodes: " + tree.countNodes(tree.root));
        
        System.out.print("In-order traversal: ");
        tree.inOrderTraversal(tree.root);
        System.out.println();
        System.out.print("Pre-order traversal: ");
        tree.preOrderTraversal(tree.root);
        System.out.println();
        System.out.print("Post-order traversal: ");
        tree.postOrderTraversal(tree.root);
        System.out.println();
        System.out.print("Level order traversal: ");
        tree.levelOrderTraversal(tree.root);
        System.out.println();
        System.out.println("Height of the binary tree: " + tree.height(tree.root));
        
        System.out.println("Depth of " + valueToFind + ": " + tree.depth(tree.root, valueToFind, 0));

        System.out.println("Is the binary tree full? " + tree.isFull());

        System.out.println("Is the binary tree balanced? " + tree.isBalanced(tree.root));

        System.out.println("Is the binary tree perfect? " + tree.isPerfect());

        System.out.println("Is the binary tree complete? " + tree.isComplete());
        
        int valueToSearch = 25;
        if (tree.search(valueToSearch))
            System.out.println(valueToSearch + " found at depth: " + tree.depth(tree.root, valueToSearch, 0));
        else
            System.out.println(valueToSearch + " not found in the binary tree.");

        System.out.println("Sum of nodes: " + tree.sumNodes());
    }
}