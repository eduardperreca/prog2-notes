import java.util.ArrayList;
import java.util.List;

public class BoxingUmboxing {
    public static void main(String[] args) {
        // in questo caso, da un refType estrapolo il suo tipo primitivo e ci faccio
        // delle operazioni sopra.
        List<Integer> list = new ArrayList<>();
        list.add(2);
        list.add(14);
        int somma = 0;
        for (int i : list)
            somma += i;
        System.out.println(somma);
    }
}
