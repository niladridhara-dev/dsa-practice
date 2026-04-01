 // LeetCode 236 - Lowest Common Ancestor

// Approach:
// 1. If root is null or matches p/q → return root
// 2. Recurse left and right
// 3. If both sides return non-null → root is LCA
class Solution {
    TreeNode LCA(TreeNode root,TreeNode p, TreeNode q){
        if(root==null||root==p|| root==q){
            return root;
        }
        TreeNode lefth=LCA(root.left,p,q);
        TreeNode righth=LCA(root.right,p,q);
        if(lefth!=null && righth!=null){
            return root;
        }
        return lefth!=null?lefth:righth;
    }
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        return LCA(root,p,q);
    }
}
