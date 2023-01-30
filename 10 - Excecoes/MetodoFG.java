package tratamento.de.excecao;

/**
 *
 * @author joaoe
 */
public class MetodoFG {
    public ExercicioClasseExcecao g() throws ExercicioClasseExcecao{
          ExercicioClasseExcecao exce = new ExercicioClasseExcecao("Ocorreu um erro e a classe ExercicioClasseExcecao foi disparada");
          throw exce;
    }
    public void f() throws ExercicioClasseExcecao{
        try {
            g();
        } catch (ExercicioClasseExcecao e) {
            System.out.println("Houve uma exceção");
            ExercicioClasseExcecao outraexcecao = new ExercicioClasseExcecao("Agora houve outra exceção");
            throw outraexcecao;
        }
    }
    public static void main(String[] args) throws ExercicioClasseExcecao {
        MetodoFG fg = new MetodoFG();
        fg.f();
    }
}
