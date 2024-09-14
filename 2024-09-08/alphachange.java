import java.util.Scanner;

public class alphachange {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String str1 = sc.next(); // 문자열 입력받는다.

        for(int i = 0; i < str1.length();i++){ // 문자열 돌면서
           char ch = str1.charAt(i); // 스트링문자를 한글자씩 char형태로 바꾼다

           if (ch>='A' && ch<='Z'){ // 만약 그값이 대문자라면
               System.out.print((char)('a'+ch-'A')); // 소문자로 바꾸어 출력한다.
           }
           else{                    // 소문자라면
               System.out.print((char)('A'+ch-'a')); //대문자로 바꾸어 출력한다.
           }
        }
    }
}
