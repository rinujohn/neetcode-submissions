# Definition for a binary tree node.
# class TreeNode:
#     def __init__(self, val=0, left=None, right=None):
#         self.val = val
#         self.left = left
#         self.right = right

class Solution:
    def maxDepth(self, root: Optional[TreeNode]) -> int:
        if root is None:
            return 0
        node_queue = deque()
        node_queue.append(root)
        depth = 0

        while node_queue:
            size = len(node_queue)

            for i in range(0,size):
                node = node_queue.popleft()

                if node.left is not None:
                    node_queue.append(node.left)
                if node.right is not None:
                    node_queue.append(node.right)
            depth = depth + 1

        return depth
        '''
        perfrom a depth first search from the root node
        and return the max depth

        depth = 0
        
        queue.push(root)
        while(queue is not empty):
            
            evaluate all the elements in the queue. and push their childs

            increment the depth
        
        return depth
        
        '''
        