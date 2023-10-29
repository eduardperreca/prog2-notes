public class SalveMondo {
    // stato

    // questo metodo non dipenda dall'istanza , posso farlo funzionare anche senza
    // aver istanziato la classe
    // posso accedere direttamente SalveMondo.somma()
    public static int somma(int x, int y) {
        return x + y;
    }

    public static void main(String[] args) {
        System.out.println("Salve, mondo!");
        System.out.println(SalveMondo.somma(2, 3)); 
    }

}
