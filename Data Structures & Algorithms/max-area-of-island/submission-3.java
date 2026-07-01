class Solution {
    public int maxAreaOfIsland(int[][] grid) {
        Queue<int[]> queue = new LinkedList();
        int maxArea = 0;
        int areaCount = 0;
        int[][] deltaList = {{-1,0},{1,0},{0,-1},{0,1}}; 
        for (int row=0; row<grid.length;row++){
            for (int col=0; col<grid[0].length;col++){
                if(grid[row][col] == 1){
                    grid[row][col] = 0;
                    areaCount = 1;
                    System.out.println("island");
                    queue.add(new int[]{row, col});
                }
                while(!queue.isEmpty()){
                   int[] node = queue.remove();
                    int[] neighbour = new int[2];
                    for (int[] delta : deltaList){
                        neighbour[0] =  node[0]+delta[0];
                        neighbour[1] =  node[1]+delta[1];
                    
                    if(neighbour[0] >=0 &&  neighbour[0] < grid.length && 
                    neighbour[1] >=0 &&  neighbour[1] < grid[0].length){

                   
                    if (grid[neighbour[0]][neighbour[1]] == 1){
                        areaCount = areaCount+1;
                        System.out.println(areaCount);
                        grid[neighbour[0]][neighbour[1]] = 0;
                         // mistake: new array need to be added other wise same instance is getting modified.
                            queue.add(new int[]{neighbour[0],neighbour[1]});
                    }
                     }
                     }
                }
                if (areaCount> maxArea){
                    maxArea = areaCount;
                }
        }
        }
        return maxArea;
    }
}


/*
sinking bfs
island_count = 0
max_count = 0
queue
for row size of grid:
    for column size of grid:
        if gird[row][column] == 1
            island_count +=1
            area_count = 1
            grid[row][column] = 0
            queue.push([row,column])
        while(queue is not empty):
            node = queue.pop()
            for delta in delta_list:
                neighbour = node+delta
                if grid[neighbour] == 1:
                    grid[neighbour] = 0
                    queue.push(neighbour)
                    area_count = +1 
                    if area_count> max_count:
                        max_count = area_count
                    
return max_count
*/      
