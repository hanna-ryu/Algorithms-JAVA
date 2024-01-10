import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        long[] array = new long[N];
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        for (int i = 0; i < N; i++) {
            array[i] = Long.parseLong(st.nextToken());
        }
        Arrays.sort(array);

        int middleNumber = N / 2 ;
        long answer = 0L;

        //홀수면
        if(N % 2 != 0) {
            for (int i = 0; i < middleNumber; i++) {
                answer = Math.max(array[i] + array[N-i-2], answer);
            }
            if (array[N - 1] > answer) {
                System.out.println(array[N-1]);
            } else {
                System.out.println(answer);
            }
        } else{ //짝수면
            for (int i = 0; i < middleNumber; i++) {
                answer = Math.max(array[i] + array[N-i-1], answer);
            }
            System.out.println(answer);
        }

    }


}