package exercicios;

/**
 *
 * @author joaoe
 */
public class Ex8 {
    class NoDeArvore {
        int item;
        NoDeArvore esquerda;
        NoDeArvore direita;
    }
    class Tree {
  private NoDeArvore root; 

  public Tree() { root=null; } 

  public void inserir(int v) {
    NoDeArvore novo = new NoDeArvore(); 
    novo.item = v; 
    novo.direita = null;
    novo.esquerda = null;

    if (root == null) root = novo;
    else  { 
      NoDeArvore atual = root;
      NoDeArvore anterior;
      while(true) {
        anterior = atual;
        if (v <= atual.item) { 
          atual = atual.esquerda;
          if (atual == null) {
            anterior.esquerda = novo;
            return;
          } 
        } 
        else { 
           atual = atual.direita;
           if (atual == null) {
             anterior.direita = novo;
             return;
           }
        } 
      } 
    } 

  }

  public NoDeArvore buscar(int chave) {
    if (root == null) return null; 
    NoDeArvore atual = root;  
    while (atual.item != chave) { 
      if(chave < atual.item ) atual = atual.esquerda; 
      else atual = atual.direita;
      if (atual == null) return null;
    } 
    return atual;
  }


  public boolean remover(int v) {
    if (root == null) return false;

    NoDeArvore atual = root;
    NoDeArvore pai = root;
    boolean filho_esq = true;

  
    while (atual.item != v) { 
      pai = atual;
      if(v < atual.item ) { 
        atual = atual.esquerda;
        filho_esq = true; 
      }
      else { 
        atual = atual.direita; 
        filho_esq = false; 
      }
      if (atual == null) return false; 
    } 
    if (atual.esquerda == null && atual.direita == null) {
      if (atual == root ) root = null;
      else if (filho_esq) pai.esquerda = null; 
           else pai.direita = null; 
    }

    else if (atual.direita == null) {
       if (atual == root) root = atual.esquerda;
       else if (filho_esq) pai.esquerda = atual.esquerda;
            else pai.direita = atual.esquerda; 
    }
    
    else if (atual.esquerda == null) {
       if (atual == root) root = atual.direita; 
       else if (filho_esq) pai.esquerda = atual.direita;
            else pai.direita = atual.direita;
    }


    else {
      NoDeArvore sucessor = no_sucessor(atual);
      
      if (atual == root) root = sucessor; 
      else if(filho_esq) pai.esquerda = sucessor; 
           else pai.direita = sucessor; 
      sucessor.esquerda = atual.esquerda;  
    }

    return true;
  }
  
 
  public NoDeArvore no_sucessor(NoDeArvore apaga) { 
     NoDeArvore paidosucessor = apaga;
     NoDeArvore sucessor = apaga;
     NoDeArvore atual = apaga.direita; 

     while (atual != null) {
       paidosucessor = sucessor;
       sucessor = atual;
       atual = atual.esquerda;
     } 
   
     if (sucessor != apaga.direita) { 
       paidosucessor.esquerda = sucessor.direita; 
      

       sucessor.direita = apaga.direita;
     }
     return sucessor;
  }
}
}
