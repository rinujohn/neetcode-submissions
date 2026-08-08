# Definition for a binary tree node.
# class TreeNode:
#     def __init__(self, val=0, left=None, right=None):
#         self.val = val
#         self.left = left
#         self.right = right

class Solution:
    def goodNodes(self, root: TreeNode) -> int:
        if root is None:
            return 0
        def dfs(current, max_v) ->int:
            
            if(current is None):
                return 0
            count = 0
            if max_v<= current.val:
                max_v = current.val
                count +=1
            count+= dfs(current.left, max_v)

            count+= dfs(current.right, max_v)
            return count
        return dfs(root, root.val)
        '''
    pass the max with every dfs

        '''
        