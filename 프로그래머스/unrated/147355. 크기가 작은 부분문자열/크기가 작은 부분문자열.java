
class Solution {
    public int solution(String t, String p) {
        int answer = 0;
        String nums = "";
        
        for(int i = 0 ; i < t.length() - p.length()+1; i++ ){
            nums = t.substring(i, i + p.length());
        
            if(Long.parseLong(nums) <= Long.parseLong(p)){
            answer += 1;
            }
        }
        return answer;
    }
}