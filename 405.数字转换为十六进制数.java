/*
 * @lc app=leetcode.cn id=405 lang=java
 *
 * [405] 数字转换为十六进制数
 */

// @lc code=start
class Solution {
    public String toHex(int num) {
        if(num==0)return "0";
        char[] index ={'0','1','2','3','4','5','6','7','8','9','a','b','c','d','e','f'};
        String result = "";
        while(num!=0){
            result = index[num&15]+result;
            num=num>>>4;
        }
        return result;
    }
}
// @lc code=end

