package solutions.leetcode4;

class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int mid = (nums1.length + nums2.length)/2;
        int[] num3 = new int[mid+1];
        int count = 0,i = 0, j = 0;
        double result;
        while(nums1.length != i && nums2.length != j){
            if(count == (mid+1))
                break;
            if(nums1[i] < nums2[j]){
                num3[count] = nums1[i];
                i++;
            }
            else{
                num3[count] = nums2[j];
                j++;
            }
            count++;
        }
        if(count != (mid+1)){
            while(nums1.length != i){
                if(count == (mid+1))
                    break;
                num3[count] = nums1[i];
                i++;count++;
            }
            while(nums2.length != j){
                if(count == (mid+1))
                    break;
                num3[count] = nums2[j];
                j++;count++;
            }
        }
        if((nums1.length + nums2.length)%2 == 0)
            result = (num3[mid]+num3[mid-1])/2.0;
        else
            result = num3[mid];
        return result;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
