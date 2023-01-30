package lista1;

/**
 *
 * @author joaoe
 */
public class Mortal {
    private boolean vivo = true;
    public boolean  isVivo(){
        return this.vivo;
    }
    public void mata(){
        this.vivo = false;
    }

    public void setVivo(boolean vivo) {
        this.vivo = vivo;
    }
    @Override
    public String toString(){
        String estado;
        estado = (this.vivo) ? "vivo" : "morto";
        return  "O ser está "+estado;
    }
}
