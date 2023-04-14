
// leetcode question :- 50
// https://www.youtube.com/watch?v=CYCw1t7ryh0 watch this to understand it
public class MYPOW {
    public static void main(String[] args){
        System.out.println(power(2,-2));
    }
    static double power(double x , long n){
        if(n==0)
            return 1;
        if(n<0)
            return power(1/x,-n);
        return n%2==0?power(x*x,n/2) : x*power(x*x,n/2);
    }
}
