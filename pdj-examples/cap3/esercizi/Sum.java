import java.util.List;
import java.util.ArrayList;

public class Sum {
    public static void main(String[] args) {
        List<Integer> els = new ArrayList<Integer>();
        // boxing diretto di int i in Integer (deriva direttamente le caratteristiche di
        // un Integer)
        for (int i = 1; i <= 10; i++) {
            els.add(i);
        }
        System.out.println(sum(els));
    }

    /*
     * Returns the sum of the elements of a given List
     * 
     * @param a , list of elements
     * 
     * @return sum of elements
     */
    public static int sum(List<Integer> a) {
        // OVERVIEW return a sum of a given array of integers.
        // REQUIRES a list of element all >= 0.
        // EFFECTS Return an integer that's the sum of all the values in the given array.
        int sum = 0;
        for (int i = 0; i < a.size(); i++) {
            sum += a.get(i);
        }
        return sum;
    }

}
