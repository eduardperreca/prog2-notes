public class Selezione {

    public static int max(int a, int b) {
        // la selezione in java, come in C se distribuita da una sola riga di codice puó
        // essere omesso l'utlizzo delle parentesi graffe.
        if (a>b) return a;
        return b;
    }
    public static void main(String[] args) {
        int a = 7;
        int b = 12;
        System.out.println(max(a, b));
    }
}