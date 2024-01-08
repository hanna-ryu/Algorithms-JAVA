import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Collections;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int accum = 0;
        int answer = 0;
        Integer[] array = new Integer[N];
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");


        for (int i = 0; i < N  ; i++) {
            array[i] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(array);
        for (int i = 0; i < N ; i++) {
            accum += array[i];
            answer += accum;
        }
        System.out.println(answer);

    }
}