class Solution {

    public String encode(List<String> strs) {
        /*
for each string
    get the string length
    output = length#string


    final output = length#stringlength#string

        */
        String encoded = "";
        for (String s : strs){
            encoded = encoded + String.valueOf(s.length())+"#"+s;
        }
        System.out.println(encoded);
        return encoded;
    }

    public List<String> decode(String str) {
        if(str.length() == 0){
            return Collections.emptyList();

        }else{
            List<String> result = new LinkedList();
            int i = 0;
            while(str.length()>0){
                int end = str.indexOf('#');
                String length = str.substring(0,end);
                int length_int = Integer.valueOf(length);
                result.add(str.substring(end+1,end+1+length_int));
                System.out.println(str.substring(end+1,end+1+length_int));
                str = str.substring(end+1+length_int);
                
               
            }
            return result;
        }
    }
}
