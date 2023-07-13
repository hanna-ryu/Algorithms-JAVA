class Solution {
    public int[] solution(int n, int m) {
        
        int[] answer = new int[2];
        
        int a = Math.max(n,m); //최대값
        int b = Math.min(n,m); //최소값
        
        answer[0] = getGcd(a,b);
        answer[1] = n * m / answer[0];
        
        return answer;
    }
    
    
    public static int getGcd(int n, int m){
        if(m == 0) {
            return n;
           }
        else {
            return getGcd(m, n%m);
        }
    }
    
}