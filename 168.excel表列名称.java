/*
 * @lc app=leetcode.cn id=168 lang=java
 *
 * [168] Excel表列名称
 */

// @lc code=start
class Solution {
    public String convertToTitle(int n) {
        StringBuilder s = new StringBuilder();
        while (n > 0) {
            int i = n % 26;
            if(i==0){
                i=26;
                n-=1;
            }
            s.insert(0, (char)('A' + i - 1));
            n /= 26;
        }
        return s.toString();
    }
}
// @lc code=end
