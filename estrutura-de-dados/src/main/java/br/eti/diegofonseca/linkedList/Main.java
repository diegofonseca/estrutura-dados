/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.eti.diegofonseca.linkedList;

import javax.swing.JOptionPane;

/**
 *
 * @author 3019657
 */
public class Main {
    public static void main(String[] args) {
        LinkedList l = new LinkedList();
        
        while (true) {
            String op = JOptionPane.showInputDialog(
                "Escolha uma opção:" +
                "\n 1 - Insert begin" +
                "\n 2 - Insert end" +
                "\n 3 - Remove" +
                "\n 4 - Show" +
                "\n 5 - Close"
            );
            if (op.equals("1")) {                
                l.push(ler("Type a value to insert"));
            }
            if (op.equals("2")) {
                l.append(ler("Type a value to insert"));
            }
            if (op.equals("3")) {
                l.delete(ler("Type a value to remove"));
            }
            if (op.equals("4")) {
                l.show();
            }
            if (op.equals("5")) {
                return;
            }
        }
    }  
    
    private static int ler(String message) {
        return Integer.parseInt(JOptionPane.showInputDialog(message));
    }
}
