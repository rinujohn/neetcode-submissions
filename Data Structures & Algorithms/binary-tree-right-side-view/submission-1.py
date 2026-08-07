# Definition for a binary tree node.
# class TreeNode:
#     def __init__(self, val=0, left=None, right=None):
#         self.val = val
#         self.left = left
#         self.right = right

class Solution:
    def rightSideView(self, root: Optional[TreeNode]) -> List[int]:
        result = []
        if root:
            self.bfs(root, result)
        return result;



    def bfs(self,root, result):

        queue = deque()
        queue.append(root)
        while(queue):
            level = list(queue)
            for i in range(len(level)):
                current = queue.popleft() 
                if current.left:
                    queue.append(current.left) 
                if current.right:
                    queue.append(current.right)  
                if i== len(level)-1:
                    result.append(current.val)
        


        '''
    during every level print the right most element

    perform a level order traversal and add the 
    last element to the result





        '''