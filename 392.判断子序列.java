/*
 * @lc app=leetcode.cn id=392 lang=java
 *
 * [392] 判断子序列
 */

// @lc code=start
class Solution {
    public boolean isSubsequence(String s, String t) {
        if(s.equals("")){
            return true;
        }
        int sindex = 0;
        int tindex=0;
        for(;tindex<t.length();){
            if(s.charAt(sindex)==t.charAt(tindex)){
                if(++sindex==s.length()){
                    return true;
                }
                tindex++;
            }else {
                tindex++;
            }
        }
        return false;
    }
}
// @lc code=end

