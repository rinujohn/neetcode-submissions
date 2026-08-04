# Definition for a binary tree node.
# class TreeNode:
#     def __init__(self, val=0, left=None, right=None):
#         self.val = val
#         self.left = left
#         self.right = right

class Solution:   
    def isSubtree(self, root: Optional[TreeNode], subRoot: Optional[TreeNode]) -> bool:
        if(subRoot is None):
            return True
        if(root is None):
            return False
        
        if self.isSameTree(root, subRoot):
            return True
        return (self.isSubtree(root.left, subRoot) or self.isSubtree(root.right, subRoot))



    def isSameTree(self, rootOne, rootTwo) -> bool: 
        # a good use of 2 if which handles 3 cases

        if rootOne is None and rootTwo is None:
            return True
        if(rootOne is None or rootTwo is None):
            return False
        if(rootOne.val != rootTwo.val):
            return False
        
        return self.isSameTree(rootOne.left,rootTwo.left) and self.isSameTree(rootOne.right,rootTwo.right)

        # sameLeftTree = False
        # if(rootOne.left is not None and rootTwo.left is not None){
        #     leftFlag = isSameTree(rootOne.left,rootTwo.left)  
        # }elif (rootOne.left is None and rootTwo.left is None){
        #     leftFlag = True
        # }else{
        #     leftFlag = False
        # }
        # if(leftFlag and rootOne.val == rootTwo.val){

        #     sameLeftTree = True
        # }
        # sameFlag = False
        # if(sameLeftTree){
        #     if(rootOne.right is not None and rootTwo.right is not None){
        #     sameFlag = isSameTree(rootOne.right,rootTwo.right)  
        # }elif (rootOne.right is None and rootTwo.right is None){
        #     sameFlag = True
        # }else{
        #     sameFlag = False
        # }
        # }
        # return sameFlag


    
        '''
        check if parentNode == subRootNode:
        then traverse both
        If subroot tree exhausted and all elements are equal return true
        if any node become unequal reset 
        start from next node in parent tree


        '''