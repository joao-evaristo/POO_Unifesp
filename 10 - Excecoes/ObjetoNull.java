package tratamento.de.excecao;

/**
 *
 * @author joaoe
 */
public class ObjetoNull {
    public void Metodo(){
        System.out.println("Executou método");
    }
    public static void main(String[] args) {
        ObjetoNull obj = null;
        //obj.Metodo();
        //Ocorreu uma exceção.
        try {
            obj.Metodo();
        } catch (Exception e) {
            System.out.println("Não é possível chamar um método em um ojeto referenciado como null");
        }
    }
}
