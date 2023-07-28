import java.util.HashSet;
class Solution {
    public int solution(int[] nums) {
        HashSet<Integer> set = new HashSet<Integer>();	
        int answer = 0;
        
        for(int num : nums){
            set.add(num);
        }
        
        
        if(nums.length / 2 <= set.size()){
            answer = nums.length /2;
        } else{
            answer = set.size();
        }
        
        
        return answer;
    }
}