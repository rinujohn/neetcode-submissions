class Solution:
    def leastInterval(self, tasks: List[str], n: int) -> int:
        '''
        input: tasks array

        n : cool-off time

        create  a freq map of tasks

        check if n-1 > len(distinct tasks)
        pick on by one
        if n-1 <= len(distinct tasks)
            pick one by one , if other task is not avialable let cpu idle till all tasks are executed for the cooldown period

# take with highest remaining freq are select next


    create a freq map
    add the element to the maxHeap
    if length of heap > n+1 , pop n+1 element
    or pop all elements. 

    add idle cycle only if heap has more entries
    count the cpu cycle to n+1 and deduct 1 entry from task
    push everything back to heap

    continue this process till heap is empty
    asign task in n+1 cycle


        '''
        #print()
        freqMap = dict(Counter(tasks))
        heap = []
        for k,v in freqMap.items():
            #print(k,v)
            heapq.heappush_max(heap,(v,k))
        time = 0
        while(len(heap)>0):
            count = n+1
            temp = []
            while(count>0 and heap):
                if(len(heap)>0):
                    freq,t = heapq.heappop_max(heap)
                    freq-=1
                    if(freq>0):
                        temp.append((freq,t))    
                count-=1
                time+=1
            for item in temp:
                heapq.heappush_max(heap,item)
            if heap:
                time += count
        #print(heap)
        return time