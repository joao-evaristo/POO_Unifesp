/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lista1;

/**
 *
 * @author joaoe
 */
public class TrianguloRetangulo extends Triangulo{
    
    
    public TrianguloRetangulo(double A, double B, double C) {
        super(A, B, C);
    }
    @Override
    public String toString(){
        return  "A área do triangulo retangulo é "+area;
    }
}
