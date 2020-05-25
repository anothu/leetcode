import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;

/*
 * @lc app=leetcode.cn id=49 lang=java
 *
 * [49] 字母异位词分组
 */

// @lc code=start
class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String,List<String>> map =new HashMap<>();
        for(String s:strs){
            char[] temp =s.toCharArray();
            Arrays.sort(temp);
            String ss =new String(temp);
            List<String> list = map.get(ss);
            if(list==null){
                List<String> slist = new LinkedList<>();
                slist.add(s);
                map.put(ss,slist) ;
            }else{
                list.add(s);
            }       
        }
        List<List<String>> list = new LinkedList<>();
        for(List l:map.values()){
            list.add(l);
        }
        return list;
    }
}
// @lc code=end

