package aula08exercicios;

import java.util.ArrayList;

/**
 *
 * @author joaoe
 */
public class Banco{
    
    private ArrayList<Conta> contas = new ArrayList<>();
    public void Banco(){
        this.contas = new ArrayList<Conta>();
        int totalContas = contas.size();
    }
    public void inserir(Conta contabancaria){
        contas.add(contabancaria);
        System.out.println("Conta adicionada com sucesso!!! \n"+ "O seu número de conta é : "+(contas.get(contas.size()-1)).getNumero());
    }
    public boolean remover(Conta contabancaria){
        contas.remove(contabancaria);
        System.out.println("Conta "+contabancaria.getNumero()+" removida com sucesso do sistema");
       return true;        
    }
    public void pagarDividendos(double d){
        for(Conta conta : this.contas){
            conta.credita(d);
        }
    }
    public void atualizarContas(){
        for(Conta conta : this.contas){
            conta.atualiza();
        }
    }
    public void exibirContas(){
        for(Conta conta : this.contas){
            conta.imprime();
        }
    }
    public static void main(String[] args) {
        Banco contasbancarias = new Banco();
        contasbancarias.contas.add(new Conta(002));
        contasbancarias.contas.add(new ContaPoupanca(002, 0.10));
        contasbancarias.contas.get(1).credita(100);
        contasbancarias.contas.add(new ContaCorrente(003, 200));
        contasbancarias.contas.get(2).credita(100);
        contasbancarias.contas.get(2).debita(200);
        contasbancarias.inserir(new ContaCorrente(005, 100));
        contasbancarias.remover(contasbancarias.contas.get(0));
        contasbancarias.pagarDividendos(1.00);
        contasbancarias.exibirContas();
    }
}
