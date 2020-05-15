import sun.security.util.Length;
/**
 * 最长回文串动态规划解法，用dp[i][j]存储i到j的字符串是不是回文，不计算i=j的情况
*/
class Solution {
  public String longestPalindrome(String s) {
    if(s==null|| s.length()<2) return s;
    int length =s.length();
    boolean dp[][]=new boolean[length][length];
    int maxLen=1;
    int start=0;int end=0;
    for(int r=1;r<length;r++){
      for(int l=0;l<r;l++){
        if(s.charAt(l)==s.charAt(r)&&(r-l<=2||dp[l+1][r-1])){
          dp[l][r]=true;
          int temp= r-l+1;
          if(temp>maxLen){
            maxLen=temp;
            start = l;end = r;
          }
        }
      }
    }
    
    return s.substring(start, end+1);
  }
  public static void main(String[] args) {
    System.out.println(new Solution().longestPalindrome("ab"));
  }
}