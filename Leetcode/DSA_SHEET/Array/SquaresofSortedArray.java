
// leetcode question :- 977 https://leetcode.com/problems/squares-of-a-sorted-array/

//  the logic is simple , the two pointer approch , first pointer points to the 0th index , and second pointer points to the last element
// compare the value(absolute value)  of the both index , if first pointer is more than swap , and if not donot swap


import java.sql.SQLOutput;

public class SquaresofSortedArray {
            public static void main(String[]args){
                int[] arr = {-4,-1,0,3,10};
                int[] ans = SortedArray(arr);
                for(int i = 0 ; i < ans.length ; i++){
                    System.out.println(ans[i]);
                }
            }
            static int[] SortedArray(int[] A){
                int n = A.length;
                int[] result = new int[n];
                int i = 0, j = n - 1;
                for (int p = n - 1; p >= 0; p--) {
                    if (Math.abs(A[i]) > Math.abs(A[j])) {
                        result[p] = A[i] * A[i];
                        i++;
                    } else {
                        result[p] = A[j] * A[j];
                        j--;
                    }
                }
                return result;
//
            }
}
