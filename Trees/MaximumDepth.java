class Solution {
    int  maximum(TreeNode  root){
        if(root==null){
            return 0;
        }
        int left=maximum(root.left);
        int right=maximum(root.right);
        return 1+ Math.max(left,right);

    }
    public int maxDepth(TreeNode root) {
        return maximum(root);
    }
}
