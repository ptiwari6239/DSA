// leetcode question:-  108   https://leetcode.com/problems/convert-sorted-array-to-binary-search-tree/

// whenever question says sorted array then solution must be somewhere related to binary search
// the root of the tree is mid of the array
// this is true for any subtree
public class ConvertSortedArraytoBinarySearchTree {

    static Binarytree sortedArrayToBST(int[] nums){
        if(nums.length <=0 )
            return null;
        return putInBst(nums,0,nums.length-1);
    }
    static Binarytree putInBst(int[] nums,int low , int high){
        if(low > high)
            return null;
        int mid = low + (high-low) / 2;
        Binarytree node = new Binarytree(nums[mid]);
        node.left = putInBst(nums,low,mid-1);
        node.right = putInBst(nums,mid+1,high);
        return node;
    }




}
