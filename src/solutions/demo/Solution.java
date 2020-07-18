package solutions.demo;

class Solution {
	
	public static char[] countSort(char[] seq)
    {
        int[] arr = new int[26];
        for(char c : seq)
            arr[c - 'a']++;
        for(int i=1; i<26 ; i++)
            arr[i] += arr[i-1];
        
        char[] result = new char[seq.length];
        for(char c : seq){
            result[arr[c - 'a'] - 1] = c;
            arr[c - 'a']--;
        }
        return result;
    }
	
	public static void main(String[] args) {
		Solution s = new Solution();
	}	
	
	
}



