import java.util.HashMap;

/*
 * @lc app=leetcode.cn id=383 lang=java
 *
 * [383] 赎金信
 */

// @lc code=start
class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        HashMap<Character,Integer> map=new HashMap<>();
        for(int i=0;i<magazine.length();i++){
            Character c=magazine.charAt(i);
            Integer temp=map.get(c); 
            if(temp!=null){
                map.put(c,temp+1);
            }else map.put(c, 1);
        }
        for(int i=0;i<ransomNote.length();i++){
            Character c=ransomNote.charAt(i);
            Integer temp=map.get(c);
            if(temp==null||temp<1){
                return false;
            }else map.put(c, temp-1);
        }
        return true;
    }
}
// @lc code=end

