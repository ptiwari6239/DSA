
// leetcode question : - 1572 https://leetcode.com/problems/matrix-diagonal-sum/submissions/934365004/
public class MatrixDiagonalSum {
    public static void main(String[] args) {
        int[][] arr = {{7,3,1,9},{3,4,6,9,},{6,9,6,6},{9,5,8,5}};
        System.out.println(digonalSum(arr));

    }
    static int digonalSum(int[][] mat){
        int sum = 0 ;
        if(mat.length==1)
            return mat[0][0];
        if(mat.length%2==0){
            for(int i = 0 ; i < mat.length; i++){
                for(int j = 0 ; j < mat[i].length; j++){
                    if(i==j){
                        sum+=mat[i][j];
                        break;
                    }
                }
            }
            int j = 0 ;
            for(int i = 0; i < mat.length; i++){

                        sum+=mat[i][mat.length-1-j];
                        j++;
            }
            return sum;
        }
        int index = mat.length/2;
        for(int i = 0 ; i < mat.length; i++){
            for(int j = 0 ; j < mat[i].length; j++){
                if(i==j)
                    sum+=mat[i][j];
            }
        }
        int j = 0;
        for(int i = 0; i < mat.length; i++){
            if(i==index&&j==index)
                j++;
            else{
                sum+=mat[i][mat.length-1-j];
                j++;
            }
        }
        return sum ;
    }
}
