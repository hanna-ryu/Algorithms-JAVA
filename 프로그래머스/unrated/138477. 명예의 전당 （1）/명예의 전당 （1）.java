import java.util.Arrays;
import java.util.Collections;

class Solution {
    public int[] solution(int k, int[] score) {
        int[] answer = new int[score.length];
        
        for(int i = 0 ; i < score.length ; i++){
            int[] newArr = Arrays.copyOfRange(score,0,i+1);
            Arrays.sort(newArr);
            if(newArr.length <= k){
                answer[i] = newArr[0];
            }else {
                answer[i] = newArr[newArr.length - k];
            }
            
            
        }
        
        return answer;
    }
}