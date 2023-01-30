package exercicios;

/**
 *
 * @author joaoe
 */
public class Ex7 {
    static void imprimeAlgo(int nivel) {
    if (nivel == 0) {
        System.out.print("*");
    } else {
        System.out.print("[");
        imprimeAlgo(nivel - 1);
        System.out.print(",");
        imprimeAlgo(nivel - 1);
        System.out.println("]");
        }
    }
    public static void main(String[] args) {
        Ex7.imprimeAlgo(0);
        Ex7.imprimeAlgo(1);
        Ex7.imprimeAlgo(2);
        Ex7.imprimeAlgo(3);
    }
}
