import java.util.Deque;
import java.util.LinkedList;
/**
 * 20. 有效的括号 stack
*/
class Solution {
    public boolean isValid(String s) {
			Deque<Character> deque =new LinkedList<>();
			for(int i=0;i<s.length();i++){
				char c =s.charAt(i);
				if(c=='('||c=='['||c=='{'){
					deque.addFirst(c);
				}else if (!deque.isEmpty()&&((c==')'&&deque.peek()=='(')||(c=='}'&&deque.peek()=='{')||(c == ']'&&deque.peek()=='[')))
					deque.pop();	
				else return false;
			}
			return deque.isEmpty();
	}
	public static void main(String[] args) {
		System.out.println(new Solution().isValid("([)]"));
	}
}