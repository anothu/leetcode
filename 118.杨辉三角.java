import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

/*
 * @lc app=leetcode.cn id=118 lang=java
 *
 * [118] 杨辉三角
 */

// @lc code=start
class Solution {
    List<Integer> toList(int []a){
        List<Integer> l = new LinkedList<>();
        for(int i:a)
            l.add(i);
        return l;
    }
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> list = new LinkedList<List<Integer>>();
        if(numRows==0)
            return list;
        List<Integer> l =new LinkedList<Integer>();
        l.add(1);
        list.add(l);
        if(numRows==1)
            return list;
        l =new LinkedList<Integer>();
        l.add(1);l.add(1);
        list.add(l);
        if(numRows==2)
            return list;
        int a[]={1,1};
        for(int row=3;row<=numRows;row++){
            int temp[] = new int[row];
            temp[0]=1;
            for(int i=1;i<=a.length-1;i++)
                temp[i]=a[i]+a[i-1];
            temp[a.length]=1;
            list.add(toList(temp));
            a=temp;
        }
        return list;    
    }
}
// @lc code=end

