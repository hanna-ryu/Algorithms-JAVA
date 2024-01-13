import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        String color = br.readLine();

        int redCount = 0;
        int blueCount = 0;
        int answer = 0;

        StringTokenizer st = new StringTokenizer(color, "B");

        while (st.hasMoreElements()){
            st.nextToken();
            redCount++;
        }


        st = new StringTokenizer(color, "R");

        while (st.hasMoreElements()){
            st.nextToken();
            blueCount++;
        }

        if(redCount >= blueCount){
            answer = blueCount +1;
        } else if (blueCount > redCount) {
            answer = redCount +1;
        }

        System.out.println(answer);

    }
}