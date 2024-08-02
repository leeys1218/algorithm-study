// [PRG] 짝지어 제거하기 

import java.util.*;

class Solution
{
    public int solution(String s)
    {
        
        Stack<Character> stack = new Stack<>();
        for(int i = 0; i < s.length(); i++) {
            if(stack.isEmpty()) {
                stack.push(s.charAt(i));
                continue;
            }
            
            if(stack.peek().equals(s.charAt(i))) 
                stack.pop();
            else
                stack.push(s.charAt(i));
        }

        if(stack.isEmpty()) return 1;
        return 0;
    }
}