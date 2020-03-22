/*
// Definition for a Node.
class Node {
    public int val;
    public List<Node> children;

    public Node() {}

    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, List<Node> _children) {
        val = _val;
        children = _children;
    }
};
*/

/**
* 590. N叉树的后序遍历 <p>
*https://leetcode-cn.com/problems/n-ary-tree-postorder-traversal/
*
*/
class Solution {
    public List<Integer> postorder(Node root) {
        List<Integer> postorder = new ArrayList();

        if(null==root){
             return postorder;
        }else if(root.children==null){
            postorder.add(root.val);
            return postorder;
        }else{
            for(Node n: root.children){
                postorder.addAll(postorder(n));
            }
            postorder.add(root.val);
            return postorder;
        }
    }
}