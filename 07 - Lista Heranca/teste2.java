package lista1;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 *
 * @author joaoe
 */
public class teste2 {
    
    public static void unirRegistro(File f1, File f2, FileWriter f3) throws IOException {
        BufferedReader buf = new BufferedReader(new FileReader(f1));
        BufferedReader buf2 = new BufferedReader(new FileReader(f2));
        List<String> vet = new ArrayList<String>();
        String linha;
        while ((linha = buf.readLine())!= null) {
            vet.add(linha);
        }
        while ((linha = buf2.readLine())!= null) {
            vet.add(linha);
        }
        Collections.sort(vet);
        System.out.println(vet);
        try {
            try (f3) {
                for(int i=0; i<vet.size(); i++){
                    f3.write(vet.get(i)+"\n");
                }
                f3.close();
            }
            System.out.println("O arquivo foi escrito com sucesso.");
        } catch (IOException e) {
            System.err.println("Ocorreu um erro.");
        }
     }
    
    public static void main(String[] args) throws IOException {
        File file = new File("C:/itens1.txt");
        File file2 = new File("C:/itens2.txt");
        FileWriter file3 = new FileWriter("C:/itens3.txt");
        teste2.unirRegistro(file, file2, file3);
            
    }
}
