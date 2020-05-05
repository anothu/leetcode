import java.util.HashMap;

/*
 * @lc app=leetcode.cn id=389 lang=java
 *
 * [389] 找不同
 */

// @lc code=start
class Solution {
    public char findTheDifference(String s, String t) {
        HashMap<Character,Integer> map =new HashMap<>();
        HashMap<Character,Integer> tmap =new HashMap<>();
        for(int i=0;i<s.length();i++){
            char c = s.charAt(i);
            Integer num = map.get(c);
            if(num!=null){
                map.put(c, num+1);
            }else map.put(c, 1);
        }
        for(int i=0;i<t.length();i++){
            char c =t.charAt(i);
            Integer num = tmap.get(c);
            if(num!=null){
                tmap.put(c, num+1);
            }else tmap.put(c, 1);
        }
        for(int i=0;i<t.length();i++){
            char c = t.charAt(i);
            if(map.get(c)==null||!(map.get(c).equals(tmap.get(c)))){
                return c;
            }
        }
        return ' ';
    }
}
// @lc code=end

