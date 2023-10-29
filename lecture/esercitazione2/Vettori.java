import java.util.Vector;

public class Vettori {
    public static void main(String[] args) {
        Vector v = new Vector();
        v.add("ciao");
        v.add("test");
        String s = (String) v.get(0);
        System.out.println(s);
    }
    // unsafe
}