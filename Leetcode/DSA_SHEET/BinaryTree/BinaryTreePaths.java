import java.util.ArrayList;
import java.util.List;

// leetcode question:- 257  https://leetcode.com/problems/binary-tree-paths/
public class BinaryTreePaths {

    static List<String> binaryTreePaths(Binarytree root){
            List<String> list = new ArrayList<>();
            binaryTreePath(root,"",list);
            return list;
        }

    static List<String> binaryTreePath(Binarytree node, String path , List<String> list){
        if(node == null)
            return list;
        if(node.left ==  null && node.right == null)
        {
            list.add(path+node.key);
            return list;
        }
        binaryTreePath(node.left,(path+node.key+"->"),list);
        binaryTreePath(node.right,(path+node.key+"->"),list);
        return list;
    }

}
