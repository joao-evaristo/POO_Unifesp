package aula05ClasseRetangulo;

/**
 *
 * @author joaoe
 */
public class Retangulo {
    private int base;
    private int altura;

    public Retangulo(int b, int a) {
        this.base = b;
        this.altura = a;
    }

    public int getBase() {
        return base;
    }

    public void setBase(int base) {
        this.base = base;
    }

    public int getAltura() {
        return altura;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }
    public int area(){
        int a = getAltura();
        int b = getBase();
        int area = a*b;
        return area;
    }
    public int perimetro(){
        int a = getAltura();
        int b = getBase();
        int perimetro = (2*a) + (2*b);
        return perimetro;
    }
    public float relacao(){
        float a = getAltura();
        float b = getBase();
        float relacao = b/a;
        return relacao;
    }
    public boolean ehQuadrado(){
        if (relacao()==1) {
            return true;
        }
        else{
            return false;
        }
    }
    public void mostra(){
        int A = getAltura();
        int B = getBase();
        int P = perimetro();
        int Area = area();
        String quadrado;
        quadrado = (ehQuadrado()) ? "SIM" : "NÃO";
        System.out.println("Altura: "+A+"\n"+"Base: "+B+"\n"+"Perímetro: "+P+"\n"+"Área: "+Area+"\n"+"É quadrado?: "+quadrado+"\n");
     }
    public static void main(String[] args) {
        Retangulo r1 = new Retangulo(15,15);
        r1.mostra();
        Retangulo r2 = new Retangulo(20,4);
        r2.mostra();
        Retangulo r3 = new Retangulo(20,19);
        r3.mostra();
    }
}
