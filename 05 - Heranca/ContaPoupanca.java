/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aula08exercicios;

/**
 *
 * @author joaoe
 */
public class ContaPoupanca extends Conta{
    private double juros;

    public ContaPoupanca(int a, double j) {
        super(a);
        setJuros(j);
    }
    public void informarJuros(double j){
        setJuros(j);
    }
    public void renderJuros(){
        credita(getSaldo()*juros);
    }
    public double getJuros() {
        return juros;
    }

    public void setJuros(double juros) {
        this.juros = juros;
    }
    @Override
    public void atualiza(){
        renderJuros();
        System.out.println("Sua conta rendeu um total de "+getSaldo()*juros);
    }
    @Override
     public void imprime(){
         System.out.println("\nConta: "+ getNumero() + "\nSaldo = " +getSaldo()+ "\nTaxa de juros = "+getJuros());
     }
}
