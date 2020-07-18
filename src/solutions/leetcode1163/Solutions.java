package solutions.leetcode1163;

class Solution {
    public String lastSubstring(String s) {
        if(s.length() == 0) return "";
        int max = 0;
        for(int i=0 ; i<s.length() ; i++){
            if(s.charAt(i) - 'a' > s.charAt(max)- 'a')
                max = i;
            else if(s.charAt(i) == (s.charAt(max)))
                if(s.substring(i).compareTo(s.substring(max)) > 0)
                    max = i;
        }
        return s.substring(max);
    }

    public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
