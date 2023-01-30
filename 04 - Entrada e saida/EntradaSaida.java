package aula07exercícios;
/**
 *
 * @author joaoe
 */
import java.util.*;
public class EntradaSaida{
    public static void main(String[] args) {
        System.out.println("-------Bem Vindo-------\nDigite \"0\" para criar um quadrado ou \"1\" para criar um triângulo: ");
        int n;
        Scanner entrada = new Scanner(System.in);
        n = entrada.nextInt();
        if (n == 0) {
            System.out.println("Você escolheu quadrado. Digite o lado do quadrado: ");
            int lado;
            try {
                lado = entrada.nextInt();
                Quadrado q1 = new Quadrado(lado);
                q1.mostra();
            } catch (Exception e) {
                System.err.println("São permitdos apenas números!");
            }
        }
        else if (n == 1) {
            System.out.println("Você escolheu triangulo. Digite os três lados do triângulo: ");
            int lado1;
            int lado2;
            int lado3;
            try {
                lado1 = entrada.nextInt();
                lado2 = entrada.nextInt();
                lado3 = entrada.nextInt();
                Triangulo t1 = new Triangulo(lado1, lado2, lado3);
                t1.mostra();
            } catch (Exception e) {
                System.err.println("São permitdos apenas números!");
            }
        }
        else{
            System.err.println("Opção inválida!");
        }
    }
}
