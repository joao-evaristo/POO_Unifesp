package lista1;

/**
 *
 * @author joaoe
 */
public abstract class Figura{
    double area;

    public Figura() {
        this.area = 0;
    }
    double getArea(){
        return area;
    }
    @Override
    public String toString(){
        return  "A área da figura é "+area;
    }
}
