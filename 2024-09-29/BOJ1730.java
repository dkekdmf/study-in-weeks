import java.util.Scanner;

public class BOJ1730 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        String cmd = sc.hasNext() ? sc.next() : "";
        boolean[][] horizontal = new boolean[N][N];
        boolean[][] vertical = new boolean[N][N];
        int r = 0, c = 0;
        for (int i = 0; i < cmd.length(); i++) {
            char cmd1 = cmd.charAt(i);


            if (cmd1 == 'D') {
                if (r == N - 1) continue;
                vertical[r][c] = vertical[r + 1][c] = true;
                r++;
            }
            else if(cmd1 == 'U') {
                if (r == 0) continue;
                vertical[r][c] = vertical[r - 1][c] = true;
                r--;
            }
            else if(cmd1 == 'L'){
                if(c == 0) continue;
                horizontal[r][c] = horizontal[r][c-1] = true;
                c--;
            }
            else {
                if(c==N-1) continue;
                horizontal[r][c] = horizontal[r][c+1] = true;
                c++;
            }

        }

        for(int i = 0; i<N;i++){
            String ans = "";
            for(int j = 0;j <N;j++){
                if(horizontal[i][j]&&vertical[i][j] == true)
                    ans+="+";
                else if(horizontal[i][j] == true)
                    ans+="-";
                else if(vertical[i][j] == true)
                    ans+="|";
                else
                    ans+='.';
            }

            System.out.println(ans);
        }

    }
}
