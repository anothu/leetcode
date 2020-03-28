import java.util.HashMap;

/*
 * @lc app=leetcode.cn id=205 lang=java
 *
 * [205] 同构字符串
 */

// @lc code=start
class Solution {
    public boolean isIsomorphic(String s, String t) {
        int sLength = s.length();
        if (sLength == 0)
            return true;
        int index = s.charAt(0) - t.charAt(0);
        HashMap<Character, Integer> map = new HashMap<>();
        map.put(s.charAt(0), index);
        for (int i = 1; i < sLength; i++) {
            char c = s.charAt(i);
            int temp = s.charAt(i) - t.charAt(i);
            if (map.get(c) == null) {               
                map.put(c, temp);
            }else if(map.get(c)!=temp)
                return false;
        }
        HashMap<Character, Integer> map0 = new HashMap<>();
        map0.put(t.charAt(0), index);
        for (int i = 1; i < sLength; i++) {
            char c = t.charAt(i);
            int temp = s.charAt(i) - t.charAt(i);
            if (map0.get(c) == null) {               
                map0.put(c, temp);
            }else if(map0.get(c)!=temp)
                return false;
        }
        return true;

    }
}
// @lc code=end
