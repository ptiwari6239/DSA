//
////leetcode question:- 374
//public class GuessNumberHigherorLower {
//    public int guessNumber(int n) {
//        int start = 1;
//        int end = n ;
//        int mid=0;
//        while (end >=start){
//            mid = start + (end - start)/2;
//            if(guess(mid)==0){
//                return mid;
//            }
//            else if (guess(mid)<0){
//                end = mid -1;
//            }
//            else{
//                start = mid + 1;
//            }
//
//
//
//        }
//
//
//        return mid;
//
//    }
//}
