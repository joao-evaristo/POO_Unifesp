package aula05ClasseQuadrao;

/**
 *
 * @author joaoe
 */
public class Quadrado {
    private int lado;

    public Quadrado(int lado) {
        this.lado = lado;
    }
    //Contrutor que criara os quadrados com lado aleatório entre 0 e 100
    public Quadrado() {
        int mut;
        if(Math.random()>=0.5){
            mut = 100;
        }
        else{
            mut = 10;
        }
        this.lado = (int) (Math.random()*mut);
    }
    
    public int getLado() {
        return lado;
    }

    public void setLado(int lado) {
        this.lado = lado;
    }
    
    public void aumentarQuadrado(int un){
        this.lado = getLado()+un;
    }
    public int area(){
        int lado = getLado();
        int area = (int) Math.pow(lado, 2);
        return area;
    }
     public void mostra(){
        int lado = getLado();
        int area = area();
        System.out.println("Lado: "+lado+"\n"+"Area: "+area+"\n");
     }
    public static void main(String[] args) {
        Quadrado q1 = new Quadrado(10);
        q1.mostra();
        Quadrado q2 = new Quadrado();
        q2.mostra();
        Quadrado q3 = new Quadrado();
        q3.mostra();
        Quadrado q4 = new Quadrado();
        q4.mostra();
        Quadrado q5 = new Quadrado();
        q5.mostra();
        Quadrado q6 = new Quadrado();
        q6.mostra();
        Quadrado q7 = new Quadrado();
        q7.mostra();
        Quadrado q8 = new Quadrado();
        q8.mostra();
        Quadrado q9 = new Quadrado();
        q9.mostra();
        Quadrado q10 = new Quadrado(10);
        q10.aumentarQuadrado(90);
        q10.mostra();
        System.out.println("\n"+"------------- Soma total -------------"+"\n");
        int soma = q1.area()+q2.area()+q3.area()+q4.area()+q5.area()+q6.area()+q7.area()+q8.area()+q9.area()+q10.area();
        System.out.println("Soma = "+soma);
    }
}
