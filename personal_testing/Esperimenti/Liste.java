import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

public class Liste {
    /*
     * Supponiamo di dover immagazzinare i quadrati dei primi 10 numeri interi
     * positivi e quindi di doverli sommare.
     */
    public static void main(String[] args) {

        // abbiamo due modi per poter approcciare a questo problema:
        /*
         * Usando i generici e il boxing/unboxing automatico (disponibili nelle
         * versioni recenti di Java)
         */

        int somma = 0;

        List<Integer> list = new ArrayList<>();
        for (int i = 1; i <= 10; i++)
            list.add(i * i);
        for (int x : list)
            somma += x;
        System.out.println(somma);

        /*
         * old school method
         */

        int somma2 = 0;
        Vector<Integer> vettoreOldSchool = new Vector<>();
        for (int i = 1; i <= 10; i++)
            vettoreOldSchool.add(i * i);

        // che rottura di coglioni vector, safe per operazioni concorrenziali.
        for (int x = 0; x < vettoreOldSchool.size(); x++) {
            somma2 += vettoreOldSchool.get(x);
        }
        System.out.println(somma2);
    }
}