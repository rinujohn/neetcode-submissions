# Definition for a binary tree node.
# class TreeNode:
#     def __init__(self, val=0, left=None, right=None):
#         self.val = val
#         self.left = left
#         self.right = right

class Solution:
    def isValidBST(self, root: Optional[TreeNode]) -> bool:
        

        max =  1000000001
        min = -1000000001

        def validateNode(node, max,min):
            if (not node):
                return True
            return min< node.val < max and validateNode(node.left,node.val,min) and validateNode(node.right,max,node.val)
        return validateNode(root,max,min)
