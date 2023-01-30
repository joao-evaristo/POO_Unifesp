package tratamento.de.excecao;

/**
 *
 * @author joaoe
 */
public class TratamentoDeExcecao extends  Exception{
    public static void main(String[] args){
        Exception exce = new Exception("Erro 1700. Essa é uma exceção");
        try {
            throw exce;
        } catch (Exception e) {
            System.out.println("Houve um erro durante a execução, mas fique calmo, estamos resolvendo isto.");
            System.err.println(e.toString());
        }
        finally{
            System.err.println("Passei por aqui");
        }
    }
}
