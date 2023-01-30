package tratamento.de.excecao;

/**
 *
 * @author joaoe
 */
public class ClasseThrowExcao{
    public void LancaExcecao( ExercicioClasseExcecao ex) throws ExercicioClasseExcecao{
        throw ex;
    }
    public static void main(String[] args) throws ExercicioClasseExcecao {
        ClasseThrowExcao lancador = new ClasseThrowExcao();
        ExercicioClasseExcecao exce = new ExercicioClasseExcecao("Erro 1700. Essa é uma exceção");
        lancador.LancaExcecao(exce);
    }
}
