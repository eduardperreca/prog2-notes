
public class Esempio {
    public static void main(String[] args) {
        // Stringa ha come supertipo Object, il supertipo deriva i metodi dei sottotipi.
        // controllare doc per eventuali incompresioni.
        Object x = new String("Piccola");
        String s = new String("Ciao Mamma");
        System.out.println(s.length())
    }
}