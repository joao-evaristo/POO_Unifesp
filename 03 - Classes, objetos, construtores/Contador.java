package aula05ClasseContador;

/**
 *
 * @author joaoe
 */
public class Contador {
    private int numeroContador;

    public Contador(int numeroContador) {
        this.numeroContador = numeroContador;
    }
    //Caso não seja passado parametros, o contador inicia em 0
    public Contador() {
        this.numeroContador = 0;
    }
    public int getNumeroContador() {
        return numeroContador;
    }

    public void setNumeroContador(int numeroContador) {
        this.numeroContador = numeroContador;
    }
    public void incrementarUm(){
        setNumeroContador(getNumeroContador()+1);
        System.out.println("Acrescentando 1 ao contador");
    }
    public void incrementarParametro(int x){
        setNumeroContador(getNumeroContador()+x);
        System.out.println("Acrescentando "+x+" ao contador");
    }
    public void decrementarUm(){
        setNumeroContador(getNumeroContador()-1);
        System.out.println("Diminuindo em 1  o contador");
    }
    public void decrementarParametro(int x){
        setNumeroContador(getNumeroContador()-x);
        System.out.println("Diminuindo em "+x+" o contador");

    }
    public void visualizar(){
        System.out.println("Contador = "+getNumeroContador());
    }
    public static void main(String[] args) {
        Contador c1 = new Contador(12);
        c1.incrementarParametro(10);
        c1.visualizar();
        c1.decrementarUm();
        c1.visualizar();
        Contador c2 = new Contador();
        c2.visualizar();
        c2.incrementarParametro(100);
        c2.incrementarUm();
        c2.visualizar();
    }
}
