
// leetcode question :-1281
public class SubtracttheProductandSumofDigitsofanInteger {
    public int subtractProductAndSum(int n) {
        int sum = 0 ,pro = 1;
        while(n/10 != 0){
            sum = sum+(n%10);
            pro = pro*(n%10);
            n = n/10;
        }
        sum = sum+(n%10);
        pro = pro*(n%10);
        return pro-sum;
    }}
