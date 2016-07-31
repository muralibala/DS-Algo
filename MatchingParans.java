import java.util.Arrays;
import java.util.Stack;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MatchingParans {
	
	public boolean IsMatchingParantheses(String data) {
		Stack<String> stack = new Stack<>();
		String[] matchingBraces = {"{","}","[","]","(",")"};
		String[] openingBrace = {"{","[","("};
		String[] closingBrace = {"}","]",")"};
		
		boolean validExpr = true;
	    String[] input = data.split("");
	    
		for (int i=0; i<input.length;i++) {
	        String ch = input[i];
	        
	        if (Arrays.asList(openingBrace).contains(ch)) {
	            stack.push(ch);
	            continue;
	        }
	        else{
	        	if(Arrays.asList(closingBrace).contains(ch)){
	        		if(stack.isEmpty())
	        			return false;
	        		int idx = Arrays.asList(matchingBraces).indexOf(ch);
	        		ch = matchingBraces[idx-1];
					if (!stack.pop().equals(ch)) {
						validExpr = false;
						break;
					}
	        	}
	        }
	    }
		if(!stack.isEmpty())
			return false;
		
	    return validExpr;
	}
	
	

	public static boolean hasMatchingParantheses(String data) {
		Stack<String> stack = new Stack<>();
		String openingBraceRegex = "[{(\\[]";
		String paranthesisRegex = "[{}()\\[\\]]";
		String[] matchingBraces = {"{","}","]","[",")","("};
		
		Pattern b = Pattern.compile(openingBraceRegex);
		Pattern p = Pattern.compile(paranthesisRegex);
		
	    boolean validExpr = true;
	    String[] input = data.split("");
	    Matcher m;
	    
		for (int i=0; i<input.length;i++) {
	        String ch = input[i];
	        
	        m = p.matcher(ch);
	        if (!m.find()) {
	            continue;
	        }
	        
	        m = b.matcher(ch);
	        if (m.find()) {
	            stack.push(ch);
	            continue;
	        }
	        
	        if (stack.pop() != matchingBraces[i])
	        {
	            validExpr = false;
	            break;
	        }
	    }
	    return validExpr;
	}
}
