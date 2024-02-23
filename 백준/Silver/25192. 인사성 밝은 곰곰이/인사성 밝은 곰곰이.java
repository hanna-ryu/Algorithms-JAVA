import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;

public class Main {
    static int totalCount = 0;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        Set<String> set = new HashSet<>();

        for (int i = 0; i < N; i++) {
            String user = br.readLine();
            if(user.equals("ENTER")){
                totalCount += set.size();
                set.clear();
            } else {
                set.add(user);
                if(i == N -1){
                    totalCount += set.size();
                }
            }
        }

        System.out.println(totalCount);
    }

}