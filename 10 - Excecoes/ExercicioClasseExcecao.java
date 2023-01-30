/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tratamento.de.excecao;

/**
 *
 * @author joaoe
 */
public class ExercicioClasseExcecao extends Exception{
    private String mensagem;

    public ExercicioClasseExcecao( String m) {
        super(m);
        mensagem = m;
    }
    public void ImprimeErro(){
        System.err.println(mensagem);
    }
    public static void main(String[] args) {
        ExercicioClasseExcecao exe = new ExercicioClasseExcecao("Ocorreu um erro e a classe ExercicioClasseExcecao foi disparada");
        try {
            throw exe;
        } catch (Exception e) {
            System.out.println("Houve um erro que foi relatado pela classe ExercicioClasseExcecao durante a execução");
            exe.ImprimeErro();
        }
    }
}
