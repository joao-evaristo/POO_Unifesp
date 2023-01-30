package aula05ClasseCarro;

import aula05ClasseContador.Contador;


/**
 *
 * @author joaoe
 */
public class Carro {

    private String marca;
    private String modelo;
    private String placa;
    private Boolean estado = false;
    private int velocidade;
    private aula05ClasseContador.Contador vezesAcelerou;
    private aula05ClasseContador.Contador vezesFreou;
    private aula05ClasseContador.Contador vezesLigou;

    public Carro(String marca, String modelo, String placa) {
        this.marca = marca;
        this.modelo = modelo;
        this.placa = placa;
        vezesAcelerou = new Contador();
        vezesFreou = new Contador();
        vezesLigou = new Contador();
    }
    
    public void exibir() {
        String onoff;
        onoff = (this.estado) ? "ligado" : "desligado";
        System.out.println("A marca do carro é " + this.marca
                + ", modelo " + this.modelo + ", placa " + this.placa + ", está " + onoff + " e está a uma velocidade de " + this.velocidade + "KM/h");
        System.out.println("O carro freou: "+vezesFreou.getNumeroContador()+" vezes\n"+"O carro ligou: "+vezesLigou.getNumeroContador()+" vezes\n"+"O carro acelerou: "+vezesAcelerou.getNumeroContador()+" vezes");
    }

    public void acelerar(int a) {
         if (this.estado) {
           velocidade = velocidade + a;
           System.out.println("Acelerando o carro para " + this.velocidade);
           vezesAcelerou.incrementarUm();
        } else {
            System.out.println("O carro está desligado! Ligue-o primeiro");
        }
        
    }

    public void frear() {
        if (this.estado) {
            velocidade = 0;
            System.out.println("Freando o carro");
            vezesFreou.incrementarUm();
        } else {
            System.out.println("O carro está desligado! Ligue-o primeiro");
        }
    }

    public void ligar() {
        if (!this.estado) {
            this.estado = true;
            this.velocidade = 0;
            System.out.println("...ligando o carro...");
            vezesLigou.incrementarUm();
        } else {
            System.out.println("O carro já está ligado!");
        }
    }

    public void desligar() {
        if (this.estado) {
            this.estado = false;
            this.velocidade = 0;
            System.out.println("...desligando o carro...");
        } else {
            System.out.println("O carro já está desligado!");
        }
    }

    public static void main(String[] args) {
        Carro c1 = new Carro("Mercedes", "AMG GT", "AAA9999");
        c1.ligar();
        c1.acelerar(10);
        c1.frear();
        c1.acelerar(120);
        c1.exibir();
        Carro c2 = new Carro("BMW", "M3", "BBB9999");
        c2.ligar();
        c2.acelerar(50);
        c2.frear();
        c2.acelerar(90);
        c2.frear();
        c2.exibir();
    }
}
    