import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;

        int N = Integer.parseInt(br.readLine());
        Stack<String> stack = new Stack<>();


        for (int i = 0; i < N ; i++) {
            st = new StringTokenizer(br.readLine());
            String num = st.nextToken();

            //만약 1이면
            if(num.equals("1")){
                stack.push(st.nextToken());
            } else if (num.equals("2")) { // 만약 2이면
                if(stack.isEmpty()){
                    sb.append("-1").append("\n");
                }else{
                    sb.append(stack.lastElement()).append("\n");
                    stack.pop();
                }
            } else if (num.equals("3")) { // 만약 3이면
                sb.append(stack.size()).append("\n");
            } else if (num.equals("4")) { // 만약 4이면
                if(stack.isEmpty()) sb.append("1").append("\n");
                else sb.append("0").append("\n");
            } else if (num.equals("5")) { //만약 5이면
                if(stack.isEmpty()){
                    sb.append("-1").append("\n");
                }else{
                    sb.append(stack.lastElement()).append("\n");
                }
            }

        }
        System.out.println(sb);
    }
}