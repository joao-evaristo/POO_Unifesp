package lista1;

/**
 *
 * @author joaoe
 */
public class Gato extends Mortal{
    private int vidas = 7;

    public Gato() {
        setVivo(true);
    }
    @Override
    public void mata(){
        this.vidas --;
        if (this.vidas <= 0){
            setVivo(false);
        }
    }
    @Override
     public String toString(){
        String estado;
        estado = (this.isVivo()) ? "vivo" : "morto";
        return  "O gato está "+estado+" e possui "+this.vidas+" vidas";
    }
}
