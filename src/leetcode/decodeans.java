package leetcode;

import java.util.*;

public class decodeans {
	public String decode(String s)
	{
		Stack<Integer> nums=new Stack<>();
		Stack<StringBuilder> ans=new Stack<>();
		int num=0;
		StringBuilder answer=new StringBuilder();
		for(char an:s.toCharArray())
		{
			if(Character .isDigit(an)) {
				num= (num * 10)+(an-'0');
				
			}
			else if(an=='[')
			{
				nums.push(num);
				num=0;
				ans.push(answer);
				answer=new StringBuilder();
			}
			else if(an==']') {
				String str=answer.toString();
				answer=new StringBuilder(str.repeat(nums.pop()));
				answer=ans.pop().append(answer);
				
			}
			else
			{
				answer.append(an);
			}
				
		}
		return answer.toString();
		
	}
}
