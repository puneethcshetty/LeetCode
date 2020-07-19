package solutions.leetcode4;

import java.util.ArrayList;
import java.util.List;

class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int mid = (nums1.length + nums2.length)/2;
        List<Integer> list = new ArrayList<>();
        int count = 0,i = 0, j = 0;
        double result;
        while(nums1.length != i && nums2.length != j){
            if(count == (mid+1))
                break;
            if(nums1[i] < nums2[j]){
                list.add(nums1[i]);
                i++;
            }
            else{
                list.add(nums2[j]);
                j++;
            }
            count++;
        }
        while(nums1.length != i){
            if(count == (mid+1))
                break;
            list.add(nums1[i]);
            i++;count++;
        }
        while(nums2.length != j){
            if(count == (mid+1))
                break;
            list.add(nums2[j]);
            j++;count++;
        }
        if((nums1.length + nums2.length)%2 == 0)
            result = (list.get(mid)+list.get(mid-1))/2.0;
        else
            result = list.get(mid);
        return result;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
