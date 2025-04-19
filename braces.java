import java.util.*;

class Parser {
    static String isBalanced(String s) {
        Stack<Character> stack = new Stack<>();
        for (char ch : s.toCharArray()) {
            if (ch == '{' || ch == '(') {
                stack.push(ch);
            } else if (ch == '}' || ch == ')') {
                if (stack.isEmpty()) return "false";
                char top = stack.pop();
                if ((ch == '}' && top != '{') || (ch == ')' && top != '(')) {
                    return "false";
                }
            }
        }
        return stack.isEmpty() ? "true" : "false";
    }
}
class Solution {
	
	public static void main(String[] args) {
		Parser parser = new Parser();
        
		Scanner in = new Scanner(System.in);

		while (in.hasNext()) {
			System.out.println(parser.isBalanced(in.next()));
		}
        
		in.close();
	}
}
