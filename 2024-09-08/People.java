class People {
    int h; // 변수 선언
    int w;
    String gender;
    String name;
    int a;

    People(int h,int w,String gender,String name,int a){ // 생성자로 인스턴스화
        this.h = h;
        this.w = w;
        this.gender = gender;
        this.name = name;
        this.a = a;
    }

    public String showPeopleInfo(){ //함수로 받은 값 리턴
        String ans= "키가"+" "+ h +"이고"+" "+ "몸무게가"+" " + w+ "킬로인"+" " + gender+"이 있습니다."+" " +"이름은"+" "+ name +"이고"+" "+ "나이는"+" " + a+"세입니다.";
        return ans;

    }

    public static void main(String[] args) {
        People p = new People(180,78,"남성","Tomas",37); // 넘겨줄값
        System.out.println(p.showPeopleInfo()); // 객체로 함수 출력
    }
}
