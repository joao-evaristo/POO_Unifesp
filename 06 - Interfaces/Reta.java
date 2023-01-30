package aula09exercicios;

/**
 *
 * @author joaoe
 */
public class Reta implements Relacao{
    private final Ponto pontoA;
    private final Ponto pontoB;
    public Reta(float xa, float ya, float xb, float yb){
        pontoA = new Ponto(xa,ya);
        pontoB = new Ponto(xb,yb);
    }
    public float distancia(){
        float auxa;
        float auxb;
        auxa = (float) Math.pow((pontoB.getX() - pontoA.getX()), 2);
        auxb = (float) Math.pow((pontoB.getY() - pontoA.getY()), 2);
        float D = (float) Math.sqrt(auxa+auxb);
        return D;
    }
    @Override
    public boolean maiorQue(Object b) {
        Reta breta = (Reta) b;
        return this.distancia() > breta.distancia();
    }

    @Override
    public boolean menorQue(Object b) {
        Reta breta = (Reta) b;
        return this.distancia() < breta.distancia();
    }

    @Override
    public boolean igualA(Object b) {
        Reta breta = (Reta) b;
        return breta.distancia() == this.distancia();
    }
    public static void main(String[] args) {
        Reta r = new Reta(2,-3,4,5);
        System.out.println(r.distancia());
        Reta r2 = new Reta(1, 1, (float) 4.5, 1);
        System.out.println(r2.distancia());
        System.out.println(r.maiorQue(r2));
        System.out.println(r.menorQue(r2));
        System.out.println(r.igualA(r2));
    }
}
