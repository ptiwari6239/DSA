
// leetcode question:- 104 https://leetcode.com/problems/maximum-depth-of-binary-tree/
public class MaximumDepthofBinaryTree {
    public static void main(String[] args){
        Binarytree root = new Binarytree(10);
        root.left = new Binarytree(20);
        root.left.right = new Binarytree(30);
    }
    static int maxDepth(Binarytree root){
        if(root == null)
            return 0;
        return Math.max(maxDepth(root.left),maxDepth(root.right)) +1;
    }

}
