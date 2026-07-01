class Solution {
    public int numIslands(char[][] grid) {
        int[][] delta_list = {{-1,0},{1,0},{0,1},{0,-1}};
        Queue<int []>  queue = new LinkedList();
        int count = 0;
        for (int i=0; i< grid.length; i++){
            for (int j=0; j< grid[0].length; j++){
                if (grid[i][j] == '1'){
                    grid[i][j] = '0';
                    int[] indices = {i,j};
                    queue.add(indices);
                    count++;
                }

            while(!queue.isEmpty()){
                int[] node = queue.remove();
                for (int[] delta:delta_list){
                    int[] neighbour = {node[0]+delta[0], node[1]+delta[1]};
                    //System.out.println(Arrays.toString(neighbour));
                    if (neighbour[0] >= 0 && neighbour[0] < grid.length && neighbour[1] >= 0 && neighbour[1] < grid[0].length) {
                        if (grid[neighbour[0]][neighbour[1]] == '1'){
                            grid[neighbour[0]][neighbour[1]] = '0';
                            queue.add(neighbour);
                        }
                    }
                }
            }
        }
        }

        return count;
        
    }
}

/*
initialize queue
for i in row length:
    for j in column length:
        if the element is 1:
            grid[i][j] = 0
            add (i,j) to the queue
            count ++
        
        while queue is not empty:
            node = pop queue
            for  delta in delta_list:
                neighbour = node + delta
                if neighbour is valid and grid[neighbour] == 1:
                    grid[neighbour] = 0
                    add(neighbour) to queue


*/