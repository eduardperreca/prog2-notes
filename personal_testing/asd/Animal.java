package asd;

public class Animal {
    private int legs;
    private boolean fur;

    // costruttorre credo(?)
    public Animal(int legs, boolean fur) {
        this.legs = legs;
        this.fur = fur;
    }

    // getters methods
    public boolean getFur() {
        return this.fur;
    }

    public int getLegs() {
        return this.legs;
    }
}