
// leetcode question:- 110 https://leetcode.com/problems/balanced-binary-tree/
public class BalancedBinaryTree {
    public boolean isBalanced(Binarytree root){
        if(root == null)
            return true;
        int left = height(root.left);
        int right = height(root.right);
        if (Math.abs(left - right) > 1)
            return false;
        boolean lf = isBalanced(root.left);
        boolean rh = isBalanced(root.right);
        if(!lf || !rh)
            return false;
        return true;
    }
    public int height(Binarytree root){
        if(root == null)
            return 0;
        return Math.max(height(root.left),height(root.right)) + 1;
    }
}