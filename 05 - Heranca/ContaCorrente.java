package aula08exercicios;

/**
 *
 * @author joaoe
 */
public class ContaCorrente extends Conta{
    private double limite;
    private double debito;
    public ContaCorrente(int a, double lim) {
        super(a);
        debito = 0;
        setLimite(lim);
    }

    public double getLimite() {
        return limite;
    }

    public void setLimite(double limite) {
        this.limite = limite;
    }

    public double getDebito() {
        return debito;
    }

    public void setDebito(double debito) {
        this.debito = debito;
    }
    
    @Override
    public void credita(double quantia){
        if (quantia > 0){
            if (debito==0) {
                setSaldo(quantia+getSaldo());
            }
            else {
                double aux;
                aux = quantia-debito;
                if (aux>=0) {
                    setDebito(0);
                    setSaldo(getSaldo()+aux);
                    System.out.println("Você pagou o cheque especial! O restante da quantia foi adicionado ao seu saldo!");
                }
                else{
                    debito = debito-quantia;
                    System.out.println("R$"+quantia+" forma creditados ao seu cheque especial. Cheque especial atual: "+ debito);
                }
            }
        }
        else{
            System.err.println("Conta.deposita(...): " + "não se pode depositar uma quantia negativa.");
        }
    }
    
    
    @Override
     public void debita(double quantia){
        if (quantia > 0 ){
            if (getSaldo()>=quantia) {
                setSaldo(getSaldo()-quantia);
                System.out.println("Retirando R$"+quantia+". Seu saldo agora é de R$"+ getSaldo()+ "!");
            }
            else if((limite-debito)>=quantia){
                setDebito(getDebito()+quantia);
                System.out.println("Você está em cheque especial. Seu limite agora é de R$"+ (getLimite()-debito) + "!");
            }
            else{
                System.err.println("Você não tem saldo nem crédito para fazer essa operação!");
            }
        }
        else{
            System.err.println("Conta.saca(...): " + "não se pode sacar uma quantia negativa.");
        }
    }
     public void definirLimite(double l){
         setLimite(l);
     }
    @Override
     public void atualiza(){
         if (debito==limite) {
             System.out.println("Enviando carta de cobrança...... Carta enviada!");
        }
     }
    @Override
     public void imprime(){
         System.out.println("\nConta: "+ getNumero() + "\nSaldo = " +getSaldo()+ "\nLimite = "+getLimite() + "\nDébito = "+getDebito());
     }
}
