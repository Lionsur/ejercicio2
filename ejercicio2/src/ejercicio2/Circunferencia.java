package ejercicio2;

import java.util.Scanner;

/**
 * Declarar una clase llamada Circunferencia que tenga como atributo privado el
 * radio de tipo real. A continuación, se deben crear los siguientes métodos: a)
 * Método constructor que inicialice el radio pasado como parámetro. b) Métodos
 * get y set para el atributo radio de la clase Circunferencia. c) Método para
 * crearCircunferencia(): que le pide el radio y lo guarda en el atributo del
 * objeto. d) Método area(): para calcular el área de la circunferencia (area =
 * pi * radio2). e) Método perimetro(): para calcular el perímetro (perimetro =
 * 2 ∗ pi ∗ readio).
 */
public class Circunferencia {

    Scanner leer = new Scanner(System.in);

    private double radio;

    public Circunferencia() {
    }

    public Circunferencia(double radio) {
        this.radio = radio;
    }

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }

    public void CrearCircunferencia(double radio) {

        this.radio = radio;
    }

    public void area() {

        System.out.println(radio * radio * 3.14);
    }

    public void perimetro() {

        System.out.println(2 * 3.14 * radio);
    }

    @Override
    public String toString() {
        return "Circunferencia{" + "radio=" + radio + '}';
    }

}
