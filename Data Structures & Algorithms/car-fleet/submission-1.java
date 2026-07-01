class Solution {
    public int carFleet(int target, int[] position, int[] speed) {
        float[]  timeToDestination = new float[position.length];
        Integer[] index = new Integer[position.length];

        Stack<Float> stack = new Stack<>();

        for (int i = 0;i< position.length; i++){
            timeToDestination[i] = (float)(target- position[i]) /speed[i];
            index[i] = i; 
        }
        Arrays.sort(index, (i, j) -> Integer.compare(position[j], position[i]));

        for(int idx: index){
            if(stack.isEmpty() || timeToDestination[idx]> stack.peek()) {
                stack.push(timeToDestination[idx]);
            } 
        }
        return stack.size();
    }

}
