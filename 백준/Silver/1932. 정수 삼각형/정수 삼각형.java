import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Integer N = Integer.parseInt(br.readLine());

        //삼각형 정의
        Integer[][] arr = new Integer[N][N];
        for (int i = 0; i <N ; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            for (int j = 0; j <= i ; j++) {
                arr[i][j] = Integer.parseInt(st.nextToken());
            }

        }

        //DP삼각형 정의
        Integer[][] dp = new Integer[N][N];
        //출발지점 초기화
        dp[0][0] = arr[0][0];
        //col  row
        for(int i = 1 ; i < N ; i ++){
            for(int j = 0 ; j <= i ; j++ ){
                if(j == 0) { //맨 왼쪽이면
                    dp[i][j] = dp[i - 1][j] + arr[i][j];
                } else if(j == i){ //맨 오른쪽이면
                    dp[i][j] = dp[i - 1][j - 1] + arr[i][j];

                } else {
                    dp[i][j] = Math.max(dp[i-1][j-1], dp[i-1][j]) + arr[i][j];

                }
            }
        }

        int answer = 0;

        for(int i = 0 ; i < N ; i ++){
            answer = Math.max(answer, dp[N-1][i]);
        }
        System.out.println(answer);
    }
}