import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] firstLine = br.readLine().split(" ");
        int N = Integer.parseInt(firstLine[0]);
        int M = Integer.parseInt(firstLine[1]);

        int[][] A = new int[N][M];
        int[][] B = new int[N][M];
        int answer = 0;

        //A 행렬
        for(int i = 0; i < N ; i++){
            String line = br.readLine();
            for(int j = 0  ; j < M ; j++){
                A[i][j] = line.charAt(j) - '0';
            }
        }

        //B 행렬
        for(int i = 0; i < N ; i++){
            String line = br.readLine();
            for(int j = 0  ; j < M ; j++){
                B[i][j] = line.charAt(j) - '0';
            }
        }

        //뒤집기
        for(int i = 0 ; i < N -2 ; i++){
            for (int j = 0; j < M-2 ; j++) {
                //숫자가 같으면 안뒤집고 다음 반복문으로
                if(A[i][j] == B[i][j]){
                    continue;
                } else{
                    //숫자가 다르면 카운트 증가
                    answer++;
                }

                //뒤집기
                for(int x = i ; x < i+3 ; x++){
                    for (int z = j; z < j+3 ; z++) {
                        A[x][z] = A[x][z]  == 1 ? 0 : 1;
                    }
                }

            }
        }

        //뒤집은 A랑 B랑 같은지 판별하기 
        for(int i = 0; i < N ; i++){
            for (int j = 0; j < M ; j++) {
                if(A[i][j]!= B[i][j]){
                    System.out.println(-1);
                    return;
                }
            }
        }

        System.out.println(answer);
    }
}