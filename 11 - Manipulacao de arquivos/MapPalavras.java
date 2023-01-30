/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aula16exercicios;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import static java.lang.Integer.parseInt;
import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author joaoe
 */
public class Exe4 {
    public Map<Integer, String> mapear(BufferedReader buf) throws IOException{
        Map<Integer, String> mapa = new HashMap<Integer, String>();
        String linha;
        while ((linha = buf.readLine())!= null) {
            String[] linhaDividida = linha.split("\\s+");
            Integer indice = parseInt(linhaDividida[1]);
            //System.out.println(linhaDividida[0]);
            //System.out.println(linhaDividida[1]);

            mapa.put(indice, linhaDividida[0]);
        }
        return mapa;
    }
    
    public static void main(String[] args) throws FileNotFoundException {
        try {
            File file = new File("C:/teste.txt");
            BufferedReader buff = new BufferedReader(new FileReader(file));
            Exe4 teste = new Exe4();
            Map<Integer, String> mapa = teste.mapear(buff);
            System.out.println(mapa);
            
        } catch (IOException e) {
            System.err.println("falhou");
        }
    }
}
