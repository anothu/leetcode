/*
 * @lc app=leetcode.cn id=171 lang=java
 *
 * [171] Excel表列序号
 */

// @lc code=start
class Solution {
    public int titleToNumber(String s) {
        if(s.length()==0)
            return 0;
        int result =0;
        for(int i=0;i<s.length();i++){
            result*=26;
            int temp = (s.charAt(i)-'A'+1);
            result+=temp;
        }
        return result;
    }
}
// @lc code=end

