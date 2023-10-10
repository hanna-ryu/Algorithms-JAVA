import java.util.*;

class Solution {
    public int[] solution(int[] answers) {
        
        int[][] students = {
            {1,2,3,4,5},
            {2,1,2,3,2,4,2,5},
            {3,3,1,1,2,2,4,4,5,5}
        };
        
        //학생별 맞춘 정답 개수 담는 배열
        int[] answerCounts = {0,0,0};
        
        //정답 개수 더하는 로직
        for(int i = 0 ; i < students.length; i++){
            for(int j = 0 ; j < answers.length ; j++){
                if(answers[j] == (students[i][j % students[i].length])){
                  answerCounts[i]++;
                }
           };
        };
        
        List<Integer> result = new ArrayList<>();
        
        int MAX_NUM = Math.max(answerCounts[0], Math.max(answerCounts[1], answerCounts[2]));
        
        for(int i = 0 ; i < answerCounts.length ; i ++){
            if(answerCounts[i] == MAX_NUM){
                result.add(i+1);
            }
        }
        
        int[] intResult = result.stream()
	    .mapToInt(Integer::intValue)
    	.toArray();
        
        return intResult;
    }
}