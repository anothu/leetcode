import java.util.HashMap;
import java.util.HashSet;

/*
 * @lc app=leetcode.cn id=3 lang=java
 *
 * [3] 无重复字符的最长子串
 */

// @lc code=start
class Solution {
    public int lengthOfLongestSubstring(String s) {
        int length = s.length();
        int left = 0;
        int right = 0;
        int max =0;
        //利用hashmap实现滑动窗口的位置记录
        HashMap<Character, Integer> map = new HashMap<>();
        while (right != length) {
            char c = s.charAt(right);
            if (map.containsKey(c)) {
                left = Math.max(left, map.get(c)+1);
            }
            map.put(c, right);
            max = Math.max(max, right-left+1);
            right++;
        }
        return max;
    }
    public static void main(String[] args) {
        System.out.println(new Solution().lengthOfLongestSubstring("bacabc"));
    }
}
// @lc code=end
