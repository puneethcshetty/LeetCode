package solutions.leetcode532;

import java.util.HashMap;

class Solution {
    public int findPairs(int[] nums, int k) {
        int count = 0;
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int n : nums)
            map.merge(n,1,(a,b) -> a+b);
        
        for(int key : map.keySet()){
            if(k == 0 && map.get(key) > 1)
                count++;
            else if(k > 0 && map.containsKey(key +  k))
                count++;
        }
        return count;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
