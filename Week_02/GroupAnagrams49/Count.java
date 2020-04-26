package GroupAnagrams49;

import java.util.*;

/**
 * 我们可以将每个字符串 \text{s}s 转换为字符数 \text{count}count
 * 由26个非负整数组成，表示 \text{a}a，\text{b}b，\text{c}c 的数量等。
 * 我们使用这些计数作为哈希映射的基础。
 */
public class Count {
    public List<List<String>> groupAnagrams(String[] strs) {
        if (strs.length == 0) return new ArrayList();
        Map<String, List> ans = new HashMap<String, List>();
        int[] count = new int[26];
        for (String s : strs) {
            Arrays.fill(count, 0);
            for (char c : s.toCharArray()) count[c - 'a']++;

            StringBuilder sb = new StringBuilder("");
            for (int i = 0; i < 26; i++) {
                sb.append('#');
                sb.append(count[i]);
            }
            String key = sb.toString();
            if (!ans.containsKey(key)) ans.put(key, new ArrayList());
            ans.get(key).add(s);
        }
        return new ArrayList(ans.values());
    }
}
