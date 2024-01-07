import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        List<Integer> array = new ArrayList<>();
        for (int i = 0; i < N ; i++) {
            array.add( Integer.parseInt(br.readLine()));
        }

        Collections.sort(array, Collections.reverseOrder());
        Long answer = 0L;
        
        for (int i = 0; i < N ; i++) {
           if(i%3 != 2) answer += array.get(i);
        }

        System.out.println(answer);
    }

}