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
    
    public static int height(Node root) {  
        if (root == null)
            return 0;
        else {
            return 1 + Integer.max(height(root.left), height(root.right));  
        }
    }
    
    public static Node search(Node root, int value) {
        if (root == null || root.value == value)
            return root;
        
        if (root.value > value)
            return search(root.left, value);
        else
            return search(root.right, value);        
    }
}