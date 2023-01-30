package exercicios;

/**
 *
 * @author joaoe
 */
import java.util.Arrays;
import java.util.Scanner;

public class Ex4 {
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
    public int maior(){
        ordenar();
        int maior;
        maior = vet[(this.vet).length-1];
        return maior;
    }
    public void imprime(){
        System.out.println("Maior número do vetor é: "+maior());
        
    }
    public static void main(String[] args) {
        Ex4 teste = new Ex4();
        int N;
        while(true){
            Scanner entrada = new Scanner(System.in);
            N = entrada.nextInt();
            if(N == 0){
                break;
            }
            teste.inserir(N);
        }
        teste.imprime();
        
    }
}