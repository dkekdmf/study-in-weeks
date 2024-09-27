import java.util.Scanner;

import static java.util.Collections.max;
import static java.util.Collections.swap;

public class BOJ3085 {
    public static void swap(char arr[][], int r, int c, int r1, int c1) {
        char tmp = arr[r][c];
        arr[r][c] = arr[r1][c1];
        arr[r1][c1] = tmp;

    }

    public static int colmax(char[][] arr) {
        int N = arr.length;
        int maxcol = 0;
        for (int c = 0; c < N; c++) {
            int length = 1;
            for (int r = 1; r < N; r++) {
                if (arr[r][c] == arr[r - 1][c]) length++;
                else {
                    maxcol = Math.max(maxcol, length);
                    length = 1;
                }
            }
            maxcol = Math.max(maxcol, length);

        }
        return maxcol;
    }

    public static int rowmax(char[][] arr) {
        int N = arr.length;
        int maxrow = 0;
        for (int r = 0; r < N; r++) {
            int length = 1;
            for (int c = 1; c < N; c++) {
                if (arr[r][c] == arr[r][c - 1]) length++;
                else {
                    maxrow = Math.max(maxrow, length);
                    length = 1;
                }
            }
            maxrow = Math.max(maxrow, length);

        }
        return maxrow;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        char arr[][] = new char[N][N];
        for (int i = 0; i < N; i++) {
            arr[i] = sc.next().toCharArray();
        }
        int ans = 0;
        for (int i = 0; i < N; i++)
            for (int j = 0; j < N; j++) {
                if (j + 1 < N && arr[i][j] != arr[i][j + 1]) {
                    swap(arr, i, j, i, j + 1);
                    ans = Math.max(ans, Math.max(colmax(arr), rowmax(arr)));
                    swap(arr, i, j, i, j + 1);
                }
                if (i + 1 < N && arr[i][j] != arr[i + 1][j]) {
                    swap(arr, i, j, i + 1, j);
                    ans = Math.max(ans, Math.max(colmax(arr), rowmax(arr)));
                    swap(arr, i, j, i + 1, j);
                }
            }
            System.out.println(ans);

    }
}

