package medium;

import java.util.*;

public class GroupAnagrams {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> map = new HashMap<>();
        for (String s : strs) {
            char[] charsA = s.toCharArray();
            Arrays.sort(charsA);
            String key = new String(charsA);
            map.computeIfAbsent(key, k -> new ArrayList<>()).add(s);
            /** map.computeIfAbsent(key, k -> new ArrayList<>()).add(s) can be done like below:
            if (!map.containsKey(key)) {
                map.put(key, new ArrayList<>());
            }
            map.get(key).add(s);
             */
        }
        return new ArrayList<>(map.values());
    }

    public static void main(String[] args) {
        GroupAnagrams ga = new GroupAnagrams();
        String[] input = {"eat", "tea", "tan", "ate", "nat", "bat"};
        List<List<String>> result = ga.groupAnagrams(input);

        for (List<String> group : result) {
            System.out.println(group);
        }
    }
}
