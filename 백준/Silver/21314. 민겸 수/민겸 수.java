import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        // int 자리수 = 0부터 시작해서 점점 올라서 더해주기
        // 최대 : M이 K를 만날때까지 상태 유지. M이 연속되면 상태는 1로 변환시키기.
        // 최소 : K는 그냥 5이다.  M은 연속이면 제곱의 형태가 됨.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String MK_NUM = br.readLine();

        String MIN_NUM = "";
        String MAX_NUM = "";

        StringBuilder sb = new StringBuilder();

        //최소값 찾기
        long accM = 0;
        for(int i = 0 ; i < MK_NUM.length(); i++){
            if(MK_NUM.charAt(i) == 'M'){
                accM++;
                if(i == MK_NUM.length()-1){
                    sb.append('1');
                    for (int j = 1; j < accM; j++) {
                        sb.append('0');
                    }
                }
            } else if(MK_NUM.charAt(i) == 'K'){
                if(accM != 0){
                    sb.append('1');
                    for (int j = 1; j < accM; j++) {
                        sb.append('0');
                    }
                }
                sb.append('5');
                accM = 0;
            }
        }
        MIN_NUM = sb.toString();

        accM = 0;
        StringBuilder sb2 = new StringBuilder();

        for (int i = 0; i < MK_NUM.length() ; i++) {
            if(MK_NUM.charAt(i) == 'M'){
               accM++;
                if(i == MK_NUM.length()-1){
                    for (int j = 0; j < accM ; j++) {
                        sb2.append('1');
                    }
                }

            } else if (MK_NUM.charAt(i) == 'K') {
                if(accM == 0){
                    sb2.append('5');
                } else {
                    sb2.append((5 * (long)Math.pow(10, accM)) + "");
                }
                accM = 0;
            }
        }
        MAX_NUM = sb2.toString();
        System.out.println(MAX_NUM);
        System.out.println(MIN_NUM);


    }
}