
// leetcode question :- 832 https://leetcode.com/problems/flipping-an-image/

public class FlippinganImage {
    public static void main(String[] args){
        int[][] arra = {{1,1,0},{1,0,1},{0,0,0}};
        print(flipArray(arra));
    }
    static int[][] flipArray(int[][] image){
        int n = image.length;
        for( int i = 0 ; i < n; i++){
            int ptr1 = 0;
            int ptr2 = image[i].length -1;
           while(ptr1<ptr2){
               int temp = image[i][ptr1];
               image[i][ptr1] = image[i][ptr2];
               image[i][ptr2] = temp;
               ptr1++;
               ptr2--;
           }
        }
        for(int i = 0 ; i < image.length; i++){
            for(int j = 0 ; j < image[i].length; j++){
                if(image[i][j]==0)
                    image[i][j] = 1;
                else
                    image[i][j] = 0 ;


            }
        }

        return image;
    }
    static void  print(int[][] arry){
        for(int i = 0 ; i < arry.length; i++){
            for(int j = 0 ; j < arry[i].length; j++){
                System.out.print(arry[i][j] + " ");
            }
            System.out.println();
        }
    }
}
