/*
 * @lc app=leetcode.cn id=204 lang=java
 *
 * [204] 计数质数
 */

// @lc code=start
class Solution {
    public int countPrimes(int n) {
        int count=0;
        boolean isNotSu[] = new boolean[n];
        for (int i = 2; i < Math.sqrt(n); i++) {
            if(isNotSu[i])
                continue;
            for(int j=2;j*i<n;j++)
                isNotSu[j*i]=true;
        }
        for(int i=2;i<n;i++){
            if(isNotSu[i]==false)
                count++;
        }
        return count;

    }

}
// @lc code=end
