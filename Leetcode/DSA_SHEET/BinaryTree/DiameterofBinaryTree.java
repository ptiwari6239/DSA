
// leetcode question:- 543
public class DiameterofBinaryTree {
    public static void main(String[] ars){
        Binarytree root = new Binarytree(1);
        root.left = new Binarytree(2);
        root.left.left = new Binarytree(4);
        root.left.right = new Binarytree(5);

        root.right = new Binarytree(3);
        System.out.println(diameterOfBinaryTree(root));
    }
    static int diameterOfBinaryTree(Binarytree root){
        if(root == null)
            return 0;
        int lh = height(root.left);
        int rh = height(root.right);
        int ldia = diameterOfBinaryTree(root.left);
        int rdia = diameterOfBinaryTree(root.right);
        if(lh == 0 && rh == 0)
            return 0;
        return Math.max(lh+rh,Math.max(ldia,rdia));

    }
    static int height(Binarytree root){
        if(root == null)
            return 0;
        return Math.max(height(root.left),height(root.right)) +1;
    }
}
