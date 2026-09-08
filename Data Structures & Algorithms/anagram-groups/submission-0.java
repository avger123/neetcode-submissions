
class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> hm = new HashMap<>();

        for (String s : strs) {
            char[] c = s.toCharArray();     // 2. toCharArray(), not toArray()
            Arrays.sort(c);
            String key = new String(c);     // 3. Must convert char[] to String key

            // 4. Initialize list if missing, then append the original string
            if (!hm.containsKey(key)) {
                hm.put(key, new ArrayList<>());
            }
            hm.get(key).add(s);
        }
        return new ArrayList<>(hm.values());
    }
}
