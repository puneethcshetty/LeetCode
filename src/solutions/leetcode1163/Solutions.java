package solutions.leetcode1163;

class Solution {
    public String lastSubstring(String s) {
        if(s.length() == 0) return "";
        int max = 0;
        for(int i=0 ; i<s.length() ; i++){
            if(s.charAt(i) - 'a' > s.charAt(max)- 'a')
                max = i;
            else if(s.charAt(i) == (s.charAt(max))){
                for(int j = 1 ; j<i-max ; j++)
                    if(i +j < s.length() && s.charAt(i+j) - 'a' > s.charAt(max+j)- 'a')
                        max = i;
            }
        }
        return s.substring(max);
    }

    public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
