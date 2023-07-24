
// leetcode question : - 1572 https://leetcode.com/problems/matrix-diagonal-sum/submissions/934365004/
public class MatrixDiagonalSum {
    public static void main(String[] args) {
        int[][] arr = {{1,2,3},{4,5,6},{7,8,9}};
        System.out.println(Dsum(arr));

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
    // different logic 
    static int Dsum(int[][] mat){
        int sum = 0 ;
        int j = 0 ;
        int ptr = mat.length - 1  ;
        for(int i = 0  ; i < mat.length ; i++){
            if(j==ptr){
                sum+=mat[i][j];
                ptr--;
                j++;
            }
            else {
                sum+=mat[i][j] + mat[i][ptr];
                ptr--;
                j++;
            }
        }
        return sum ;
    }
}
