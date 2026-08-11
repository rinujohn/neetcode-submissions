class Solution:
    def buildTree(self, preorder: List[int], inorder: List[int]) -> Optional[TreeNode]:

        inorder_map = {
            value: index
            for index, value in enumerate(inorder)
        }

        def build(preorder_left, preorder_right, inorder_left, inorder_right):

            if preorder_left > preorder_right:
                return None

            root_value = preorder[preorder_left]
            root = TreeNode(root_value)

            mid = inorder_map[root_value]

            left_size = mid - inorder_left

            root.left = build(
                preorder_left + 1,
                preorder_left + left_size,
                inorder_left,
                mid - 1
            )

            root.right = build(
                preorder_left + left_size + 1,
                preorder_right,
                mid + 1,
                inorder_right
            )

            return root

        return build(
            0,
            len(preorder) - 1,
            0,
            len(inorder) - 1
        )