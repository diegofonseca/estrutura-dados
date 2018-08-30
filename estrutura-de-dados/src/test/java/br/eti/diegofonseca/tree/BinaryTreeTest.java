/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.eti.diegofonseca.tree;

import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.Rule;
import org.junit.contrib.java.lang.system.SystemOutRule;

/**
 *
 * @author Diego da Fonseca
 */
public class BinaryTreeTest {
    
    @Rule
    public final SystemOutRule systemOutRule = new SystemOutRule().enableLog();
    
    public BinaryTreeTest() {
    }

    /**
     * Test of insert method, of class BinaryTree.
     */
    @Test
    public void testInsert() {
        Node root = new Node(10);
        Node result = BinaryTree.insert(root, 10);
        assertEquals(10, result.value);
    }

    /**
     * Test of remove method, of class BinaryTree.
     */
    @Test
    public void testRemove() {        
        Node root = new Node(10);
        BinaryTree.insert(root, 5);
        BinaryTree.insert(root, 15);
        root = BinaryTree.remove(root, 5);
        root = BinaryTree.remove(root, 15);
        assertNull(root.left);
        assertNull(root.right);
    }

    /**
     * Test of show method, of class BinaryTree.
     */
    @Test
    public void testShow() {
        Node root = new Node(10);
        BinaryTree.show(root);  
        assertEquals("10 | ", systemOutRule.getLog());
    }
    
    /**
     * Test of height method, of class BinaryTree.
     */
    @Test
    public void testHeight() {
        Node root = new Node(10);
        BinaryTree.show(root);  
        root = BinaryTree.insert(root, 13);
        root = BinaryTree.insert(root, 15);
        root = BinaryTree.insert(root, 8);
        root = BinaryTree.insert(root, 6);
        root = BinaryTree.insert(root, 9);
        root = BinaryTree.insert(root, 12);
              
        assertEquals(3, BinaryTree.height(root));
        
        root = BinaryTree.insert(root, 16);
        root = BinaryTree.insert(root, 7);
        root = BinaryTree.insert(root, 5);
        assertEquals(4, BinaryTree.height(root));
    }
    
    
    
    /**
     * Test of search method, of class BinaryTree.
     */
    @Test
    public void testSearch() {
        Node root = new Node(10);
        BinaryTree.show(root);  
        root = BinaryTree.insert(root, 13);
        root = BinaryTree.insert(root, 15);
        root = BinaryTree.insert(root, 8);
        root = BinaryTree.insert(root, 6);
        root = BinaryTree.insert(root, 9);
        root = BinaryTree.insert(root, 12);
        root = BinaryTree.insert(root, 16);
        root = BinaryTree.insert(root, 7);
        root = BinaryTree.insert(root, 5);
        Node found = BinaryTree.search(root, 16);
        assertEquals(16, found.value);
    }
}
