package exercicios;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author joaoe
 */
public class Ex1 {
    int[] vet = {};
    
    static int[] adicionarElemento(int[] a, int e) {
        a  = Arrays.copyOf(a, a.length + 1);
        a[a.length - 1] = e;
        return a;
    }
    
    public void inserir(int v){
        vet = adicionarElemento(vet, v);
    }
    public void ordenar(){
        Arrays.sort(vet);
    }
    public void imprime(){
        System.out.println("Vetor ordenado: "+(Arrays.toString(vet)).replaceAll("\\[", "").replaceAll("\\]", ""));
        
    }
    public static void main(String[] args) {
        Ex1 teste = new Ex1();
        int N;
        while(true){
            Scanner entrada = new Scanner(System.in);
            N = entrada.nextInt();
            if(N == 0){
                break;
            }
            teste.inserir(N);
        }
        teste.ordenar();
        teste.imprime();
        
    }
    
}
