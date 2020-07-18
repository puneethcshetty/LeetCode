package solutions.leetcode209;

class Solution {
    public int minSubArrayLen(int s, int[] nums) {
        int result = nums.length, i = 0, j = 0, sum = 0;
        for(j = 0; j<nums.length; j++){
            sum+=nums[j];
            if(sum >= s){
                while(sum-nums[i] >= s)
                    sum-=nums[i++];
                if(result > j-i+1)
                    result = j-i+1;
            }
        }
        if(sum >= s)
            return result;
        else
            return 0;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
