import java.util.Scanner;

public class WordStudy {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String word = sc.next(); // 문자열입력
        int[] array = new int[26]; // 배열생성

        for(int i = 0; i<word.length();i++){//입력을 돌면서
            if('A'<= word.charAt(i)&& word.charAt(i)<='Z'){ // 대문자라면
                array[word.charAt(i)- 'A']++; // 배열에 대문자의 개수 증가

            }
            else{
                array[word.charAt(i) - 97]++; // 배열에 소문자의 개수 증가
            }
        }
        int maxcount = -100001; // 최대값 변수
        int maxindex = 0; // 최대값의 인덱스를 나타낼 변수
        char ch = '?'; // 문자 초기화
        for(int i =0; i< 26; i++){ // 알파벳 수만큼 돌면서
            if (array[i]> maxcount){ // 최대값 갱신하면서 maxindex에 그 최대값 인덱스를 넣는다.
                maxcount = array[i];
                maxindex = i;
                ch = (char)(maxindex+'A'); //대문자 출력
            }
            else if(array[i] == maxcount){ // 만약 최대값이 2개 이상이라면 물음표 출력
                if(maxcount>=2)
                     ch = '?';
            }
        }

        System.out.println(ch); // 출력
    }
}
