// Define the Node class
class Node {
    int data;
    Node left, right;

    public Node(int item) {
        data = item;
        left = right = null;
    }
}

// Define the BinaryTree class
class BinaryTree {
    Node root;

    // Constructor to initialize the tree
    public BinaryTree() {
        root = null;
    }

    // Method to insert data into the tree
    public void insert(int data) {
        root = insertRec(root, data);
    }

    // Recursive method to insert data
    private Node insertRec(Node root, int data) {
        if (root == null) {
            root = new Node(data);
            return root;
        }
        if (data < root.data) {
            root.left = insertRec(root.left, data);
        } else if (data > root.data) {
            root.right = insertRec(root.right, data);
        }
        return root;
    }

    // Method to perform in-order traversal of the tree
    public void inorder() {
        inorderRec(root);
    }

    // Recursive method for in-order traversal
    private void inorderRec(Node root) {
        if (root != null) {
            inorderRec(root.left);
            System.out.print(root.data + " ");
            inorderRec(root.right);
        }
    }

    // Main method to test the binary tree
    public static void main(String[] args) {
        BinaryTree tree = new BinaryTree();

        /* Insert nodes into the tree */
        tree.insert(50);
        tree.insert(30);
        tree.insert(20);
        tree.insert(40);
        tree.insert(70);
        tree.insert(60);
        tree.insert(80);

        // Print the nodes in in-order traversal
        System.out.println("Inorder traversal:");
        tree.inorder();
    }
}
