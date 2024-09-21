import java.util.Scanner;

public class Eureka {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int[] triNum = new int[45];
        for(int i = 1; i < 45; i++) {
            triNum[i] = i * (i + 1) / 2;
        }
        for(int i = 0; i < N; i++) {
            int n = sc.nextInt();
            int result =  eureka(n, triNum);
            System.out.println(result);
        }
    }

    public static int eureka(int N, int[] triNumber) {
        for(int j = 1; j < 45; j++) {
            for (int k = 1; k < 45; k++) {
                for (int z = 1; z < 45; z++) {
                    int sum = triNumber[j] + triNumber[k] + triNumber[z];
                    if (sum == N) {
                        return 1;
                    }
                }
            }
        }
        return 0;

    }
}
