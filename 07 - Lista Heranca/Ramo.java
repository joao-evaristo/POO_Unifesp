package lista1;

/**
 *
 * @author joaoe
 */
public class Ramo extends Mortal{
    protected boolean raiz = true;
    protected boolean galhoEsquerda = true;
    protected boolean galhoDireita = true;
    
    @Override
    public void mata(){
        this.galhoDireita = false;
        this.galhoEsquerda = false;
        this.raiz = false;
    }
    public void mataEsquerda(){
        this.galhoEsquerda = false;
    }
    public void mataDireita(){
        this.galhoDireita = false;
    }
    @Override
     public String toString(){
        String estado;
        estado = (this.isVivo()) ? "vivo" : "morto";
        String estadoGalhoEsquerda;
        estadoGalhoEsquerda = (this.isVivo()) ? "vivo" : "morto";
        String estadoGalhoDireita;
        estadoGalhoDireita = (this.isVivo()) ? "vivo" : "morto";
        return  "O ramo está "+estado+", seu galho a esquerda está "+estadoGalhoEsquerda+" e o a direita está "+estadoGalhoDireita;
    }
}
