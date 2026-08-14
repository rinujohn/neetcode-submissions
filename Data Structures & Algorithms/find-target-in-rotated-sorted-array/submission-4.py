class Solution:
    def search(self, nums: List[int], target: int) -> int:
        
        l,r = 0,len(nums)-1

        while(l<=r):
            m = (l+r)//2
            if target == nums[m]:
                return m
            # left half is sorted
            if nums[l] <= nums[m]:
                if nums[l] <= target < nums[m]:

                    r = m -1
                else: 
                    l = m+1
            # right half is sorted
            else:
                if nums[m] < target <= nums[r]:

                    l = m+1
                else: 
                    r = m-1

        return -1
        '''
        L = 0, R = len(nums)-1

        
        while(L<=R):
            m = (L+R)/2
            check if target = m:
                return m
            if target> m:
                two posibilities
                if target is less than or equal to R index element:
                    select right half
                else select left half.
            
        t = 9
        7 9 2 3 4 5
        0         5

        m = 2

        search for 4 


        '''