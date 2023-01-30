package aula07exercícios;

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
    public int perimetro(){
        float A = getLadoA();
        float B = getLadoB();
        float C = getLadoC();
        int perimetro = (int) (A+B+C);
        return perimetro;
    }
    public String tipo(){
        float A = getLadoA();
        float B = getLadoB();
        float C = getLadoC();
        if (A == B && B == C) {
            return "Equilátero";
        }
        else if (A!= B && B!=C && A!=C) {
            return "Escaleno";
        }
        else{
           return "Isósceles";
        }
    }
     public void mostra(){
        float A = getLadoA();
        float B = getLadoB();
        float C = getLadoC();
        System.out.println("Lado A: "+A+"\n"+"Lado B: "+B+"\n"+"Lado C: "+C+"\n"+"Área: "+area()+"\n"+"Perimêtro: "+perimetro()+"\n"+"O triângulo é um "+tipo());
     }
}
