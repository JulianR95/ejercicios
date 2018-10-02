
package Uno;

import javax.swing.*;

/**
 *
 * @author rolia
 */
public class Triangulo {
    public static void main(String args[]){
        Triangulo Objeto = new Triangulo();
        double alt,bas;
        bas = Double.parseDouble(JOptionPane.showInputDialog("Base: "));
        alt = Double.parseDouble(JOptionPane.showInputDialog("Altura: "));
        JOptionPane.showMessageDialog(null, "Area: " + Objeto.area(bas, alt));
        JOptionPane.showMessageDialog(null,"Perimetro" + Objeto.perimetro(bas));
    }
    
    
    public double area(double base,double altura){
        double area = (base * altura) /2 ;
        return area;
    }
    
    public double perimetro(double base){
        double per = base * 3; 
        return per;
    }
}
