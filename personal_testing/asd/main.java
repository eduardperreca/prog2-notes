package asd;

class Main {
    public static void main(String[] args) {
        System.out.println("ciao");
        Animal test = new Animal(4, true);
        System.out.println(Boolean.toString(test.getFur()) + " " + Integer.toString(test.getLegs()));

        Cat test2 = new Cat(false, 123);
        System.out.println(Boolean.toString(test2.getFur()) + " " + Integer.toString(test2.getLegs()) + " "
                + Integer.toString(test2.getTailLength()));

        // test supertype -> undefined
        Animal dio = new Cat(false, 10);
        System.out.println(Integer.toString(dio.getLegs()));

        // casting
        System.out.println(Integer.toString(((Cat) dio).getTailLength()) + " test");
    }
}