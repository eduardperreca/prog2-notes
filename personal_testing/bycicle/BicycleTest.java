class BicycleTest {
    public static void main(String... args) {
        Bicycle b = new Bicycle();
        b.getElement();

        MountainBike m = new MountainBike();
        m.getElement();

        RoadBike r = new RoadBike();
        r.getElement();

        TandemBike t = new TandemBike();
        t.getElement();
    }
}