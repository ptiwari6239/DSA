// leetcode question:- 101 https://leetcode.com/problems/symmetric-tree/
public class SymmetricTree {
        public static void main(String[] args){
                Binarytree root = new Binarytree(1);
                root.left = new Binarytree(2);
                root.left.left = new Binarytree(3);
                root.left.right = new Binarytree(4);


                root.right = new Binarytree(2);
                root.right.right = new Binarytree(3);
                root.right.left = new Binarytree(41);

                System.out.println(isSymmetric(root));
        }
//        static boolean answer(Binarytree root , Binarytree subroot){
//          if(root!= null && subroot != null){
//              boolean a = answer(root.left,subroot.right);
//              boolean b = answer(root.right,subroot.left);
//              if(root.key == subroot.key && a &&b )
//                  return true;
//              else return false;
//          } else if (root == null && subroot == null) {
//              return true;
//          }
//          else return false;
//
//        }
    static boolean answer(Binarytree root,Binarytree subroot){
            if(root == null && subroot == null)
                return true;
            if(root == null || subroot == null)
                return false;
            boolean a = answer(root.left,subroot.right);
            boolean b = answer(root.right,subroot.left);
            if(root.key == subroot.key )
                return true;
            else return false;
    }
        static boolean isSymmetric(Binarytree root){
            if(root == null)
                return true;
            return answer(root.left,root.right);
        }
}
