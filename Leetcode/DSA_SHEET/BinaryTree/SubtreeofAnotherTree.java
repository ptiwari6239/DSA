// leetcode question :- 527  https://leetcode.com/problems/subtree-of-another-tree/
public class SubtreeofAnotherTree {
    public static void main(String[] args) {
        Binarytree root = new Binarytree(1);
        root.right = new Binarytree(1);
        root.right.right = new Binarytree(1);
        root.right.right.right = new Binarytree(2);
//        root.left = new Binarytree(4);
//        root.left.right = new Binarytree( 2);
//        root.left.right.left = new Binarytree(0);
//        root.left.left = new Binarytree(1);
//        root.right = new Binarytree(1);
//        root.right.right = new Binarytree(1);
//        root.right.right.right = new Binarytree(1);
//        root.right.right.right.right = new Binarytree(1);
//        root.right.right.right.right.right = new Binarytree(1);
//        root.right.right.right.right.right.right = new Binarytree(1);
//        root.right.right.right.right.right.right.right = new Binarytree(1);
//        root.right.right.right.right.right.right.right.right = new Binarytree(1);
//        root.right.right.right.right.right.right.right.right.right = new Binarytree(1);
//        root.right.right.right.right.right.right.right.right.right.right = new Binarytree(1);
//        root.right.right.right.right.right.right.right.right.right.right.right = new Binarytree(2);


        Binarytree subtree = new Binarytree(1);
        subtree.right = new Binarytree(2);
//        subtree.right.right = new Binarytree()
//        subtree.left = new Binarytree(1);
//        subtree.right = new Binarytree(1);
//        subtree.right.right = new Binarytree(1);
//        subtree.right.right.right = new Binarytree(1);
//        subtree.right.right.right.right = new Binarytree(1);
//        subtree.right.right.right.right.right = new Binarytree(1);
//        subtree.right.right.right.right.right.right = new Binarytree(2);


        System.out.println(answer(root,subtree));
    }
    static boolean answer(Binarytree root,Binarytree subroot){
        if(root == null)
            return false;
        if(sameornot(root,subroot))
            return true;
        return  answer(root.left,subroot) || answer(root.right,subroot);
    }
    static boolean sameornot(Binarytree root, Binarytree subtree){
        if(root == null && subtree == null)
            return true;
        if(root == null && subtree != null)
            return false;
        if(root != null && subtree == null)
            return false;
        if(root.key != subtree.key)
             return false;
        return sameornot(root.left,subtree.left) && sameornot(root.right,subtree.right);
    }

}
