import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String sentence = br.readLine();

        // "-"를 기준으로 끊어내기
        // 내부 배열끼리는 더하고, 외부 배열끼리는 뺀다.
        String[] sentenceArray = sentence.split("-");
        int answer = 0;

        for (int i = 0; i <sentenceArray.length ; i++) {
            int  innerSum = 0;
            String[] innerSumArray = sentenceArray[i].split("\\+");

            for (int j = 0; j < innerSumArray.length; j++) {
                innerSum += Integer.parseInt(innerSumArray[j]);
            }

            if(i == 0) {
                answer = innerSum;
                continue;
            };
            answer -= innerSum;
        }
        System.out.println(answer);
        }
    }