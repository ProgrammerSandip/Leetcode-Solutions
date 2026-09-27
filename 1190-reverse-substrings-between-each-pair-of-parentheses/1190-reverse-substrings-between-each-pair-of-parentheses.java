class Solution {
    public String reverseParentheses(String s) {
        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);

            if (ch != ')') {
                stack.push(ch);
            } 
            else {
                StringBuilder temp = new StringBuilder();

                while (stack.peek() != '(') {
                    temp.append(stack.pop());
                }

                stack.pop(); // remove '('

                for (int j = 0; j < temp.length(); j++) {
                    stack.push(temp.charAt(j));
                }
            }
        }

        StringBuilder result = new StringBuilder();

        while (!stack.isEmpty()) {
            result.append(stack.pop());
        }

        return result.reverse().toString();
    }
}