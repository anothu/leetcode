/*
 * @lc app=leetcode.cn id=43 lang=java
 *
 * [43] 字符串相乘
 */

// @lc code=start
class Solution {
    public int[] init(String s) {
        int[] a = new int[s.length()];
        for (int i = 0; i < s.length(); i++) {
            a[i] = s.charAt(s.length() - i - 1) - '0';
        }
        return a;
    }
    public void check(int[]a,int index){
        if(a[index]>=10){
            a[index]-=10;
            a[index+1]++;
            check(a, index+1);
        }
    }
    public String multiply(String num1, String num2) {
        int[] n1 = init(num1);
        int[] n2 = init(num2);
        int[] result = new int[n1.length + n2.length];
        for (int i = 0; i < n1.length; i++) {
            for (int j = 0; j < n2.length; j++) {
                int temp = n1[i] * n2[j];
                result[i + j + 1] += (temp / 10);
                check(result, i+j+1);
                temp %= 10;
                result[i + j] += temp;
                check(result, i+j);
            }
        }
        StringBuilder sb = new StringBuilder();
        int index = result.length - 1;
        while (result[index] == 0) {
            index--;
        }
        for (int i = index; i >= 0; i--) {
            sb.append(result[i]);
        }
        return sb.toString();
    }
}
// @lc code=end
