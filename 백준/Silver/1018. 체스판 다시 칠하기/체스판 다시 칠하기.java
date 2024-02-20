import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    static Boolean[][] arr ;
    static int min = 64;

   public static void main (String[] args) throws IOException {
       BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
       StringTokenizer st = new StringTokenizer(br.readLine(), " ");

       int N = Integer.parseInt(st.nextToken());
       int M = Integer.parseInt(st.nextToken());

       arr = new Boolean[N][M];

       for(int i = 0 ; i < N ; i ++){
           String s = br.readLine();
           for(int j = 0 ; j < M ; j++){
                if(s.charAt(j) == 'W'){
                    arr[i][j] = true; // W일때 true
                } else{
                    arr[i][j] = false; // B일때 false
                }
           }
       }

       int row_num = N - 7;
       int col_num = M - 7;

       for (int i = 0; i < row_num; i++) {
           for (int j = 0; j < col_num; j++) {
               find(i,j);
           }
       }

       System.out.println(min);
   }

   public static void find(int x, int y){
        int last_row_num = x + 8;
        int last_col_num = y + 8;
        int count = 0;

        boolean TF = arr[x][y]; // 첫번째 칸의 색

       for (int i = x; i < last_row_num ; i++) {
           for (int j = y; j < last_col_num; j++) {
               if(arr[i][j] != TF){
                   //만약 이전 칸과 색이 다르면 카운트를 증가시킴
                   count++;
               }
                //그리고 색을 바꿔준다.
               TF = !TF;
           }
           TF = !TF; // 이전 줄의 마지막 칸 색과 다음줄의 첫째칸 색은 같아야하니, 줄이 바뀔때마다 색을 또 바꿔준다.
       }

       count = Math.min(count, 64-count); //흑 ver, 백 ver의 두가지 경우의수가 있으니 그 둘 중 최소값을 찾는다.

       min = Math.min(min, count);
//       return min ;
   }



}