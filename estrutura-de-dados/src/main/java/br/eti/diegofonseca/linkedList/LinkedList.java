package br.eti.diegofonseca.linkedList;

/**
 * @author Diego da Fonseca
 */
public class LinkedList {
    public Node head;
    
    public void show() {
        Node head = this.head;
        while (head != null) {
            System.out.print(head.value + " ");
            head = head.next;
        }
    }
    
    public void push(int value) {
        Node new_node = new Node(value);
        
        new_node.next = head;
        
        head = new_node;
    }
    
    public void append(int value) {
        Node new_node = new Node(value);
        
        if (head == null) {
            head = new_node;
            return;
        }
        
        Node last = head;
        while (last.next != null) 
            last = last.next;
        
        last.next = new_node;
    }
    
    public void delete(int value) {
        Node temp = head;
        Node prev = null;
        
        if (temp != null && temp.value == value) {
            head = temp.next;
            return;
        }
        
        while (temp != null && temp.value != value) {
            prev = temp;
            temp = temp.next;
        }
        
        if (temp == null)
            return;
        
        prev.next = temp.next;
    }
}
