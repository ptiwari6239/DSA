
// leetcode question:- 202


public class HappyNumber {
    public boolean isHappy(int n) {
        // if(n==1||n%10==0)
        //    return true;

        int sum = 0 ;
        int last;
        while(true){
            last = n%10;
            sum = sum+(last*last);
            n = n/10;
            if(n==0&&sum==1)
                return true;
            if(n == 0) {
                n = sum;
                sum = 0 ;
                if(n == 85||n==25||n==29||n==89||n==145||n==42||n==20||n==16)
                    return false;}




        }
    }
}
