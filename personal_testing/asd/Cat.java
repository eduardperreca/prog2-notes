package asd;

public class Cat extends Animal {
    private int tailLength;

    public Cat(boolean fur, int tailLength) {
        super(4, fur);
        this.tailLength = tailLength;
    }

    public int getTailLength() {
        return this.tailLength;
    }

    @Override
    public int getLegs() {
        return 666;
    }

}
