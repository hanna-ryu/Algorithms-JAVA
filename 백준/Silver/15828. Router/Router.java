import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();
        Queue<String> queue = new LinkedList<>();
        while (true){
           String s =  br.readLine();
           if(s.equals("-1")) {
               break;
           }
           else if(s.equals("0")) {
               queue.poll();
           }
           else {
               if(queue.size() < N ){
                   queue.add(s);
               }
           }
        }

        if(queue.isEmpty()) sb.append("empty");
        else {
            for (String s : queue) {
                sb.append(s).append(" ");
            }
        }
        System.out.println(sb);
    }

}