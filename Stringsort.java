import java.util.Scanner;

public class Stringsort {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int p = sc.nextInt();
        while(p-->0){
            int T = sc.nextInt();
            int [] arr = new int[20];
            for(int i =0; i<20;i++)
                arr[i] = sc.nextInt();

            int ans = 0;
            int []arr2 = new int[20];
            for (int i =0; i<20;i++){
                boolean find = false;
                for(int j = 0; j<i; j++)
                    if(arr[i]<arr2[j]){
                        find = true;
                        for(int k = i-1;k>=j;k--){
                            arr2[k+1] = arr2[k];
                            ans++;
                        }
                        arr2[j] = arr[i];
                        break;
                    }
                if (!find) arr2[i] = arr[i];


            }
            System.out.println(T+ " "+ ans);
        }
    }
}
