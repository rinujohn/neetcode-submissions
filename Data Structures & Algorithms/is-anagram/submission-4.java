class Solution {
    public boolean isAnagram(String s, String t) {
        int[] dict_array = new int[26];
        boolean result = false;
        for (char c : s.toCharArray()){
            dict_array[c-97] += 1;
            }
        for (char c : t.toCharArray()){
            dict_array[c-97] -= 1;
            }
        result = Arrays.stream(dict_array).allMatch(x -> x == 0);
        return result;
    }
}
