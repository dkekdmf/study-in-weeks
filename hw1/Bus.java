public class Bus {
    int busNumber;
    int passengerCount;
    int money;

    Bus(int busNumber){
        this.busNumber = busNumber;
    }
    public void take(int money){
        //승객수를 늘려주고 받은돈으로 수익을 늘려준다.
        passengerCount++;
        this.money +=money;
    }
    public void showBusInfo(){
        System.out.println(busNumber + "번 버스의 승객은 " + passengerCount + "명이고, 수입은 " + money + "원 입니다.");
    }
}
