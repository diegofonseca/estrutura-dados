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
                "\n 1 - Insert at the begging" +
                "\n 2 - Insert at the end" +
                "\n 3 - Remove" +
                "\n 4 - Show" +
                "\n 5 - Close"
            );
            if (op.equals("1")) {                
                l.push(ler("Type the value you want to insert"));
            }
            if (op.equals("2")) {
                l.append(ler("Type the value you want to insert"));
            }
            if (op.equals("3")) {
                l.delete(ler("Type the value you want to remove"));
            }
            if (op.equals("4")) {
                System.out.print("..:: ");
                l.show();
                System.out.println("::..");
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
