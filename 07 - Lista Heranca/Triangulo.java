/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lista1;

/**
 *
 * @author joaoe
 */
public class Triangulo extends Figura{
    double ladoA;
    double ladoB;
    double ladoC;

    public Triangulo(double A, double B, double C) {
        this.ladoA = A;
        this.ladoB = B;
        this.ladoC = C;
    }
    @Override
     public double getArea(){
        double A = this.ladoA;
        double B = this.ladoB;
        double C = this.ladoC;
        double p = (A+B+C)/2;
        double a = (float) Math.pow((p*(p-A)*(p-B)*(p-C)), 0.5);
        this.area = a;
        return a;
     }
    @Override
     public String toString(){
        return  "A área do triangulo é "+area;
    }
}
