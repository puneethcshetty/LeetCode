package solutions.leetcode49;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.stream.Collectors;

public class Solution {

	//using hashMap
	public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String, List<String>> map = new HashMap<>();
        List<String> list = null;
        String key = "";
        for(String s : strs) {
        	key = getSorted(s.toCharArray());
        	list = map.get(key);
        	if(list == null)
        		list = new ArrayList<>();
        	list.add(s);
        	map.put(key, list);
        }
        return new ArrayList<>(map.values());
    }
	
	public String getSorted(char[] arr) {
    	Arrays.sort(arr);
    	return new String(arr);
	}
	
	//using streams groupingBy
	public List<List<String>> groupAnagrams1(String[] strs) {
        return new ArrayList<>(Arrays.stream(strs).collect(Collectors.groupingBy(Solution::sorted)).values());
    }
    
    private static String sorted(String s) {
        char[] arr = s.toCharArray();
        Arrays.sort(arr);
        return new String(arr);
    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
