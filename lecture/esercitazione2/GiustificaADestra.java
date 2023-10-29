import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class GiustificaADestra {
    public static void main(String[] args) {
        try (Scanner s = new Scanner(System.in)) {
            List<String> parole = new ArrayList<>();
            int maxLen = 0;
            while (s.hasNext()) {
                String parola = s.next();
                if (parola.length() > maxLen)
                    maxLen = parola.length();
                parole.add(parola);
            }
            for (String parola : parole) {
                int spaces = maxLen - parola.length();
                while (spaces > 0) {
                    System.out.print(" ");
                    spaces--;
                }
                System.out.println(parola);
            }

        }
    }
}
