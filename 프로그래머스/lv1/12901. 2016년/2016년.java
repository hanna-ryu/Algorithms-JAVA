import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
class Solution {
    public String solution(int a, int b) {
        String answer = "";
        
        LocalDate firstDate = LocalDate.of(2016,1,1);
        LocalDate targetDate = LocalDate.of(2016, a, b);
        System.out.println(targetDate);
        
        long daysDifference = ChronoUnit.DAYS.between(firstDate, targetDate);
        System.out.println(daysDifference);
        
        if(daysDifference % 7 == 1){
            return "SAT";
        }else if(daysDifference % 7 ==2){
            return "SUN";
        }else if(daysDifference % 7 ==3){
            return "MON";
        }else if(daysDifference % 7 ==4){
            return "TUE";
        }else if(daysDifference % 7 ==5){
            return "WED";
        }else if(daysDifference % 7 ==6){
            return "THU";
        }else if(daysDifference % 7 ==0){
            return "FRI";
        }


        
        
        return answer;
    }
}