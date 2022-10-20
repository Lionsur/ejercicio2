/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio2;

import java.util.Scanner;

/**
 *
 * @author lionel
 */
public class ejercicio2 {

    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Circunferencia circle = new Circunferencia ();
    
           Scanner leer= new Scanner (System.in);
           Double dato= leer.nextDouble();
           circle.setRadio(dato);
           System.out.println(circle);
           circle.perimetro();
           circle.area();
    }
}

