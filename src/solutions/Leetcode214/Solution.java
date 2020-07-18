package solutions.Leetcode214;

class Solution {
	public String shortestPalindrome(String s) {
		int n = s.length();
		StringBuilder sb = new StringBuilder(s);
		String revStr = sb.reverse().toString();
		for(int i=0 ; i<n ;i++)
			if(s.substring(0,n-i).equals(revStr.substring(i)))
				return revStr.substring(0,i)+s;
		return "";
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	}
}
