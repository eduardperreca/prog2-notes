import java.util.Scanner;

public class ScannerInput {

    public static void main(String[] args) {
        int somma = 0;
        try (Scanner s = new Scanner(System.in)) {
            while (s.hasNextInt()) {
                somma += s.nextInt();
            }
        }
        System.out.println(somma);
    }
}