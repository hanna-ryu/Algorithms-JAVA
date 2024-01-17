import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());

        for (int i = 0; i < T ; i++) {
            int N = Integer.parseInt(br.readLine());
            int[] stockPrices = new int[N];

            String[] prices = br.readLine().split(" ");
            for (int j = 0; j <  stockPrices.length; j++) {
                stockPrices[j] = Integer.parseInt(prices[j]);
            }

            long answer = getMaxBenefit(stockPrices);
            System.out.println(answer);
        }
    

    }

    public static long getMaxBenefit(int[] stockPrices){
        long answer = 0;
        long maxNum = stockPrices[stockPrices.length-1];

        for(int i = stockPrices.length - 2 ; i >= 0; i--){
            if(stockPrices[i] <= maxNum){
                answer += (maxNum - stockPrices[i]);
            } else{
                maxNum = stockPrices[i];
            }

        }
        return answer;
    }

}