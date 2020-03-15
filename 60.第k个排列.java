import java.util.Arrays;

/*
 * @lc app=leetcode.cn id=60 lang=java
 *
 * [60] 第k个排列
 */

// @lc code=start
class Solution {
    public String getPermutation(int n, int k) {
        StringBuilder sb = new StringBuilder();
        List<Integer> list = new LinkedList<>();
        for(int i=1;i<=n;i++)
            list.add(i);
        int s=1;
        for(int i=1;i<n;i++)
            s*=i;
        while(n>1){
            int j=k/s;
            k=k%s;
            s=s/--n;
            if(k==0){
                sb.append(list.get(j-1));
                list.remove(j-1);
                break;
            }else {
                sb.append(list.get(j));
                list.remove(j);
            }
        }
        for(int i=list.size()-1;i>=0;i--)
            sb.append(list.get(i));
        return sb.toString();
    }
}
// @lc code=end

