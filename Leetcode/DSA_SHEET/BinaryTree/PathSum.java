
// leetcode question:-112    https://leetcode.com/problems/path-sum/
public class PathSum {
    static boolean hasPathSum(Binarytree root, int targetSum){
      if(root == null)
          return false;
      if(root.key == targetSum && root.left !=null && root.right !=null)
          return true;
      return hasPathSum(root.right,targetSum-root.key ) || hasPathSum(root.left,targetSum-root.key);
    }

}

