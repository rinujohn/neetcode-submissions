# Definition for a binary tree node.
# class TreeNode:
#     def __init__(self, val=0, left=None, right=None):
#         self.val = val
#         self.left = left
#         self.right = right

class Solution:
    def isValidBST(self, root: Optional[TreeNode]) -> bool:
        minl =-1000000000
        maxl = 1000000000
        

        def dfs(node, minl, maxl):
            if node is None:
                return True
            if(node.val>minl and node.val<maxl):

                return dfs(node.left,minl, node.val) and dfs(node.right, node.val, maxl)
            else:
                return False
        return dfs(root,minl,maxl)
            
        # if(root is None):
        #     return True
        # if(root.left is None and root.right is None):
        #     return True
        # validLeft = False
        # if root.left:
        #     if root.val> root.left.val:
        #         validLeft = self.isValidBST(root.left)

        # validRight = False
        # if(validLeft and root.right):
        #     if root.val< root.right.val:
        #         validRight = self.isValidBST(root.left)
        # return validLeft and validRight
        '''
        run dfs,
        check if root is element greater than left
        check if right is greater than right
        recurse the process on left and right

        '''
        