class Solution {
    public int solution(int[] number) {
        int answer = 0;
        
        for(int i = 0 ; i < number.length ; i++){
            for(int k = i+1 ; k < number.length ; k++ ) {
                for ( int j = k + 1 ; j < number.length ; j++){
                    if(number[i] + number[k] + number[j] == 0 ){
                        answer +=1;
                    }
                }
            }
        }
        
        
        return answer;
    }
}