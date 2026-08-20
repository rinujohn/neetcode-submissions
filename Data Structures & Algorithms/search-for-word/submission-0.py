class Solution:
    def exist(self, board: List[List[str]], word: str) -> bool:
        '''
        board    2d grid of characters
        word string
        true if grid contains the word

        for each position starting position.
        2 choice

        4 choice for neighbour if we choose a char
            exlpore only the valid neighbour


        breaking condition is state size become len(word)

        '''
        def dfs(r,c,i):
            #breaking condition:

            if(i==len(word)):
                return True

            # invalid position
            if r<0 or r>=len(board) or c<0 or c>=len(board[0]):
                return False 
            
            if board[r][c] != word[i]:
                return False
            
            temp = board[r][c]
            board[r][c] = '#'

            found = dfs(r+1,c, i+1) or dfs(r-1,c,i+1) or dfs(r,c+1,i+1) or dfs(r,c-1,i+1)
            board[r][c] = temp

            return found
        for r in range(len(board)):
            for c in range(len(board[0])):
               if dfs(r,c,0):
                return True
        return False