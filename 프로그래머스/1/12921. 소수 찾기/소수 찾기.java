class Solution {
    public int solution(int n) {
        int answer =0;
        for(int i = 2 ; i <= n ; i ++){
            if(findPrimeNumber(i) == true){
            answer +=1;
            }
        }
        return answer;
    }
    
    public boolean findPrimeNumber(int n){
        boolean isPrimeNumber = false;
        if(n== 2 || n == 3) return true;
        for(int i = 2 ; i <= (int)(Math.sqrt(n)) ; i ++){

            if(n % i== 0){
                isPrimeNumber = false;
                return isPrimeNumber;
            } else {
                isPrimeNumber = true;
            }
        }
        return isPrimeNumber;
    }
}