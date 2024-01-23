import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] NM = br.readLine().split(" ");
        int N = Integer.parseInt(NM[0]);
        int M = Integer.parseInt(NM[1]);
        List<Integer> list = new ArrayList<>();


        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        for (int i = 0; i < N ; i++) {
            list.add(Integer.parseInt(st.nextToken()));
        }

        StringTokenizer st2 = new StringTokenizer(br.readLine(), " ");
        for (int j = 0; j < M ; j++) {
            list.add(Integer.parseInt(st2.nextToken()));
        }

        Collections.sort(list);

        StringBuilder stringBuilder = new StringBuilder();
        for (Integer integer : list) {
            stringBuilder.append(integer).append(" ");
        }
        System.out.println(stringBuilder);

    }
}