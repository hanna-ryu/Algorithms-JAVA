import java.io.*;
import java.util.*;
public class Main {
    public static void main(String[] args) throws  IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        int[] TnArray = new int[45];
        //배열에 모든 삼각수를 넣어둔다.
        for(int i = 0 ; i < 45 ; i++){
            TnArray[i] = (i * (i+1)) /2;
//            System.out.println(TnArray[i]);
        }

        for (int i = 0; i < N ; i++) {
//            System.out.println(Integer.parseInt(br.readLine()));
            System.out.println(findTriangleSum(Integer.parseInt(br.readLine()), TnArray));
        }


        // 문제 제한이 1000 자연수까지였음. 그럼 1000을 만들수있는 삼각수까지만 루프를 돌리면 된다.

    }

    public static int findTriangleSum(int number, int[] TnArray){
            int result;
            for(int i = 1; i < 45 ; i++){
                for(int j = 1; j < 45 ; j++){
                    for(int k = 1; k < 45 ; k++){
//                        System.out.println("i = " + i);
//                        System.out.println("j = " + j);
//                        System.out.println("k = " + k);
                        result = TnArray[i] + TnArray[j] + TnArray[k];
//                        System.out.println(result);
                        if(result == number) return 1;
                        else continue;
                    }
                }
            }
            return 0;
    }


}