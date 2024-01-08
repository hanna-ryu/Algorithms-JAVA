import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Collections;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int N = 0;
        int price = 0;
        for (int i = 0; i < 2; i++) {
            if(i == 0) N = Integer.parseInt(st.nextToken());
            else price = Integer.parseInt(st.nextToken());
        }

        Integer[] array = new Integer[N];
        for(int i = 0 ; i < N ; i++){
         array[i] = Integer.parseInt(br.readLine());
        }

        Arrays.sort(array, Collections.reverseOrder());

        int answer = 0;

        for (int i = 0; i < N ; i++) {
            if(price == 0) break;
            if(array[i] > price) {
                continue;
            } else {
                answer += (price / array[i]);
                price = price % array[i];
            }
        }

        System.out.println(answer);

    }


}