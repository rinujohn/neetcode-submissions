# Definition for a binary tree node.
# class TreeNode:
#     def __init__(self, val=0, left=None, right=None):
#         self.val = val
#         self.left = left
#         self.right = right
# mistake missing recursive return
class Solution:
    def kthSmallest(self, root: Optional[TreeNode], k: int) -> int:
        if(root):
            leftCount = 0
            if(root.left):
                leftCount = self.getNodeCount(root.left)
            if(leftCount+1==k):
                return root.val
            if(leftCount+1<k):
                return self.kthSmallest(root.right, k-leftCount-1)
            else:
                return self.kthSmallest(root.left, k)
        return 0

    

    def getNodeCount(self,root : Optional[TreeNode]) -> int:

        count = 0

        def bfs(root):
            nonlocal count
            queue = deque()
            queue.append(root)
            while(queue):
                node = queue.popleft()
                if(node):
                    count+=1
                    queue.append(node.left)
                    queue.append(node.right)
        bfs(root)
        return count