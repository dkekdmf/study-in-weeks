import javax.imageio.IIOException;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Sort2 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sc = new StringBuilder();

        int N = Integer.parseInt(br.readLine());
        int arr[] = new int[N];

        for(int i =0; i< arr.length;i++){
            arr[i] = Integer.parseInt(br.readLine());
        }
        Arrays.sort(arr);
        for(int i = 0;i<arr.length;i++){
            sc.append(arr[i]+"\n");
        }
        System.out.println(sc);
    }
}
