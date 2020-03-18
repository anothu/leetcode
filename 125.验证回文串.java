/*
 * @lc app=leetcode.cn id=125 lang=java
 *
 * [125] 验证回文串
 */

// @lc code=start
class Solution {
    boolean isaz(char c){
        if(c>='a'&&c<='z')
            return true;
        return false;
    }
    boolean isAZ(char c){
        if(c>='A'&&c<='Z')
            return true;
        return false;
    }
    boolean isNum(char c){
        if(c<'0'||c>'9')
            return false;
        return true;
    }
    boolean inArea(char c){
        return isAZ(c)||isaz(c)||isNum(c);
    }
    public boolean isPalindrome(String s) {
        if(s.equals(""))
            return true;
        int left=0;
        int right=s.length()-1;
        System.out.println(s.charAt(right));
        while(left<=right){
            while((!inArea(s.charAt(left)))){
                left++;
                if(left>right)
                return true;
            }
            while((!inArea(s.charAt(right)))){
                right--;
                if(left>right)
                return true;
            }
            char a= s.charAt(left);
            char b = s.charAt(right);
            if(!isAZ(a))
                a-=32;
            if(!isAZ(b))
                b-=32;
            if(!(a==b))
                return false;
            left++;right--;
        }
        return true;
    }
    // public static void main(String[] args) {
    //     System.out.println(new Solution1().isPalindrome("$#$#$@@#$@#$"));
    // }
}
// @lc code=end

