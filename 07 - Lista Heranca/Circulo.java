package lista1;

/**
 *
 * @author joaoe
 */
public class Circulo extends Figura{
    protected double raio;

    public Circulo(double r) {
        this.raio = r;
    }
    @Override
    public double getArea(){
        double pi = 3.14159265359;
        double a = pi* (Math.pow(raio, 2));
        area = a;
        return a;
    }
    @Override
    public String toString(){
        return  "A área do circulo de raio "+this.raio+" é "+area;
    }
    public static void main(String[] args) {
        Circulo c = new Circulo(3);
        c.getArea();
        System.out.println(c.toString());
    }
}
