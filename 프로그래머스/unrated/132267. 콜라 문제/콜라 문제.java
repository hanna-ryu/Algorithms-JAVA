class Solution {
    public int solution(int a, int b, int n) {        
        int freeCoke = 0;
        int leftCoke = 0;
        
        while (n >= a ){
            freeCoke +=  Math.floor(n / a) * b ; 
            leftCoke = n % a;
            n = (int)(Math.floor(n / a)) * b + leftCoke;

        }
            
        return freeCoke;
    }
}