package aula08exercicios;

/**
 *
 * @author joaoe
 */
public class Conta {
    private double saldo;
    private int numero;

    public Conta(int a) {
        saldo = 0.0;
        numero = a;
    }
    public void credita(double quantia){
        if (quantia > 0){
            saldo += quantia;
        }
        else{
            System.err.println("Conta.deposita(...): " + "não se pode depositar uma quantia negativa.");
        }
    }
    public void debita(double quantia){
        if (quantia > 0){
            saldo -= quantia;
        }
        else{
            System.err.println("Conta.saca(...): " + "não se pode sacar uma quantia negativa.");
        }
    }
    
    public void atualiza(){
        System.out.println("A conta foi atualizada");
    }

    public double getSaldo() {
        return saldo;
    }

    public int getNumero() {
        return numero;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }
    
    public void imprime(){
        System.out.println("\nConta: "+ numero + "\nSaldo = " +saldo);
    }
}
