package solution.leetcode42;

class Solution {
    public int trap(int[] height) {
        int n = height.length;
        if(n == 0) return 0;
        int[] l = new int[n];
        int[] r = new int[n];
        int water = 0;
        l[0] = height[0];
        r[n-1] = height[n-1];
        for(int i=1,j=n-2; i<n ; i++,j--){
            l[i] = l[i-1]>height[i] ? l[i-1] : height[i];
            r[j] = r[j+1]>height[j] ? r[j+1] : height[j];
        }
        
        for(int i=1 ; i<n-1 ; i++){
            int min = l[i] > r[i] ? r[i] : l[i];
            water+= min - height[i];
        }
        return water;
    }

    static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
