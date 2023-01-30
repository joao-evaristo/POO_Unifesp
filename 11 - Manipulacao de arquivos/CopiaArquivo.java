package aula16exercicios;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.channels.FileChannel;
/**
 *
 * @author joaoe
 */
public class Exe2 {
    public void clonar(File s, File t) throws IOException {
        FileChannel modelo = new FileInputStream(s).getChannel();
        FileChannel copia = (new FileOutputStream(t)).getChannel();
        modelo.transferTo(0, s.length(), copia);
        modelo.close();
        copia.close();
    }
    public static void main(String[] args) throws FileNotFoundException {
        try {
            File file = new File("C:/teste.txt");
            File file2 = new File("C:/teste2.txt");
            Exe2 teste = new Exe2();
            teste.clonar(file, file2);
        } catch (IOException e) {
            System.err.println("falhou");
        }
    }
}
