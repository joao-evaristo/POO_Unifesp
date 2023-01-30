package exercicios;

import java.util.Arrays;
import java.util.Random;

/**
 *
 * @author joaoe
 */
public class Ex11 {
    double[] vet = {};
    
    static double[] adicionarElemento(double[] a, double e) {
        a  = Arrays.copyOf(a, a.length + 1);
        a[a.length - 1] = e;
        return a;
    }
    
    public void inserir(double v){
        vet = adicionarElemento(vet, v);
    }
    public double [] gerarVetor(int i){
        for(int aux=0; aux<i; aux++){
            Random aleatorio = new Random();
            double numero = aleatorio.nextDouble()*100;
            inserir(numero);
        }
        return vet;
    }
    public static void main(String[] args) {
        Ex11 teste = new Ex11();
        double[] vetorteste = teste.gerarVetor(5);
        System.out.println("Vetor: "+(Arrays.toString(vetorteste)).replaceAll("\\[", "").replaceAll("\\]", ""));
    }
}
