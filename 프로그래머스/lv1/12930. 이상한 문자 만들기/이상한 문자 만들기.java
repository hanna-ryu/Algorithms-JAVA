class Solution {
    public String solution(String s) {
        StringBuilder answer = new StringBuilder();
        
        String[] str = s.split("", -1);
        
        int idx = 0;
        
        for(int i = 0 ; i < str.length; i ++){
            if( str[i].equals(" ")){
                answer.append(" ");
                idx = 0;
            } else if(idx % 2 == 0){
                answer.append(str[i].toUpperCase());
                    idx +=1;
            } else{
                answer.append(str[i].toLowerCase());
                    idx +=1;
            }
        }
        
        
        return answer.toString();
    }
}