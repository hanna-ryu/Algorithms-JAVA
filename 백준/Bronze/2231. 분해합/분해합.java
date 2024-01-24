import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        for (int i = 1; i <= N ; i++) {
            int constructor = getConstructor(i);

            if(N == 1){
                System.out.println(0);
                return;
            }

            if(constructor == N){
                System.out.println(i);
                return;
            }
            if(i == N-1){
                System.out.println(0);
                return;
            }
        }
    }

    public static int getConstructor(int number){
        int answer = 0;
        String[] nums = (String.valueOf(number)).split("");
        for (int i = 0; i < nums.length; i++) {
            answer += Integer.parseInt(nums[i]);
        }
        answer += number;
        return answer;
    }

}