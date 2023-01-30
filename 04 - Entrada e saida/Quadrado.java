package aula07exercícios;

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
    public int perimetro(){
        int lado = getLado();
        int perimetro = lado*4;
        return perimetro;
    }
     public void mostra(){
        int lado = getLado();
        int area = area();
        int perimetro = perimetro();
        System.out.println("Lado: "+lado+"\n"+"Perimetro: "+perimetro+"\n"+"Area: "+area+"\n");
     }
}
