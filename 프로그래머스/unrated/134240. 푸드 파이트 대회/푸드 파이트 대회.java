class Solution {
    public String solution(int[] food) {
        String answer = "";
        for(int i = 1 ; i < food.length ; i++){
            double halfFood = Math.floor(food[i] / 2);
            if(halfFood == 0){
                continue;
            }
            
            for(int j = 1 ; j <= halfFood ; j ++ ){
                answer += Integer.toString(i);
            }
        }
        
        answer += '0';
        
        for(int i = food.length -1 ; i > 0 ; i--){
            double halfFood = Math.floor(food[i] / 2);
            if(halfFood == 0){
                continue;
            }
            
            for(int j = 1 ; j <= halfFood ; j ++ ){
                answer += Integer.toString(i);
            }
        }
        
        return answer;
    }
}