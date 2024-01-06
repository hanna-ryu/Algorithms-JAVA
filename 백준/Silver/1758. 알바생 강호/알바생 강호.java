import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {

    public static void main(String[] args)throws IOException {

        //----입력시작----
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        List<Long> list = new ArrayList<Long>();
        for (int i = 0; i < n; i++) {
            list.add(Long.parseLong(br.readLine())) ;
        }
        //----입력처리 완료----

        //큰 순서대로 정렬하기
        Long answer = 0L;
        Collections.sort(list, Collections.reverseOrder());

        //로직 시작
        for (int i = 0; i < list.size(); i++) {
            if(list.get(i) - i >= 0){
                answer += (list.get(i) - i);
            }
        }

        //정답 출력
        System.out.println(answer);
    }
}