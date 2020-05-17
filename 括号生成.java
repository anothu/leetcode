import java.util.*;
/**22. 括号生成 回溯法*/
class Solution{
    public List<String> generateParenthesis(int n){
        List<String> list =new LinkedList<>();
        StringBuilder sb =new  StringBuilder();
        dfs(n,list, 0, 0, sb);
        return list;
    }
    public void dfs(int n,List<String> list,int left,int right,StringBuilder sb){
        if(left==n&&right==n){
            list.add(sb.toString());
        }
        if(left>n||right>n)
            return;
        sb.append('(');
        dfs(n,list, left+1, right,sb);
        sb.deleteCharAt(sb.length()-1);
        if(left>right){
            sb.append(')');
            dfs(n,list, left, right+1, sb);
            sb.deleteCharAt(sb.length()-1);
        }

    }
    public static void main(String[] args) {
        System.out.println(new Solution().generateParenthesis(3));
    }
}