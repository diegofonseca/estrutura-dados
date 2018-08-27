/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.eti.diegofonseca.tree;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Diego da Fonseca
 */
public class BinaryTreeTest {
    
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
     *
    @Test
    public void testRemove() {
        System.out.println("remove");
        Node root = null;
        int value = 0;
        Node expResult = null;
        Node result = BinaryTree.remove(root, value);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of show method, of class BinaryTree.
     *
    @Test
    public void testShow() {
        System.out.println("show");
        Node root = null;
        BinaryTree.show(root);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    /**/
}
