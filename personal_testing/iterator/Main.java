import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Main {

    public static void main(String[] args) {
        ArrayList<String> foods = new ArrayList<String>();
        foods.add("Pizza");
        foods.add("Ice Cream");
        foods.add("Bourbon Chicken");
        Iterator<String> it = foods.iterator();
        while (it.hasNext()) {
            System.err.println(it.next());
        }

        Set<Integer> nums = new HashSet<Integer>();
        nums.add(32);
        nums.add(44);
        nums.add(123);
        nums.add(944);
        Iterator<Integer> itNum = nums.iterator();
        while (itNum.hasNext()) {
            System.out.println(itNum.next());
        }
    }

}