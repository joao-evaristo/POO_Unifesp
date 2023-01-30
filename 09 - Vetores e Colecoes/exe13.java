package exercicios;

import java.util.*;
/**
 *
 * @author joaoe
 */
public class exe13 {
    public class ListaDePalavras {
        private Set lista;
        public ListaDePalavras() {
        lista = new TreeSet();
        }
        public void adiciona(String palavras) {
        StringTokenizer st = new StringTokenizer(palavras);
        while(st.hasMoreTokens())
        lista.add(st.nextToken());
        }
        public boolean existe(String palavra) {
        return lista.contains(palavra);
        }
    }
}
