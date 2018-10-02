/* / /
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tres;

import javax.swing.JOptionPane;

/**
 *
 * @author rolia
 */
public class Convertir {
    public static void main(String args[]){
        JOptionPane.showMessageDialog(null, "Convertir de grados centigrados a Farenheit");
        Convertir obj = new Convertir();
        double centi = Double.parseDouble(JOptionPane.showInputDialog("Escriba los grados Centigrados a convertir(°C): "));
        JOptionPane.showMessageDialog(null,"Grados Centigrados: " + centi + "°C\n"
                + "Grados Farenheit: " + obj.grados(centi) + "°F");
    }
    
    public double grados(double grado){
        double faren;
        faren = ((grado * 9) / 5) + 32;
        return faren;
    }
}
