class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int T = 0;
        int B = matrix.length-1;
        int col = matrix[0].length-1;
        int mid ;
        while(T<=B){
            mid = (T+B)/2;
            if(target >= matrix[mid][0] && target<= matrix[mid][col]){
                return binarySearch(matrix[mid],target );
            }else if(target < matrix[mid][0]){
                B = mid -1;
            }else{
                T = mid +1;
            }
        }
        return false;
    }
    public boolean binarySearch(int[] array, int target){
        int L = 0;
        int R = array.length-1;

        int mid;

        while(L<=R){
            mid = (L+R)/2;
            if(target == array[mid]){
                return true;
            }else if (target < array[mid]){
                 R = mid -1;
            }else{
                L = mid +1;
            }
        }
        return false;

    }
}
/*

find the middle column, 
check if the target is is part of the same row. 
then perform 1D binary search on the row
other wise reduce the search space. L to mid-1 
or Mid+ 1 to R


*/