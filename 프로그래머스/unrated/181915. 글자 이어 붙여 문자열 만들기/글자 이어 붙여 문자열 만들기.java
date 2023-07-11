class Solution {
    public String solution(String my_string, int[] index_list) {
        StringBuffer sb = new StringBuffer();
        
        for(int num : index_list){
            sb.append(my_string.charAt(num));
        }
        return sb.toString();
    }
}