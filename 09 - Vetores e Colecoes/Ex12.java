package exercicios;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author joaoe
 */
public class Ex12 {
    
    public class Cat {
        private int catNumber;
        public Cat(int i) { catNumber = i; }
        public void id() {
        System.out.println("Cat #" + catNumber);
        }
    }
    public class Dog {
        private int dogNumber;
        public Dog(int i) { dogNumber = i; }
        public void id() {
        System.out.println("Dog #" + dogNumber);
        }
    }
    public static void main(String[] args) {
        List cats = new ArrayList();
        Ex12 teste = new Ex12();
        for(int i = 0; i < 7; i++){
            cats.add(teste.new Cat(i));
        }
        cats.add(teste.new Cat(7));
        for(int i = 0; i < cats.size(); i++){
            ((Cat)cats.get(i)).id();
        }
    }
}
