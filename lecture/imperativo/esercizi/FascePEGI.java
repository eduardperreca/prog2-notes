import java.util.Scanner;

public class FascePEGI {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int eta = sc.nextInt();
            if (eta <= 6)
                System.out.println("fascia 3");
            else if (eta <= 11)
                System.out.println("fascia 12");
            else if (eta <= 17)
                System.out.println("fascia 17");
            else
                System.out.println("fascia 17");
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
