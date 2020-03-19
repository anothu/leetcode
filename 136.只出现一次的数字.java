import java.security.KeyStore.Entry;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

/*
 * @lc app=leetcode.cn id=136 lang=java
 *
 * [136] 只出现一次的数字
 */

// @lc code=start
class Solution {
    public int singleNumber(int[] nums) {
		HashMap<Integer, Boolean> m = new HashMap<Integer, Boolean>();
		for (int i : nums) {
			Boolean b = m.put(i, true);
			if (b != null && b == true)
				m.put(i, false);
		}
		for (Map.Entry e : m.entrySet()) {
			if (e.getValue().equals(true))
				return (int) e.getKey();
		}
		return 0;
	}
}
// @lc code=end

