public class Carrfactest {
    public static void main(String[] args) {
        Carfac factory = Carfac.getInstance();
        Car mySonata = factory.createCar();
        Car yoursonata = factory.createCar();
        System.out.println(mySonata.getCarNumber());
        System.out.println(yoursonata.getCarNumber());
    }
}
