package exercicios;

/**
 *
 * @author joaoe
 */
public class Exe6 {
    private int dado;
    private Exe6 prox;
    private Exe6 prim;
    
    public void criaLista(){
        prim = null;
    }
    public int getDado() {
        return dado;
    }

    public void setDado(int dado) {
        this.dado = dado;
    }

    public Exe6 getProx() {
        return prox;
    }

    public void setProx(Exe6 prox) {
        this.prox = prox;
    }
    
    
    public void add(int i){
        Exe6 novo = new Exe6();
        novo.setDado(i);
        novo.setProx(prim);
        prim = novo;
    }
    public void remove(int i){
	Exe6 anterior = null;
	Exe6 p = prim;
	
	while(p != null && p.getDado() != i){
	anterior = p;
	p = p.getProx();
	}

	if(p == null){
	return;
	}

	if(anterior == null){
	prim = p.getProx();
	}else{
	anterior.setProx(p.getProx());
 	}
    }
    public void print(){
        for(Exe6 n = prim; n != null; n = n.getProx()){
            System.out.println(n.getDado());
        }
    }
    public void search(int i){
        for(Exe6 n = prim; n != null; n = n.getProx()){
            if(n.getDado()==i){
                System.out.println("O elemento "+i+" está na lista");
                return;
            }
        }
        System.out.println("Não encontrado");
    }
    
    public static void main(String[] args) {
        Exe6 lista = new Exe6();
        lista.criaLista();
        lista.add(9);
        lista.add(3);
        lista.add(7);
        lista.add(6);
        lista.print();
        lista.search(7);
        lista.remove(7);
        lista.print();
    }
}
