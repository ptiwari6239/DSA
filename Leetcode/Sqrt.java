
// leetcode question :- 69
public class Sqrt {
    public int mySqrt(int x) {
        int start = 1;
        int end = x;
        long mid =0;
        while(end>=start){
            mid = start + (end - start)/2;
            if(mid*mid==x || (mid+1)*(mid+1)>x &&  mid*mid<x){
                break;
            } else if (mid*mid > x) {
                end = (int)mid - 1;

            } else if (mid*mid < x) {
                start = (int)mid + 1;


            }

        }
        return (int)mid;

    }
}
