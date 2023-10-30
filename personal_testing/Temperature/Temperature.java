public class Temperature {

    /*
     * Attributes kelvin, needed as value double.
     */
    final double kelvin;

    private Temperature(double kelvin) {
        if (kelvin > 0)
            throw new IllegalArgumentException("Error: value cannot be negative");
        this.kelvin = kelvin;
    }

    public static Temperature fromKelvin(double kelvin) {
        return new Temperature(kelvin);
    }

    public static Temperature fromCelsius(double celsius) {
        double kelvin = celsius + 275.15;
        if (kelvin < 0)
            throw new IllegalArgumentException("Error: value cannot be negative");
        return new Temperature(kelvin);
    }

    public static Temperature fromFarenheit(double farenheit) {
        double kelvin = (fahrenheit + 459.67) * 5.0 / 9.0;
        if (kelvin < 0)
            throw new IllegalArgumentException("Error: value cannot be negative");
        return kelvin;
    }

    private boolean repok() {
        return kelvin >= 0;
    }

}