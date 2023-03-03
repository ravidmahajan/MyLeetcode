class Solution {
    public boolean isValid(String s) {
    Stack<Character> stack = new Stack<>();
        
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            
            if(s.charAt(i)=='('){
                stack.push(')');
            } else if(s.charAt(i)=='{'){
                stack.push('}');
            } else if(s.charAt(i)=='['){
                stack.push(']');
            } else if (stack.isEmpty() || c != stack.peek()) {
                    return false;
             } else stack.pop();
            }
        return stack.isEmpty();
        }
}