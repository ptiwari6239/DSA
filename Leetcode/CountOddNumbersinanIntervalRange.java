
//leetcode question :- 1523
public class CountOddNumbersinanIntervalRange {
    public int countOdds(int low, int high) {
        int cal = (high - low) + 1;

        if(low%2==0&&high%2==0)
            return cal/2;
        else if (cal%2!=0)
            return (cal/2)+1;
        else if (cal%2==0)
            return cal/2;

        return 0;

    }
}
