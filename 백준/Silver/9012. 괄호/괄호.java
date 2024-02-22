import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < N ; i++) {
            String s = br.readLine();
            Stack stack = new Stack<>();
            for (int j = 0; j < s.length(); j++) {
                if(s.charAt(j) == '('){
                    stack.push("(");
                }  else if (s.charAt(j) == ')') {
                    if(stack.isEmpty()) {
                        stack.push("X");
                        break;
                    }
                    else stack.pop();
                }
            }

            if(stack.size() != 0) sb.append("NO").append("\n");
            else sb.append("YES").append("\n");
        }

        System.out.println(sb);
    }

}