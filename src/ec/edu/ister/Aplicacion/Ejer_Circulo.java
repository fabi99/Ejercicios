/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ister.Aplicacion;

import javax.swing.JOptionPane;

/**
 *
 * @author fabian
 */
public class Ejer_Circulo {
    public static void main(String[] args) {
        //Calcule y Visualice el perimetro y el area de un circulo. Ingrese el radio del circulo.
        double pi = 3.1416;
        double radio,area,perimetro;
        radio=Integer.parseInt(JOptionPane.showInputDialog("ingrese el radio de un circulo:"));
        area = pi * radio * radio;
        perimetro = 2 * pi * radio;
        JOptionPane.showMessageDialog(null, "El Area del circulo es: "+ area);
        JOptionPane.showMessageDialog(null, "La perimetro del circulo es: "+ perimetro);
    }
    
}
