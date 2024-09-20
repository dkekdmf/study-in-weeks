public class Car {
    private static int CNumber = 10000;
    private int CarNumber;

    public Car() {
        CNumber++;
        CarNumber=CNumber;
    }

    public int getCarNumber() {
        return CarNumber;
    }

    public void setCarNumber(int CarNumber) {
        this.CarNumber=CarNumber;
    }

}
