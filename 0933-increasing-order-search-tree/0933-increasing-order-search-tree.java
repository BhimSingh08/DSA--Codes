/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public TreeNode increasingBST(TreeNode root) {

        ArrayList<Integer> inOrder = new ArrayList<>();
        
        findInOrder(root,inOrder);

        if(inOrder.size()==0) return null;

        TreeNode newRoot = new TreeNode(inOrder.get(0));
        TreeNode temp1 = newRoot;
        TreeNode temp2;
        for(int i = 1; i<inOrder.size(); i++){
             temp2 = new TreeNode(inOrder.get(i));
             temp1.right = temp2;
             temp1 = temp2;
        }

        return newRoot;



    }

    public void findInOrder(TreeNode root, ArrayList<Integer> temp){

        if(root == null) return;
    
        findInOrder(root.left,temp);
        temp.add(root.val);
        findInOrder(root.right, temp);



    }



}