import java.util.ArrayList;

class Solution {
    public int solution(int a, int d, boolean[] included) {
        
        ArrayList<Integer> numArrList = new ArrayList<>();
        
        for(int i = 0 ; i < included.length ; i ++){
            if(i == 0){
                numArrList.add(a);
            }else{
                a += d;
                numArrList.add(a);
            }
        }
        
        int answer = 0;

       for(int i = 0 ; i < included.length ; i ++){
           if(included[i] == true){
               answer += numArrList.get(i);
           }
       }
    
        
        return answer;
    }
}