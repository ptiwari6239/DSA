// leetcode question :- 657
public class RobotReturntoOrigin {
    public boolean judgeCircle(String moves) {
        int []corrdinates = {0,0,0,0};
        for(int i = 0 ; i < moves.length()  ; i++){
            if(moves.charAt(i)=='R')
                corrdinates[0] = corrdinates[0]+1;
            if(moves.charAt(i)=='L')
                corrdinates[1] = corrdinates[1]+1;
            if(moves.charAt(i)=='U')
                corrdinates[2] = corrdinates[2]+1;
            if(moves.charAt(i)=='D')
                corrdinates[3] = corrdinates[3]+1;
        }
        int xAix = corrdinates[0]-corrdinates[1];
        int yAxix  = corrdinates[2] - corrdinates[3];
        if(xAix == 0 && yAxix == 0)
            return true;
        return false;
    }
}
