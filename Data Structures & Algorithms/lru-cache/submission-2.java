class LRUCache {
    private LinkedList<Integer> keyList = new LinkedList<>();
    private Map<Integer, Integer> kvMap = new HashMap<>();
    private int capacity;

    public LRUCache(int capacity) {
     this.capacity = capacity;
    }
    
    public int get(int key) {
     if(kvMap.containsKey(key)){
        keyList.remove(Integer.valueOf(key));
        keyList.addLast(key);
        return kvMap.get(key);
     }   else{
        return -1;
     }
    }
    
    public void put(int key, int value) {
        if (kvMap.containsKey(key)) {
        keyList.remove(Integer.valueOf(key));
    } 
      else  if(keyList.size()== this.capacity){
           int removed =  keyList.removeFirst();
            kvMap.remove(removed);
        }
            
            keyList.addLast(key);
            kvMap.put(key,value);
    }
}
