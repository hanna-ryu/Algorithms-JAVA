import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Objects;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());

        String table = br.readLine();
        int answer = 0;

        char[] charTable = new char[N];
        boolean[] ate = new boolean[N];

        for (int i = 0; i < N ; i++) {
            charTable[i] = table.charAt(i);
        }


        for (int i = 0; i < N ; i++){
            // 만약 charTable의 해당 인덱스 값이 "P"라면, 즉 사람이라면
            if(charTable[i] == 'P'){
                //탐색할 범위를 지정해준다
                int startIdx = Math.max(i - K , 0);
                int endIdx = Math.min(i + K , N -1);

                //for문을 돌면서 범위 내에 H(햄버거)가 있다면 answer에 +1을 해주고, ate배열에서 햄버거를 먹은것으로 표시하기
                for (int j = startIdx ; j <= endIdx ; j++) {
                    if(charTable[j] == 'H' && !ate[j]){
                        answer++;
                        ate[j] = true;
                        break;
                    }
                }
            }
        }
        System.out.println(answer);
    }
}