package leetcode;

public class validparenthess {
	
	    public boolean isValid(String s) {
	          char[] stack = new char[s.length()];
	        int f = -1;
	        for(int i=0;i<s.length();i++)
	        {
	            char ch=s.charAt(i);
	            if(ch=='('|| ch=='{' || ch == '[')
	            {
	                 stack[++f] = ch;   
	            }
	            else
	            {
	                if(f==-1) return false;
	                  char last = stack[f--]; 

	                if(ch == ')' && last != '(') return false;
	                if(ch == ']' && last != '[') return false;
	                if(ch == '}' && last != '{') return false;
	            }
	        }
	        
	       return f==-1;
	    }
}