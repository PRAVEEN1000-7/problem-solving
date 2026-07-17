import java.lang.Math;

class Solution {
    public long sumAndMultiply(int n) {
        
        long x = 0;
        long  sum=0;
        long place = 1;
        int temp = Math.abs(n);

        while(temp>0){
            int digit = temp % 10;
            if(digit!=0){
                sum+=digit;
                x = (digit*place) + x;
                place*=10;
            }
            temp/=10;
        }

        return x*sum;

    }
}