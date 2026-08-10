class Solution {

    public String encode(List<String> strs) {
        StringBuilder s = new StringBuilder();

        for (String str : strs) {
            s.append(str.length()).append("#").append(str);
        }

        return s.toString();
    }

    public List<String> decode(String s) {
    List<String> ans = new ArrayList<>();

    int i = 0;

    while (i < s.length()) {
        int j = s.indexOf('#', i);
        int len = Integer.parseInt(s.substring(i, j));

        String word = s.substring(j + 1, j + 1 + len);
        ans.add(word);

        i = j + len + 1;
    }

    return ans;
}
}