import java.util.HashMap;

/*
 * @lc app=leetcode.cn id=242 lang=java
 *
 * [242] 有效的字母异位词
 */

// @lc code=start
class Solution {
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length())
            return false;
        HashMap<Character, Integer> sMap = new HashMap<>();
        HashMap<Character, Integer> tMap = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            Character cs = s.charAt(i);
            Character ct = t.charAt(i);
            Integer is = sMap.get(s.charAt(i));
            Integer it = tMap.get(t.charAt(i));
            if (is != null)
                sMap.put(cs, is + 1);
            else
                sMap.put(cs, 0);

            if (it != null)
                tMap.put(ct, it + 1);
            else
                tMap.put(ct, 0);
        }
        for(Character c:sMap.keySet()){
            if(!sMap.get(c).equals(tMap.get(c)))
                return false;
        }
        return true;

    }
}
// @lc code=end
