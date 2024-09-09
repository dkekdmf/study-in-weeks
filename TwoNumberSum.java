import java.util.Scanner;

public class TwoNumberSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int []arr = new int[n];
        for(int i=0;i<n;i++){
            int s = sc.nextInt();
            arr[i] = s;
        }
        int x= sc.nextInt();
//        for(int i=0 ; i<n;i++){
//            System.out.println(arr[i]);
//        }
//        int ans =0;
//        for(int i =0;i<n;i++){
//            for(int j = i+1;j<n;j++){
//                if (arr[i]+arr[j]==x)
//                    ans++;
//            }
//        }
//        System.out.println(ans);
        boolean exist[] = new boolean[1000001];
        for(int i =0;i<n;i++){
            exist[arr[i]] = true;
        }
        int ans = 0;

        for(int i =1;i<=(x-1)/2;i++){
            if(i<=1000000 && x-i<=1000000){
                ans+= (exist[i]&&exist[x-i])? 1:0;
            }

        }
        System.out.println(ans);
//        for(int i = 0;i<n; i++){
//            exist[arr[i]] = true;
//        }
//        int ans = 0;
//        for(int i = 0;i<n;i++){
//            int value = x-arr[i];
//            if(value>=0 && value<=1000000){
//                ans+=exist[value]? 1:0;
//            }
//        }
//        System.out.println(ans/2);
    }
}
