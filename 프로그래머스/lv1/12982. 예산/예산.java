import java.util.Arrays;

class Solution {
    public int solution(int[] d, int budget) {
        int answer = 0;
        int totalMoney = 0;
        
        Arrays.sort(d);
        
        for(int i = 0 ; i < d.length; i ++){
            
            if(totalMoney + d[i] > budget){
                break;
            }

            totalMoney += d[i];
            answer = i +1;
            
            
        }
        
        return answer;
    }
}