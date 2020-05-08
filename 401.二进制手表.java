import java.util.LinkedList;
import java.util.List;

/*
 * @lc app=leetcode.cn id=401 lang=java
 *
 * [401] 二进制手表
 */

// @lc code=start
class Solution {
    final static int transfer[]={1,2,4,8,1,2,4,8,16,32};

    public List<String> readBinaryWatch(int num) {
        //0~3表示时,4～9表示分
        boolean[] lighton=new boolean[10];
        List<String> list =new LinkedList<>();
        dfs(0, lighton, list,num,-1);
        return list;
    }

    public void dfs(int depth,boolean[]lightOn,List<String> list,int num,int index){
        if(depth==num){
            int hour=0;
            int minute=0;
            for(int i=0;i<4;i++){
                if(lightOn[i]==true){
                    hour+=transfer[i];
                }
            }
            if(hour>=12)return;
            for(int i=4;i<10;i++){
                if(lightOn[i]==true){
                    minute+=transfer[i];
                }
            }
            if(minute>=60)return;
            if(minute<10){
                list.add(hour+":0"+minute);
            }else list.add(hour+":"+minute);
            
        }else {
            for(int i=index+1;i<10;i++){
                if(lightOn[i]==false){
                    lightOn[i]=true;
                    dfs(depth+1, lightOn,list,num,i);
                    lightOn[i]=false;
                }
            }
        }
    }
}
// @lc code=end

