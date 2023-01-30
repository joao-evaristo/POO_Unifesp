/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lista1;

/**
 *
 * @author joaoe
 */
public class Losango extends Paralelogramo{
    
    public Losango(double ladoA, double ladoB) {
        super(ladoA, ladoB);
    }
    @Override
    public String toString(){
        return  "A área do Losango é "+area;
    }
}
