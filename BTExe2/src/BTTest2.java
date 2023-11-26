public class BTTest2 {
   
    public static void main(String[] args) {
        
        BinaryTree tree = new BinaryTree();
        
        tree.root = new TreeNode("apple");
        tree.add("banana");
        tree.add("cherry");
        tree.add("orange");
        tree.add("kiwi");
        tree.add("pear");
        tree.add("grape");
        tree.add("pineapple");
        tree.add("mango");
        tree.add("strawberry");

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

        String valueToFind = "banana";
        System.out.println("Depth of " + valueToFind + ": " + tree.depth(tree.root, valueToFind, 0));

        System.out.println("Is the binary tree full? " + tree.isFull());

        System.out.println("Is the binary tree balanced? " + tree.isBalanced(tree.root));

        System.out.println("Is the binary tree perfect? " + tree.isPerfect());

        System.out.println("Is the binary tree complete? " + tree.isComplete());
        
        tree.remove("orange");
        tree.remove("kiwi");
        
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
        
        tree.add("lemon");
        tree.add("lime");
        tree.add("coconut");
        
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
        
    }
}
