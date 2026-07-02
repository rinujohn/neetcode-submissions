class Solution {
    public int trap(int[] height) {
        int[] maxLeft = new int[height.length];
        int[] maxRight = new int[height.length];
        int maxL = 0;
        int maxR = 0;
        for(int i=0;i < height.length;i++){
            maxLeft[i] = maxL;
            if(height[i] > maxL){
                maxL = height[i];
            }
            maxRight[height.length- 1 - i] = maxR;
            if(height[height.length -1 - i] > maxR){
                maxR = height[height.length -1 - i];
            }
        }  
        int[] T = new int[height.length]; 
        T[0]= Math.max(0,Math.min(maxLeft[0],maxRight[0]) - height[0]);
        for(int i=1;i < height.length;i++){
            T[i] = T[i-1]+Math.max(0,Math.min(maxLeft[i],maxRight[i]) - height[i]);
        }
        // System.out.println(Arrays.toString(maxLeft));  
        // System.out.println(Arrays.toString(maxRight));  
        return T[height.length-1];
    }
}
/*
precompute the left max from i  and right max from i. 
T[i] maximum water that can be trapped within 1, ..i bars which includes i.
T[i] = min(max_left[i], max_right[i] ) - height[i]


*/