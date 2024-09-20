public class Carfac {
    private static Carfac Instance = new Carfac();

    private Carfac() {
    }

    public static Carfac getInstance() {
        if (Instance == null) {
            Instance = new Carfac();
        }
        return Instance;
    }

    public Car createCar() {
        Car car = new Car();
        return car;
    }
}