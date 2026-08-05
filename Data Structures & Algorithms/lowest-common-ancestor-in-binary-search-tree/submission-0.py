# Definition for a binary tree node.
# class TreeNode:
#     def __init__(self, val=0, left=None, right=None):
#         self.val = val
#         self.left = left
#         self.right = right

class Solution:
    def lowestCommonAncestor(self, root: TreeNode, p: TreeNode, q: TreeNode) -> TreeNode:
        
        if(p.val<root.val and q.val<root.val):
            return self.lowestCommonAncestor(root.left,p,q)
        elif(p.val>root.val and q.val>root.val):
            return self.lowestCommonAncestor(root.right,p,q)
        else:
            return root


        '''
input: binary search tree: 
values are unique
p, q: two nodes from tree
an node can be it's own ancestor
find lowest common ancestor


left is alway less than root and right branch

take the first = min(p,q)
    search in the right branch for second, 
    if found, return first as ancestor
    move to parent of first and check if its equal to second

    or explore the right half for second node

App2: wrong
    create a map for different level, after BFS

App2 : 
perform post order dfs from the min node
    if we find second node, return first as answer
    otherwise:
    repeat the same from next node, if we find the first
    return second node as answer

    track the ancestors

    parent [left: root, right:root]

    start from the p and move till the root
    start from q and move till root
    take the smallest length path
     start from the q if any node part of q's path


App3:
invariant: BST property, values in left node are less than root and right side nodes

at a given point we have 3 inputs , p, q and current node.


if p and  q < current:
    search on left side
if p and q> current:
     search on right side

else they are splited or one is the root node:
    return the root node


        '''