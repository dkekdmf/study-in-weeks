import java.util.Scanner;

public class Salt {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String cr = sc.next();//현재시각
        String dr = sc.next();//투하시각

        String[] crsplit = cr.split(":");//":" 기준으로 시분초를 쪼갠다.
        int crhour = Integer.parseInt(crsplit[0]); // 쪼갠값을 각각 배열에 접근하여 문자열을 캐스팅을 통해 정수로 변환한다.
        int crminute = Integer.parseInt(crsplit[1]);
        int crsecond = Integer.parseInt(crsplit[2]);
        String[] drsplit = dr.split(":");
        int drhour = Integer.parseInt(drsplit[0]);
        int drminute = Integer.parseInt(drsplit[1]);
        int drsecond = Integer.parseInt(drsplit[2]);


        int crsumsecond = crhour*3600+crminute*60+crsecond; //구해진 시간을 전부 초단위로 더한다.
        int drsumsecond = drhour*3600+drminute*60+drsecond;

        int fnsumsecond = drsumsecond-crsumsecond; // 투하시간의 합에서 현재시간의합을 뺀다.

        if (fnsumsecond <=0){ // 만약 음수라면. 하루를 초단위로 더한다.
            fnsumsecond+=24*3600;
        }
        int fnhour = fnsumsecond/3600; // 초단위를 각각 시간,분,초로 다시 변환한다.
        int fnminute = fnsumsecond%3600/60;
        int fnsecond = fnsumsecond%60;

        System.out.printf("%02d:%02d:%02d",fnhour,fnminute,fnsecond); // printf함수를 통해 시분초를 포매팅하여 울력한다.
    }
}
