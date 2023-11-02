class Solution {
    public int solution(int n, int m, int[] section) {
        int answer = 0;
        int point = 1;
        for(int i = 0 ; i < section.length; i++){
            if(section[i] < point){ continue; } // point가
            point = section[i] + m;
            answer++;
            
        }
        
        
        
        
        //1. section[0] + m 구역 먼저 칠하고 (answer +1)
        //2. if ( section[1] > section[0] + m) { answer + 1 
        //          if(section[1]) + m > section.length){return answer;}
        //                  else 한번더}
        //3. if()
        
        return answer;
    }
}