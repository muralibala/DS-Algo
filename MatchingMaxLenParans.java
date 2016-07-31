import java.util.Stack;

public class MatchingMaxLenParans {
	static int maxLenMatchingParen(String strParenExpression) {
        int maxStart = 0;
	    int maxLen = 0, prevStart = 0;
	    Stack<Integer> stack = new Stack<>();
	    
	    int strLen = strParenExpression.length();
	    String[] s = strParenExpression.split("");
	    
	    for(int i = 0; i < strLen; i++)
	    {
	        if (s[i].equals("("))
	        {
	            if (stack.empty())  
	            {
	                prevStart = i;
	            }
	            stack.push(i);
	        } else
	        {
	            if (stack.empty())
	            {
	                prevStart = i + 1;
	            } else {
	                stack.pop();
	                int start = stack.empty() ? prevStart - 1 : stack.peek();
	                int size = i - start;
	                if (size > maxLen)
	                {
	                    maxStart = start + 1;
	                    maxLen = size;
	                }
	            }
	        }
	    }
	    return maxLen;

    }
}
