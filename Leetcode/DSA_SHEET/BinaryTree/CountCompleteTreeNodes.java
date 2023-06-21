
// leetcode question:- 222 https://leetcode.com/problems/count-complete-tree-nodes/

public class CountCompleteTreeNodes {
    public static void main(String[] args){
        Binarytree root = new Binarytree(10);
//        root.left = new Binarytree(80);
//        root.left.left = new Binarytree(30);
//        root.left.right = new Binarytree(40);
//        root.right = new Binarytree(70);
        System.out.println(countNodes(root));
    }
    static int countNodes(Binarytree root){
        if(root == null)
            return 0;
        return countNodes(root.left)+countNodes(root.right) +1;
    }


}
