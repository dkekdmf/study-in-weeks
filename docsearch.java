import java.util.Scanner;

public class docsearch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        int count = 0;
//        int startIndex = 0;
//
//
        String document = sc.nextLine();
        String word = sc.nextLine();
//        while(true){
//            int findIndex = document.indexOf(word,startIndex); // IndexOf 함수로 startIndex부터 word를 찾아 그 인덱스를 변수에 저장한다.
//            if(findIndex<0){ //만약 음수라면, 종료
//                break;
//            }
//            count++;//찾은 만큼 count값 증가
//            startIndex= findIndex+word.length(); //찾았으므로 찾은값에서 단어의 길이를 더해 그값부터 다시 찾는다.
//        }
//        System.out.println(count);
         String ans = document.replace(word,""); // word를 지운다.
         int documentlen = document.length(); //
         int anslen = ans.length();
         int len = documentlen- anslen; //document에서 ans값을 빼서 word의 길이만큼 나눈다.
         int count = len/word.length();
         System.out.println(count); //답출력


    }
}
