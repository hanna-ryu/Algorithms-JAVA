import java.util.*;
class Solution {
    public int solution(int k, int m, int[] score) {
    int answer = 0;
    ArrayList<Integer> arr = new ArrayList<>(score.length);
    for(int i = 0 ; i< score.length; i ++){
        arr.add(score[i]);    
    }
    Collections.sort(arr, Collections.reverseOrder());     
    for(int i = m-1; i< arr.size(); i+=m){
        answer += arr.get(i)*m;
    }
        
    return answer;
        
    }
}

//사과들을 내림차순으로 정렬한담에 개수만큼 쪼개서 값을 도출하기 