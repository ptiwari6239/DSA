import java.nio.Buffer;

// leetcode question:- 226 https://leetcode.com/problems/invert-binary-tree/
public class InvertBinaryTree {
    public static void main(String[] args){
            Binarytree root = new Binarytree(4);
            root.left = new Binarytree(2);
//            root.left.left = new
            Binarytree ans = answer(root);
        System.out.println(ans.key);
        System.out.println(ans.left.key);
        System.out.println(ans.right.key);
    }
    static Binarytree answer(Binarytree root){
        if(root != null){
            Binarytree sub = new Binarytree(root.key);
            return invert(root,sub);
        }
        else {
            return null;
        }
    }
    static Binarytree  invert(Binarytree root,Binarytree sub){
        if(root.left != null){
             sub.right = new Binarytree(root.left.key);
//             root = root.left;
             invert(root.left,sub.right);
        }
        if(root.right != null){
            sub.left = new Binarytree(root.right.key);
            invert(root.right,sub.left);
        }
         return sub;

//        return root;
    }
}

