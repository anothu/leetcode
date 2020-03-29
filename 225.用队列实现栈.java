import java.util.Deque;
import java.util.LinkedList;

/*
 * @lc app=leetcode.cn id=225 lang=java
 *
 * [225] 用队列实现栈
 */

// @lc code=start
class MyStack {
    Deque<Integer> myStack ;
    /** Initialize your data structure here. */
    public MyStack() {
        myStack = new LinkedList<>();
    }
    
    /** Push element x onto stack. */
    public void push(int x) {
        myStack.addLast(x);
    }
    
    /** Removes the element on top of the stack and returns that element. */
    public int pop() {
        return myStack.pollLast();
    }
    
    /** Get the top element. */
    public int top() {
        return myStack.peekLast();
    }
    
    /** Returns whether the stack is empty. */
    public boolean empty() {
        return myStack.size()==0;
    }
}

/**
 * Your MyStack object will be instantiated and called as such:
 * MyStack obj = new MyStack();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.top();
 * boolean param_4 = obj.empty();
 */
// @lc code=end

