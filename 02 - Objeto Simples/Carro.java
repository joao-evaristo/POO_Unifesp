package aula01carro;

/**
 *
 * @author joaoe
 */
public class Carro {

    String marca;
    String modelo;
    String placa;
    Boolean estado = false;
    int velocidade;

    public void exibir() {
        String onoff;
        onoff = (this.estado) ? "ligado" : "desligado";
        System.out.println("A marca do carro é " + this.marca
                + ", modelo " + this.modelo + ", placa " + this.placa + ", está " + onoff + " e está a uma velocidade de " + this.velocidade + "KM/h");
    }

    public void acelerar(int a) {
         if (this.estado) {
           velocidade = velocidade + a;
           System.out.println("Acelerando o carro para " + this.velocidade);
        } else {
            System.out.println("O carro está desligado! Ligue-o primeiro");
        }
        
    }

    public void frear() {
        if (this.estado) {
            velocidade = 0;
            System.out.println("Freando o carro");
        } else {
            System.out.println("O carro está desligado! Ligue-o primeiro");
        }
    }

    public void ligar() {
        if (!this.estado) {
            this.estado = true;
            this.velocidade = 0;
            System.out.println("...ligando o carro...");
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
        Carro c1 = new Carro();
        c1.marca = "BMW";
        c1.modelo = "AMG GT";
        c1.placa = "AAA9999";
        c1.exibir();
        c1.acelerar(10);
        c1.ligar();
        c1.ligar();
        c1.velocidade = 100;
        c1.exibir();
        c1.acelerar(20);
        c1.exibir();
        c1.frear();
        c1.exibir();
        c1.desligar();
        c1.exibir();
        c1.desligar();
    }
}
