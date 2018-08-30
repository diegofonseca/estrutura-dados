/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.eti.diegofonseca.linkedList;

import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.Rule;
import org.junit.contrib.java.lang.system.SystemOutRule;

/**
 *
 * @author Diego da Fonseca
 */
public class LinkedListTest {
    
    @Rule
    public final SystemOutRule systemOutRule = new SystemOutRule().enableLog();

    /**
     * Test of print method, of class LinkedList.
     */
    @Test
    public void testPrint() {
        LinkedList instance = new LinkedList();
        instance.push(1);
        instance.push(2);
        instance.show();
        assertEquals("2 1 ", systemOutRule.getLog());
    }

    /**
     * Test of push method, of class LinkedList.
     */
    @Test
    public void testPush() {
        LinkedList instance = new LinkedList();
        instance.push(1);
        instance.push(2);
        assertEquals(2, instance.head.value);
        assertEquals(1, instance.head.next.value);
    }

    /**
     * Test of append method, of class LinkedList.
     */
    @Test
    public void testAppend() {
       LinkedList instance = new LinkedList();
        instance.append(1);
        instance.append(2);
        assertEquals(1, instance.head.value);
        assertEquals(2, instance.head.next.value);
    }

    /**
     * Test of delete method, of class LinkedList.
     */
    @Test
    public void testDelete() {
        LinkedList instance = new LinkedList();
        instance.push(1);
        instance.push(2);
        instance.delete(2);
        assertEquals(1, instance.head.value);
        assertNull(instance.head.next);
    }
    /**/
}
