class Solution 
{
    List<Integer> res = new LinkedList<>();
    public List<Integer> inorderTraversal(TreeNode root) 
    {
        helper(root);
        return res;
    }
    
    public void helper(TreeNode root)
    {
        if(root == null) return;
        
        helper(root.left);
        res.add(root.val);
        helper(root.right);
    }
}
