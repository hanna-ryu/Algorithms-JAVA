import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {

        //버퍼드리더로 첫째줄 int 입력받기
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        //둘째줄 : 거리들을 담을 배열
        long[] distance = new long[n-1];
        //셋째줄: 각 주유소의 가격을 담을 배열
        long[] price = new long[n];

        // StringTokenizer로 공백을 기준으로 끊어서 받아온다.
        // 거리들을 담을 배열에 하나씩 넣는다.
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        for (int i = 0; i < n - 1; i++) {
            distance[i] = Long.parseLong(st.nextToken());
        }

        //다음줄의 라인을 공백을 기준으로 끊어서
        //price 배열에 담는다.
        st = new StringTokenizer(br.readLine(), " ");
        for (int i = 0; i < n ; i++) {
            price[i] = Long.parseLong(st.nextToken());
        }

        //---- 여기까지 입력 처리 완료 -----
        //---- 아래부터 문제 풀이 ---------

        Long totalPrice = 0L;
        Long minPrice = 0L;

        for (int i = 0; i < n-1; i++) {
            if(i == 0){
                minPrice = price[i];
            } else{
                minPrice = Math.min(minPrice, price[i]);
            }
            totalPrice += minPrice * distance[i] ;
        }
        System.out.println(totalPrice);
    }
}