package solutions.leetcode524;

import java.util.List;

class Solution {
    public String findLongestWord(String s, List<String> d) {
        String result = "";
        for(String word : d)
            if(check(s,word))
                if(result.length() < word.length() || (result.length() == word.length() && result.compareTo(word) > 0))
                    result = word;
        return result;
    }
    
    public boolean check(String s, String word){
        int len = 0;
        for (int i = 0; i < s.length() && len < word.length(); i++)
            if (s.charAt(i) == word.charAt(len))
                len++;
        return len == word.length();
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
