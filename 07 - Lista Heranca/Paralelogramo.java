/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lista1;

/**
 *
 * @author joaoe
 */
public class Paralelogramo extends Figura{
    double ladoA;
    double ladoB;

    public Paralelogramo(double ladoA, double ladoB) {
        this.ladoB = ladoA;
        this.ladoB = ladoB;
    }

    @Override
    double getArea() {
        double a;
        a = ladoA*ladoB;
        this.area = a;
        return a;
    }
    @Override
    public String toString(){
        return  "A área do paralelogramo de raio é "+area;
    }
}
