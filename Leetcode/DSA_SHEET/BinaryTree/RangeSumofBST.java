
// leetcode question :- 938 https://leetcode.com/problems/range-sum-of-bst/
public class RangeSumofBST {
    static int sum = 0 ;
    static int rangeSumBST(Binarytree root, int low, int high){
        if(root == null)
            return 0;
        if(root.key >= low && root.key <= high)
            sum+=root.key;
        return rangeSumBST(root.left,low,high) + rangeSumBST(root.right,low,high);
    }
}
