package aula16exercicios;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 *
 * @author joaoe
 */
public class Exe1 {
     public int contarString(BufferedReader buf, char c) throws IOException{
        int contador = 0;
        String linha;
        
        while ((linha = buf.readLine())!= null) {
            for(int i = 0; i< linha.length(); i++){
                char aux = linha.charAt(i);
                if (aux == c){
                    contador++;
                }
            }
        }
        return contador;
     }
     public static void main(String[] args) throws FileNotFoundException {
        try {
            File file = new File("C:/teste.txt");
            BufferedReader buff = new BufferedReader(new FileReader(file));
            Exe1 teste = new Exe1();
            System.out.println("O número de vezes que o caractere apareceu é "+teste.contarString(buff, 'c'));
        } catch (IOException e) {
            System.err.println("falhou");
        }
    }
}
