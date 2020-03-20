import java.util.LinkedList;

/*
 * @lc app=leetcode.cn id=155 lang=java
 *
 * [155] 最小栈
 */

// @lc code=start
class MinStack {
    private LinkedList<Integer> list;
    /** initialize your data structure here. */
    public MinStack() {
        list = new LinkedList<>();
    }
    
    public void push(int x) {
        list.add(x);
    }
    
    public void pop() {
        list.removeLast();
    }
    
    public int top() {
        return list.getLast();
    }
    
    public int getMin() {
        int min=Integer.MAX_VALUE;
        for(int i:list){
            if(i<min)
                min=i;
        }
        return min;
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(x);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */
// @lc code=end

