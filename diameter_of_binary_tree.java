class Solution {
    int ans = 0;
    public int diameterOfBinaryTree(TreeNode root) {
        solve(root);
        
        return ans==0?-1:ans-1;
    }
    
    int solve(TreeNode root)
    {
        if(root==null)
        {
            return 0;
        }
        int l = solve(root.left);
        int r = solve(root.right);
        ans = Math.max(ans,(1+l+r));
        return Math.max(l,r) + 1;
    }
}
