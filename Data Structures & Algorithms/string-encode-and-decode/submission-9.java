class Solution {

    public String encode(List<String> strs) {
         System.out.println(strs);
        if(strs.isEmpty()){
            System.out.println("is Empty case");
            return null;
        }
        StringBuilder result = new StringBuilder();
        for(String element : strs){
            result.append(element + "%sep%");
        }
        return result.toString().substring(0,result.length()-5);
    }

    public List<String> decode(String str) {
        System.out.println(str);
        if(str == null){
             System.out.println("null case");
            return new LinkedList<>();
         }//else if (str.isEmpty()){
        //     System.out.println("Empty case");
        //     List<String> result = new LinkedList<>();
        //     result.add(str);
        //     return result;
        // }
        String[] resultArr = str.split("%sep%");
        return new LinkedList<>(Arrays.asList(resultArr));
    }
}
