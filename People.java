class People {
    int h;
    int w;
    String gender;
    String name;
    int a;

    People(int h,int w,String gender,String name,int a){
        this.h = h;
        this.w = w;
        this.gender = gender;
        this.name = name;
        this.a = a;
    }

    public String showPeopleInfo(){
        String ans= "키가"+" "+ h +"이고"+" "+ "몸무게가"+" " + w+ "킬로인"+" " + gender+"이 있습니다."+" " +"이름은"+" "+ name +"이고"+" "+ "나이는"+" " + a+"세입니다.";
        return ans;

    }

    public static void main(String[] args) {
        People p = new People(180,78,"남성","Tomas",37);
        System.out.println(p.showPeopleInfo());
    }
}
