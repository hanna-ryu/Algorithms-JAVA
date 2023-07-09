import java.util.ArrayList;
class Solution {
    public int[] solution(int[] arr) {
        ArrayList<Integer> result = new ArrayList<>();
        
        for(int i = 0 ; i < arr.length ; i++){
            for(int j=1 ; j<= arr[i]; j++){
                result.add(arr[i]);
            }
        }
        
        int[] answer = new int[result.size()];
        for(int i = 0 ; i < result.size(); i++){
            answer[i] = result.get(i);
        }
        
        
        
        return answer;
    }
}