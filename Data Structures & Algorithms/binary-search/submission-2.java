class Solution {
    public int search(int[] nums, int target) {
        int L = 0;
        int R = nums.length-1;
        int mid = (L+R)/2;
        System.out.println(mid);
        while(L<=R){
            mid = (L+R)/2;
            System.out.println("------");
            System.out.println(L);
            System.out.println(mid);
            System.out.println(R);
            System.out.println("------");
            if (nums[mid] == target){
                return mid;
            }else if(  target < nums[mid]){
                R = mid - 1;
            }else{
                L = mid + 1;
            }
        }
        return -1;
    }
}
/*

L = 0, R = n-1
while(L<R):
    mid = (L + R)/2
    if target = nums[mid]:
        return mid
    else if target <nums[mid]:
        R = mid-1
    else:
        L = mid+1
*/