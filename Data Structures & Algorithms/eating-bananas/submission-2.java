class Solution {
public int minEatingSpeed(int[] piles, int h) {

    int L = 0;

    // List<Integer> range = IntStream
    //         .rangeClosed(1, Arrays.stream(piles).max().getAsInt())
    //         .boxed()
    //         .toList();

     int R = Arrays.stream(piles).max().getAsInt();

    while (L < R) {

        int mid = L + (R - L) / 2;

        

        long totalHours = calculateHours(piles, mid);

        if (totalHours > h) {
            // Too slow, need a higher eating speed
            L = mid + 1;
        } else {
            // Speed works, try to find a smaller speed
            R = mid;
        }
    }

    return L;
}

public long calculateHours(int[] piles, int rate) {

    long sum = 0;

    for (int p : piles) {
        sum += Math.ceil((double) p / rate);
    }

    return sum;
}
}
// class Solution {
//     public int minEatingSpeed(int[] piles, int h) {
        
//         var L = 0;
        
//         List<Integer> range = IntStream.range(1,Arrays.stream(piles).max().getAsInt()+1).boxed().toList();
//         var R = range.size()-1;
//         int result = 0;
//         int totalHours = 0;
//         int mid = 0;
//         while(L<R){
            
//             mid = (L+R)/2;
//            totalHours = calculateHours(piles, range.get(mid));
//            if(totalHours>=h){
//             L = mid +1;
//            }else{
    
//             R = mid;
//            }
// System.out.println("left: "+L + "  Right : "+R);
//         }
//         return range.get(L);
//     }
//     public int calculateHours(int[] piles, int rate ){
//         int sum =0;
//         for(int p : piles){
//             sum += Math.ceil((double)p/rate);
//         }
//         return sum;
//     }
// }
/*
input piles array
max_time  = h 

find k, 
each hour, we can eat k banana from each pile, if the pile is finished, he cannot start another pile


minimum rate, he can eat, 1

maximum rate he can eat, is infinity

but valid max rate is max[piles[:]], eating faster than that wont reduce the total hours

edge case : h < length(piles)

search space of rate : [1, 2, .. max{piles[:]}
perform a binary search

vailation condition:
    total hour = 0
    for each p in piles:
        total_hour += total_hour+ ceil[p/rate]
    
total_hour < h: search left half till R = L-1
total_hour >= h: search right half from L = L+1 
breaking condition: search space reduced to 1

return the last valid value
*/