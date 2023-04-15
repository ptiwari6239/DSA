//
//// leetcode question :- 867 https://leetcode.com/problems/transpose-matrix/
//// logic :- every diagonal element is not changing even after tranpsosing the matrix , so just swap the array[i][j]
//// and array[j][i] where j = i+1
//public class TransposeMatrix {
//    public static void main(String[] args){
//        int arr[][] = {{1,2,3},{4,5,6}};
////        System.out.println(arr.length);
////        System.out.println(arr[0].length);
//        print(transposes(arr));
//    }
//    static int[][] transposes(int matrix[][]){
//        int n = matrix.length;
//        for(int i = 0 ; i < n; i++){
//            for(int j = i+1; j < n ; j++){
//                int temp = matrix[i][j];
//                matrix[i][j] = matrix[j][i];
//                matrix[j][i] = temp;
//            }
//        }
//        return matrix;
//
//    }
//    static void  print(int[][] arry){
//        for(int i = 0 ; i < arry.length; i++){
//            for(int j = 0 ; j < arry[i].length; j++){
//                System.out.print(arry[i][j] + " ");
//            }
//            System.out.println();
//        }
//    }
//
//}
