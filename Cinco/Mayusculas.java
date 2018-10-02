/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Cinco;

import javax.swing.*;

/**
 *
 * @author rolia
 */
public class Mayusculas {
    
    public static void main(String args[]){
        Mayusculas obj = new Mayusculas();
        String ent = JOptionPane.showInputDialog("Entrada");
        String Salida = ent;
        JOptionPane.showMessageDialog(null,"" + Salida.toUpperCase());
    }
   
}
