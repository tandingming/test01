package com.mytest.Tree;

import java.util.ArrayList;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 *
 * @author : TanDingMing
 * @version :
 * @Project : test
 * @Package : com.mytest.Traversal
 * @ClassName : .java
 * @createTime : 2022/5/12 21:57
 * @Email :
 * @Description :
 */
public class Traversal {
    public List<Integer> perTraversal(TreeNode node){
        List<Integer> re = new ArrayList<Integer>();
        per(node,re);
        return re;
    }

    private void per(TreeNode node, List<Integer> re) {
        if(node == null){
            return;
        }
        re.add(node.val);
        per(node.left,re);
        per(node.right,re);
    }

}
class TreeNode{
    int val;
    TreeNode left;
    TreeNode right;

    public TreeNode(int val) {
        this.val = val;
    }

    public TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}