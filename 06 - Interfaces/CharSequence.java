package aula09exercicios;

/**
 *
 * @author joaoe
 */
public interface CharSequence {
    abstract char charAt(int index);
    abstract int length();
    abstract java.lang.CharSequence subSequence(int start, int end);
    @Override
    abstract String toString();
}
