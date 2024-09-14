public class Order {
    String rn; // 변수선언
    String pn;
    String a;
    String d;
    String t;
    String p;
    String mn;
    Order(String rn,String pn,String a,String d,String t,String p, String mn){ // 생성자 초기화
        this.rn = rn;
        this.pn = pn;
        this.a = a;
        this.d = d;
        this.t = t;
        this.p = p;
        this.mn = mn;
    }
    public String showOrderInfo(){ // 함수 구현하여 값 리턴.
        String ans = "주문 접수 번호 : "+rn +"\n"+"주문핸드폰번호 : "+pn+ "\n" + "주문 집 주소 : "+a+"\n"+"주문 날짜 : " +d+"\n"+ "주문 시간 : "+t+"\n" +"주문 가격 : "+ p+"\n"+"메뉴 번호 : "+mn;
        return ans;
    }


    public static void main(String[] args) {
       Order o = new Order("202011020003","01023450001","서울시 강남구 역삼동 111-333","20201102","139258","35000","0003"); // 넘겨줄값
        System.out.println(o.showOrderInfo()); // 객체로 함수출력

    }

}
