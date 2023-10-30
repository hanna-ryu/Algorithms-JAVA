class Solution {
    public int solution(int[] nums) {
        int answer = 0;
        
        for(int i = 0 ; i < nums.length - 2; i ++){
            for(int j = i+1 ; j< nums.length - 1 ; j++){
                for (int k = j+1; k < nums.length ; k++){
                    if(isPrimeNumber(nums[i] + nums[j] + nums[k]) == true){
//                         System.out.println("i : "  + nums[i] );
//                         System.out.println("j : "  + nums[j] );
//                         System.out.println("k : "  + nums[k] );
                        
//                         System.out.println(nums[i] + nums[j] + nums[k]);
//                         System.out.println(isPrimeNumber(nums[i] + nums[j] + nums[k]) == true);
                        answer += 1 ;
                    }
                }
            }
        }
        return answer;
    }
    
    public boolean isPrimeNumber(int num){
        for(int i = 2 ; i <= (int)(Math.sqrt(num)) ; i++){
            if(num % i == 0){
                return false;
            }
        }
        return true;
    }
    }