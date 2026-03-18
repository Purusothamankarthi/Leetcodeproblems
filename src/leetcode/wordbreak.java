package leetcode;

import java.util.List;

public class wordbreak {
	
	    public boolean wordBreak1(String s, List<String> wordDict) {
	         if(s.length() == 0) return true;

	        for(int i = 0; i < wordDict.size(); i++) {

	            String word = wordDict.get(i);

	            if(s.startsWith(word)) {

	                String remain = s.substring(word.length());

	                if(wordBreak1(remain, wordDict)) {
	                    return true;
	                }
	            }
	        }

	        return false;
	    }
	}

