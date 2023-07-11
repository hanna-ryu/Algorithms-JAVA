import java.util.ArrayList;
class Solution {
    public String[] solution(String[] names) {
        ArrayList<String> answer = new ArrayList<>();
        
        for(int i = 0 ; i < names.length; i +=5){
            answer.add(names[i]);
    }
    return answer.toArray(new String[0]);
}
}