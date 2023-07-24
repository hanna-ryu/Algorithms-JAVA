import java.math.BigInteger;

class Solution {
    public BigInteger solution(int balls, int share) {
        
        
        BigInteger upside = BigInteger.ONE;
        for(int i = 1 ; i <= balls; i ++){
             upside = upside.multiply(BigInteger.valueOf(i));
        }
                
        BigInteger downside1 = BigInteger.ONE;
        for(int i = 1 ; i <= balls - share ; i++ ){
             downside1 = downside1.multiply(BigInteger.valueOf(i));
        }

        BigInteger downside2 = BigInteger.ONE;
        for(int i = 1 ; i <= share ; i++ ){
             downside2 = downside2.multiply(BigInteger.valueOf(i));
        }
    
        BigInteger answer = upside.divide(downside1.multiply(downside2));
        
        
        return answer;
    }
}