# Definition for a binary tree node.
# class TreeNode:
#     def __init__(self, val=0, left=None, right=None):
#         self.val = val
#         self.left = left
#         self.right = right

class Solution:
    max_dia = 0
    def diameterOfBinaryTree(self, root: Optional[TreeNode]) -> int:
        
        if root is None:
            return 0
        self.dfs(root)
        return self.max_dia

    def dfs(self,node):
        if node is None:
            return 0
        left_height = self.dfs(node.left)
        right_height = self.dfs(node.right)
        diameter = left_height+right_height
        self.max_dia = max(self.max_dia, diameter)
        return 1 + max(left_height, right_height)
        '''
dfs(node):

    visit root node
    left_height = dfs(left)
    right_hright = dfs(right)
    return 1+ max{left_height, right_height}
        '''