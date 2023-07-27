// leetcode question:- 1448    https://leetcode.com/problems/count-good-nodes-in-binary-tree/

// keep moving towards a leaf node that keep doing preorder traversal and
// keep checking if the current node is max node or not if yes than increase the count
public class CountGoodNodesinBinaryTree {
     static int count = 0 ;
     static int answer(Binarytree root){
         if(root != null){
             goodNode(root,root.key);
         }
         return count;
     }

    static void goodNode(Binarytree root,int max){
        if(root != null){
            if(root.key >= max){
                max = root.key;
                count++;
            }
            goodNode(root.left,max);
            goodNode(root.right,max);
        }

    }
}
