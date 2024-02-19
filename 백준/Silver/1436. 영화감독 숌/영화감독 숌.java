import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        int num = 1;
        int start = 666;

        while(num != N){
            start++;
            if(String.valueOf(start).contains("666")){
                num++;
            }
        }

        System.out.println(start);
    }

}