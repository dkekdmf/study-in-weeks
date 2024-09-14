import java.util.Scanner;

public class Anergram {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String a = sc.next(); //문자열 입력
        String b = sc.next(); //문자열 입력
        int []array = new int[26]; // 배열생성

        int count1 [] = new int[26]; // 26개의 알파벳의 개수를 셀 2개의 배열생성
        int count2 [] = new int[26];
        int ans = 0; // 최종 답변수
        for(int i =0;i<a.length();i++){ //a를 돌면서 그알파벳을 count1배열에 개수를 저장
            count1[a.charAt(i)- 'a']++;

        }
//        for(int i = 0; i<count1.length;i++){
//            System.out.println(count1[i]);
//        }

        for(int i = 0;i<b.length();i++){//b를 돌면서 그알파벳을 count1배열에 개수를 저장
            count2[b.charAt(i)- 'a']++;
        }
//        for(int i = 0; i<count1.length;i++){
//            System.out.println(count2[i]);
//        }


        for(int i = 0; i < 26; i++){ // 26개의 알파벳을 돌면서 만약 개수가 다르다면, 큰수에서 작은수를 뺀다.
            if (count1[i]>count2[i]){
               ans+= count1[i]-count2[i]; // 뺀수만틈 변수에 저장한다.
            }
            else {
                ans += count2[i] - count1[i];
            }
        }
        System.out.println(ans); // 변수값 출력

    }
}
