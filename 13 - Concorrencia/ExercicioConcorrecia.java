package exercicioconcorrencia;

import java.util.Scanner;

/**
 *
 * @author joaoe
 */
public class ExercicioConcorrecia {

    /*Escreva um programa que conte o n ́umero de n ́umeros
primos dentro de um intervalo de inteiros com uma a
cinco threads (o usu ́ario deve dizer quantas). A ideia  ́e
dividir o trabalho entre as threads, sendo que cada qual
contar ́a o n ́umero de primos para o seu sub-intervalo. No
final,  ́e preciso somar o n ́umero de primos que foi
encontrado por cada thread.*/
    public static void primos(int numt, int inicio, int fim) throws InterruptedException {
        int tamanhoIntervaloInicio = (int) Math.ceil((fim - inicio) / numt);
        int tamanhoIntervalo = (fim - inicio) / numt;
        int count=0;
        CalculoPrimosThread threads[] = new CalculoPrimosThread[numt];
        threads[0] = new CalculoPrimosThread(inicio, tamanhoIntervaloInicio);
        int inicioDemais = tamanhoIntervaloInicio;
        int fimDemais = tamanhoIntervaloInicio + tamanhoIntervalo;
        for (int i = 1; i < numt; i++) {
            threads[i] = new CalculoPrimosThread(inicioDemais, fimDemais);
            inicioDemais += tamanhoIntervalo;
            fimDemais += tamanhoIntervalo;
        }
        for (int i = 0; i < threads.length; i++) {
            threads[i].start();
            threads[i].join();
            
            count+=(threads[i].getCount());
            
            //System.out.println(threads[i].getCount());
        }
        System.out.println("Número de primos no intervalo = "+count);
    }
    
    public static void main(String[] args) throws InterruptedException {
        int t = 0;        
        while (t <= 0 || t > 5) {
            System.out.println("Escreva o número de threads que você quer utilizar (1 a 5):");
            Scanner entrada = new Scanner(System.in);
            t = entrada.nextInt();
            if (t <= 0 || t > 5) {
                System.err.println("Número inválido. Digite novamente");
            }
        }
        int inicio = -1;
        int fim = -1;
        while (inicio <= -1 || fim <= inicio || fim > 1000) {
            System.out.println("Escreva o intervalo de contagem, indo de 0 até 999.\nInício:");
            Scanner entradai = new Scanner(System.in);
            inicio = entradai.nextInt();
            System.out.println("Fim:");
            Scanner entradaf = new Scanner(System.in);
            fim = entradaf.nextInt();
            if (inicio <= -1 || fim <= inicio || fim > 1000) {
                System.err.println("Intervalo inválido. Tente novamente");
            }
        }
        primos(t, inicio, fim);
    }
}
