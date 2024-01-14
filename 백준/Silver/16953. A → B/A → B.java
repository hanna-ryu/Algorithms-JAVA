import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int A = Integer.parseInt(st.nextToken());
        int B = Integer.parseInt(st.nextToken());

        /*
        [반복문]
        1. 만약 B가 A와 같다면, 끝낸다.
        2. 만약 B가 1로 끝난다면, 나누기 10을하고 절대값으로 바꾼다.
        3. 만약 B가 2로 나눌수 있다면 (%2==0)이라면, 2로 나눈다.
        4. 둘다 아니라면, 끝낸다.

        1. 끝낸 값이 A가 아니라면 answer은 -1
        */
        int answer = 0;

        while(true){
//            System.out.println("answer = " + answer);
//            System.out.println("A = " + A);
//            System.out.println("B = " + B);
            if(A==B){
                answer++;
                break;
            }

            if(B<=A){
                answer = -1;
                break;
            }

            if(B%10 ==1){
                B = (int)(B / 10);
                answer++;
                continue;
            }else if (B % 2 == 0){
                B = B / 2;
                answer++;
                continue;
            } else {
                if(B != A){
                    answer = -1;
                }
                break;
            }
        }

        System.out.println(answer);

    }

}