package exercicioconcorrencia;

/**
 *
 * @author joaoe
 */
public class CalculoPrimosThread extends Thread{
    private int limini , limfi, count=0;
    public CalculoPrimosThread(int limini, int limfi){
        this.limini = limini;
        this.limfi = limfi;
    }
    private static boolean ehPrimo(int numero) {
        for (int j = 2; j < numero; j++) {
            if (numero % j == 0)
                return false;   
            }
        return true;
    }
    @Override
    public void run(){
        for (int i = limini; i<limfi; i++){
            if(ehPrimo(i)){
                count+=1;
            }
        }
    }
    public int getCount() {
        return count;
    }
    
}
