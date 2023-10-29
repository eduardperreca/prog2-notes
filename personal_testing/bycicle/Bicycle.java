class Bicycle {

    private int cadence = 0;
    private int speed = 0;
    private int gear = 1;

    private void changeCadence(int newValue) {
        cadence = newValue;
    }

    void changeGear(int newValue) {
        gear = newValue;
    }

    void speedUp(int increment) {
        speed = speed + increment;
    }

    void applyBrakes(int decrement) {
        speed = speed - decrement;
    }

    void printStates() {
        System.out.println("cadence:" +
                cadence + " speed:" +
                speed + " gear:" + gear);
    }

    // static fa qualcosa che non ho capito, assurdo
    void getElement() {
        System.out.println("im a fucking bicyle pem pem");
    }
}
