package lista1;

/**
 *
 * @author joaoe
 */
public class Retangulo extends  Figura{
    double ladoA;
    double ladoB;
    public Retangulo(double ladoA, double ladoB) {
        this.ladoB = ladoA;
        this.ladoB = ladoB;
    }

    @Override
    double getArea() {
        double a;
        a = ladoA*ladoB;
        this.area = a;
        return a;
    }
    @Override
    public String toString(){
        return  "A área do Retangulo é "+area;
    }
}
