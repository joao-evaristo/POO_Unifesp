package exercicios;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.stream.IntStream;
/**
 *
 * @author joaoe
 */
public class exe2 {
    public static void contarOcorrencias(File f1, FileWriter f2) throws IOException {
        int contadorLetras = 0;
        int contadorVogais = 0;
        int contadorConsoantes = 0;
        int contadorNumeros = 0;
        int contadorOutros = 0;
        int contadorPalavras = 0;
        int contadorLinhas = 0;
        int[] vogais = {97, 101, 105, 111, 117};
        int[] consoantes = {66, 67, 68, 70, 71, 72, 74, 75, 76, 77, 78, 80, 81, 82, 83, 84, 86, 87, 88, 89, 90, 98, 99, 100, 102, 103, 104, 106, 107, 108, 109, 110, 112, 113, 114, 115, 116, 118, 119, 120, 121, 122};
        int[] numeros = {48, 49, 50, 51, 52, 53, 54, 55, 56, 57};
        
        
        
        BufferedReader buf = new BufferedReader(new FileReader(f1));
        
        
        String linha;
        
        while ((linha = buf.readLine())!= null) {
            contadorLinhas++;
            String[] palavras = linha.split("\\s+");
            contadorPalavras += palavras.length;
            for(int i = 0; i< linha.length(); i++){
                int letra = (int) linha.charAt(i);
                if (IntStream.of(vogais).anyMatch(x -> x == letra)){
                    contadorVogais++;
                }
                else if(IntStream.of(consoantes).anyMatch(x -> x == letra)){
                    contadorConsoantes++;
                }
                else if(IntStream.of(numeros).anyMatch(x -> x == letra)){
                    contadorNumeros++;
                }
                else{
                    contadorOutros++;
                }
            }
        }
        contadorLetras = contadorVogais + contadorConsoantes;
        try {
            try (f2) {
                f2.write("----------Resumo do documento----------\n\nTotal de letras: "+contadorLetras+"\nVogais: "+contadorVogais+"\nConsoantes: "+contadorConsoantes+"\nNúmeros: "+contadorNumeros+"\nOutros caracteres: "+contadorOutros+"\nTotal de palavras: "+contadorPalavras+"\nLinhas: "+contadorLinhas);
            }
            f2.close();
            System.out.println("O arquivo foi escrito com sucesso.");
        } catch (IOException e) {
            System.err.println("Ocorreu um erro.");
        }
     }
    
    public static void main(String[] args) throws IOException {
        
        File file = new File("C:/teste.txt");
        FileWriter file2 = new FileWriter("C:/teste2.txt");
        exe2.contarOcorrencias(file, file2);
            
    }
}
