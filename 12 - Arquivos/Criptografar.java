package exercicios;

import java.util.Scanner;

/**
 *
 * @author joaoe
 */
public class exe1 {
    public static String criptografar(String str, int k){
        int cripto;
        String resultao = "";
        for ( int i = 0; i < str.length(); ++i ){ 
            char c = str.charAt( i ); 
            int asc = (int) c; 
            cripto = asc +  k;
            resultao += (char)cripto;
        }
        return resultao;
    }
    
    public static String descriptografar(String str, int k){
        int cripto;
        String resultao = "";
        for ( int i = 0; i < str.length(); ++i ){ 
            char c = str.charAt( i ); 
            int asc = (int) c; 
            cripto = asc -  k;
            resultao += (char)cripto;
        }
        return resultao;
    }
    public static void main(String[] args) 
    {
        System.out.println("-------Bem Vindo-------\nDigite o que quer criptografar\n");
        Scanner entrada = new Scanner(System.in);
        String str;
        str = entrada.nextLine();
        str = (String) str;
        int k = 0;
        while (k<=0 || k>132){
            System.out.println("\nAgora digite o padrão K que quer criptografar (são válidos números entre 1 e 132)\n");
            Scanner entradak = new Scanner(System.in);
            k = entradak.nextInt();
            if(k<=0 || k>132){
                System.err.println("Número inválido. Digite novamente");
            }
        }
        str = exe1.criptografar(str, k);
        System.out.println("Mensagem criptografada: "+str);
        str = exe1.descriptografar(str, k);
        System.out.println("Mensagem descriptografada: "+str);
    }
}
