package aula05ClasseTriangulo;

/**
 *
 * @author joaoe
 */
public class Triangulo {
    private float ladoA;
    private float ladoB;
    private float ladoC;

    public Triangulo(float A, float B, float C) {
        this.ladoA = A;
        this.ladoB = B;
        this.ladoC = C;
    }
    //Construtor com valores default
    public Triangulo() {
        this.ladoA = 10;
        this.ladoB = 10;
        this.ladoC = 10;
    }
    public float getLadoA() {
        return ladoA;
    }

    public void setLadoA(float ladoA) {
        this.ladoA = ladoA;
    }

    public float getLadoB() {
        return ladoB;
    }

    public void setLadoB(float ladoB) {
        this.ladoB = ladoB;
    }

    public float getLadoC() {
        return ladoC;
    }

    public void setLadoC(float ladoC) {
        this.ladoC = ladoC;
    }
    public float area(){
        float A = getLadoA();
        float B = getLadoB();
        float C = getLadoC();
        float p = (A+B+C)/2;
        float area = (float) Math.pow((p*(p-A)*(p-B)*(p-C)), 0.5);
        return area;
     }
     public void mostra(){
        float A = getLadoA();
        float B = getLadoB();
        float C = getLadoC();
        System.out.println("Lado A: "+A+"\n"+"Lado B: "+B+"\n"+"Lado C: "+C+"\n"+"Área: "+area()+"\n");
     }
     public static void main(String[] args) {
        Triangulo t1 = new Triangulo(9,7,14);
        t1.mostra();
        Triangulo t2 = new Triangulo(26,26,20);
        t2.mostra();
        Triangulo tdefault = new Triangulo();
        tdefault.mostra();
        tdefault.setLadoA(2);
        tdefault.mostra();
    }
}
