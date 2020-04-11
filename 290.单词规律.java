import java.util.HashMap;

/*
 * @lc app=leetcode.cn id=290 lang=java
 *
 * [290] 单词规律
 */

// @lc code=start
class Solution {
    public boolean wordPattern(String pattern, String str) {
        String[] words = str.split(" ");
        if (words.length != pattern.length())
            return false;
        Map<String,Integer> index = new HashMap();
        Map<Character,Integer> cindex = new HashMap();

        for (int i = 0; i < words.length; ++i) {
            Integer a = cindex.put(pattern.charAt(i), i);
            Integer b = index.put(words[i], i);
            if (a == null && b == null)
                continue;
            if (a == null || b == null)
                return false;
            if (!a.equals(b)) {
                return false;
            }
        }
        return true;
    }
}
// @lc code=end

