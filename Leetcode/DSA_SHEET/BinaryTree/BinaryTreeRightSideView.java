import java.util.ArrayList;
import java.util.List;

// leetcode question:- 199  https://leetcode.com/problems/binary-tree-right-side-view/
public class BinaryTreeRightSideView {
    public static void main(String[] args){
        Binarytree root = new Binarytree(10);
        root.left = new Binarytree(20);
        root.right = new Binarytree(30);
        root.right.left = new Binarytree(40);
        root.right.right = new Binarytree(50);
        leftside(root);
    }
    static int maxlevel = 0 ;
    static List<Integer> ar = new ArrayList<>();
    static List<Integer> leftside(Binarytree root){
               return printleft(root,1);
    }
    static List<Integer> printleft(Binarytree root , int level){
            if(root == null)
                return ar;
            if(maxlevel < level){
                maxlevel = level;
                ar.add(root.key);
            }
            printleft(root.right,level+1);
            printleft(root.left,level+1);

            return ar;
    }
}
