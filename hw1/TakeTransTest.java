public class TakeTransTest {
    public static void main(String[] args) {


        Student James = new Student("James",5000);
        Student Tomas = new Student("Tomas",10000);

        Bus bus = new Bus(100);
        Subway subway = new Subway(2);
        James.takeBus(bus);
        Tomas.takeSubway(subway);
        James.showInfo();
        Tomas.showInfo();
        bus.showBusInfo();

        subway.showSubwayInfo();
    }
}
