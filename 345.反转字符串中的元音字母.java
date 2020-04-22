import java.util.HashSet;

/*
 * @lc app=leetcode.cn id=345 lang=java
 *
 * [345] 反转字符串中的元音字母
 */

// @lc code=start
class Solution {


    public String reverseVowels(String s) {
        HashSet<Character> hset= new HashSet<>();
        hset.add('a');hset.add('e');hset.add('i');hset.add('o');hset.add('u');
        hset.add('A');hset.add('E');hset.add('I');hset.add('O');hset.add('U');
       
        char[] a = s.toCharArray();
        int left = 0;
        int right = s.length() - 1;
        while (left < right) {
            while(!hset.contains(a[left]) && left < right)
            {
                left++;
            }
            while (!hset.contains(a[right]) && left < right) {
                right--;
            }
            char temp = a[left];
            a[left] = a[right];
            a[right] = temp;
            left++;
            right--;
        }
        return String.valueOf(a);

    }
}
// @lc code=end
