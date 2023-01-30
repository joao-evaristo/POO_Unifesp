package lista1;

/**
 *
 * @author joaoe
 */
public class Main {
    public static void main(String[] args) {
       Mortal m = new Mortal();
       Gato g = new Gato();
       Ramo r = new  Ramo();
       System.out.println(m.isVivo());
       System.out.println(m.toString());
       m.mata();
       System.out.println(m.toString());
       System.out.println(g.isVivo());
       System.out.println(g.toString());
       g.mata();
       g.mata();
       g.mata();
       g.mata();
       g.mata();
       System.out.println(g.toString());
       g.mata();
       g.mata();
       System.out.println(g.toString());
       System.out.println(r.isVivo());
       System.out.println(r.toString());
       r.mataEsquerda();
       System.out.println(r.toString());
       r.mataDireita();
       System.out.println(r.toString());
       r.mata();
       System.out.println(r.toString());
    }
}
