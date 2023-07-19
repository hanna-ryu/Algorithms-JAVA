class Solution {
    public String[] solution(String[] quiz) {
        String[] answer = new String[quiz.length];
        
        for(int i = 0 ; i < quiz.length ; i++){
            String[] newArr = quiz[i].split(" ");
            int result ;
            if(newArr[1].equals("+")){
                result = Integer.parseInt(newArr[0]) + Integer.parseInt(newArr[2]);
            } else{
                result = Integer.parseInt(newArr[0]) - Integer.parseInt(newArr[2]);
            }
            
            if(result == Integer.parseInt(newArr[4])){
                answer[i] = "O";
            } else {
                answer[i] = "X";
            }
            
        }
        return answer;
    }
}