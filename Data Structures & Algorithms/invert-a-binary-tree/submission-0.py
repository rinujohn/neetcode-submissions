# Definition for a binary tree node.
# class TreeNode:
#     def __init__(self, val=0, left=None, right=None):
#         self.val = val
#         self.left = left
#         self.right = right

class Solution:
    def invertTree(self, root: Optional[TreeNode]) -> Optional[TreeNode]:
        newRoot = self.copyTree(root)
        #self.preOrderTraversal(newRoot)
        return newRoot
    
    def copyTree(self, root) :

        if(root is None):
            return
        newNode = TreeNode(root.val)
        #print(root.val)
        newNode.right = self.copyTree(root.left)
        newNode.left = self.copyTree(root.right)
        return newNode

    def preOrderTraversal(self, root) :

        if(root is None):
            return
        
        print(root.val)
        self.preOrderTraversal(root.left)
        self.preOrderTraversal(root.right)
        



        '''
how to copy a tree. 

travese through the tree, each recursive call return a new node

during recursive step assign them to left and right branches,



        '''