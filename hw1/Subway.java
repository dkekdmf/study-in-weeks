public class Subway {


    int lineNumber;
    int passengerCount;
    int money;

    Subway(int lineNumber){
        this.lineNumber = lineNumber;
    }
    public void take(int money){
        passengerCount++;
        this.money+=money;

        //승객수를 늘려주고 받은돈으로 수익을 늘려준다.
    }
    public void showSubwayInfo(){
        System.out.println(lineNumber + "번 지하철의 승객은 " + passengerCount + "명 이고, 수입은 " + money + "원 입니다.");
    }
}
