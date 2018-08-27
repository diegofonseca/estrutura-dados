package br.eti.diegofonseca.tree;

/**
 * @version 0.1 
 * @author Diego da Fonseca
 */
public class BinaryTree {
    public Node root;

    public BinaryTree(Node root) {
        this.root = root;
    }
    
    public static Node insert(Node root, int value) {
        if(root == null) 
            return new Node(value);

        if(root.value > value)
            root.left = insert(root.left, value);
        else
            root.right = insert(root.right, value);

        return root;
    }
    
    public static Node remove(Node root, int value) {
        if (root != null) {
            if (root.value == value)
                return null;
            
            if(root.value > value)
                root.left = remove(root.left, value);
            else
                root.right = remove(root.right, value);
        }
        return root;
    }
    
    public static void show(Node root) {
        if (root != null) {
            show(root.left);
            System.out.print(root.value + " | ");
            show(root.right);
        }
    }
}
