package exercicios;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author joaoe
 */
public class Ex2 {
    double[] vet = {};
    
    static double[] adicionarElemento(double[] a, double e) {
        a  = Arrays.copyOf(a, a.length + 1);
        a[a.length - 1] = e;
        return a;
    }
    
    public void inserir(double v){
        vet = adicionarElemento(vet, v);
    }
    public double tirarMedia(){
        double soma = 0;
        int tam = vet.length;
        for(Double i : vet){
            soma += i;
        }
        double media = soma/tam;
        return  media;
    }
    public void imprime(){
        System.out.println("Média do vetor = "+ tirarMedia());
    }
    public static void main(String[] args) {
        Ex2 teste = new Ex2();
        double N;
        while(true){
            Scanner entrada = new Scanner(System.in);
            N = entrada.nextDouble();
            if(N == 0){
                break;
            }
            teste.inserir(N);
        }
        teste.imprime();
        
    }
    
}

