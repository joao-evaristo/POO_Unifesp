package aula09exercicios;

/**
 *
 * @author joaoe
 */
public class Manipular implements CharSequence{
    private String string;

    public Manipular(String string) {
        this.string = string;
    }

    public String getString() {
        return string;
    }

    public void setString(String string) {
        this.string = string;
    }
    
    
    @Override
    public char charAt(int index) {
        return string.charAt(index);
    }

    @Override
    public int length() {
        return string.length();
    }
    private int fromEnd(int i) {
        return string.length() - 1 - i;
    }
    @Override
    public String toString(){
        return this.string;
    }
    @Override
    public java.lang.CharSequence subSequence(int start, int end) {
        if (start < 0) {
            System.err.println("O início não pode ser menor que zero!");

        }
        if (end > string.length()) {
            System.err.println("O fim epecificado está fora de alcance na string!");

        }
        if (start > end) {
            System.err.println("O início não pode ser maior que o fim!");
        }
        return string.subSequence(start, end);
    }
    protected String reverterString(){
        StringBuilder str = new StringBuilder();
        str.append(string);
        str.reverse();
        String strRetorno = str.toString();
        return strRetorno;
    }
    public static void main(String[] args) {
        Manipular testes = new Manipular("TESTE");
        testes.setString(testes.reverterString());
        System.out.println(testes.getString());
        System.out.println(testes.charAt(4));
        System.out.println(testes.subSequence(0, 3));
        System.out.println(testes.reverterString());
    }
}
