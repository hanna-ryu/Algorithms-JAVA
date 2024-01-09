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

        Integer[] array = new Integer[N];
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        for (int i = 0; i < N ; i++) {
            array[i] = Integer.parseInt(st.nextToken());
        }


        Arrays.sort(array, Collections.reverseOrder());
        double answer = array[0];
        
        for (int i = 1; i < N ; i++) {
            answer += (double) array[i] / 2 ;
        }

        System.out.println(answer);
    }

}