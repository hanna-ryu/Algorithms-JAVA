class Solution {
    public int solution(int number, int limit, int power) {
        int answer = 0;
        for(int i = 1 ; i <= number ; i++){
            int divisor= countDivisors(i);
            if(divisor > limit){
                answer += power;
                
            }else {
                answer += divisor;
                
            }
        }        
        return answer;
    }
    
    public int countDivisors(int num){
        int count = 0;
        for(int i = 1 ; i<= (int)(Math.sqrt(num)) ; i ++){
            if(num % i == 0){
                if(i*i == num) count +=1;
                else count += 2;
            }
        }
        return count;
    }
    
}