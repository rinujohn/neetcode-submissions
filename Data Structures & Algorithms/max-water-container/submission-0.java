class Solution {
    public int maxArea(int[] heights) {
        int start = 0;
        int  end = heights.length - 1;
        int max_area = -1;
        while(start< end){
            max_area = Math.max(max_area,(end- start) * Math.min(heights[start],heights[end]));

            if (heights[start]< heights[end]){
                start ++;
            }else{
                end--;
            }
        }
        return max_area;
    }
}
