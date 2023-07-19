import java.util.Arrays;

class Solution {
    public int[] solution(int[] array, int[][] commands) {
        int[] answer = new int[commands.length];
        
        for(int i = 0 ; i < commands.length ; i++){
            int from = commands[i][0];
            int to = commands[i][1];
            int num = commands[i][2];
            
        int[] newArr = Arrays.copyOfRange(array, from - 1, to);
        Arrays.sort(newArr);
        answer[i] = newArr[num-1];

        }
        
        return answer;
    }
}