class Solution {
    public boolean isValid(String s) {
        Stack<Character> inputStack = new Stack<>();

        for (char temp : s.toCharArray()) {

            if (temp == '(' || temp == '{' || temp == '[') {
                inputStack.push(temp);   
            }
            else if (inputStack.size() == 0 || 
                     temp == ')' && inputStack.pop() != '(' || 
                     temp == '}' && inputStack.pop() != '{' || 
                     temp == ']' && inputStack.pop() != '[') {
                    return false;
            }
        }
        return inputStack.isEmpty();
    }
}