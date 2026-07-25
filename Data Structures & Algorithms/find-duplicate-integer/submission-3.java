class Solution {
    public int findDuplicate(int[] nums) {
        int slow = nums[0];
        int fast = nums[nums[0]];
        while(true){
            
            if(slow == fast){
                break;
            }
           slow = nums[slow];
            fast = nums[nums[fast]];

        }
    slow = 0;
System.out.println("first loop completed");
    while(true){
      if(slow == fast){
                break;
            }
            slow = nums[slow];
            fast = nums[fast]; 
    }

return slow;
       

    }
}
