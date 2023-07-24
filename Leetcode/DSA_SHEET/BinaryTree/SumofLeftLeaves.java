import javax.swing.plaf.basic.BasicButtonUI;

// leetcode question :- 404   https://leetcode.com/problems/sum-of-left-leaves/

// main problem while solving this question is to identify  only left node at any level
// so to do so , we will have two varibles maxlevel-- which will tell previes tree level
// and other varible is level which will tell the current level of the tree ,
// so at any level in the tree we need to print(access) only one node (which is left in this case)
// first we will if the maxlevel is less than level or not
// the maxlevel is less then level then it means that this node is first node to be access in this level of the tree
// and after accessing this we increase the maxlevel to when we reach the other node at same level
// we will know that this is another node we are acessing at same level of the tree

public class SumofLeftLeaves {
    public static void main(String[] args){
        Binarytree root = new Binarytree(3);
        root.right = new Binarytree( 20);
        root.right.right = new Binarytree(7);
        root.right.left = new Binarytree(15);

        root.left = new Binarytree(9);
        sumOfLeftLeaves(root,1);
        System.out.println(sum);
    }
    static int maxlevel = 0;
    static int sum = 0 ;
    static void sumOfLeftLeaves(Binarytree root,int level){
        if(root == null)
            return ;
        if(maxlevel < level){
            if(root.left == null && root.right == null)
                sum += root.key;
            maxlevel = level;
        }
        sumOfLeftLeaves(root.left,level+1);
        sumOfLeftLeaves(root.right,level+1);

    }


}
