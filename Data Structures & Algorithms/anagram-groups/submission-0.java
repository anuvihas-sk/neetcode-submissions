class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String, List<String>> map = new HashMap<>();

        for ( String a : strs){
            int[] count = new int[26];
            for ( char c : a.toCharArray()){
                count [ c - 'a']++;

            }
        
            StringBuilder s = new StringBuilder();
            for ( int i = 0; i< 26; i++){
                s.append(count[i]);
                s.append('#');
            }
            String key = s.toString();
            if(!map.containsKey(key)) {
                map.put(key, new ArrayList<>());
            }    
            map.get(key).add(a);

        }

        return new ArrayList<>(map.values());


    }
    
}
