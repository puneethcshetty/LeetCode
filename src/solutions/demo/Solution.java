package solutions.demo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;

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
	
	public int[][] highFive(int[][] items) {
        HashMap<Integer,List<Integer>> map = new LinkedHashMap<>();
        for(int[] item : items)
            map.merge(item[0],new ArrayList(item[1]),(a,b) -> {a.addAll(b);return a;});
        int length = map.keySet().size();
        int[][] result = new int[length][2];
        List<Integer> list = new ArrayList<>();
        int i=0;
        for(int key: map.keySet()){
            list = map.get(key);
            if(list.size() > 5){
                Collections.sort(list, Collections.reverseOrder());
                list = list.subList(0,5);
            }
            result[i] = new int[] {key,giveAvg(list)};
            i++;
        }
        return result;
    }
    
    public int giveAvg(List<Integer> list){
        int sum = 0;
        for(int i:list)
            sum+=i;
        return sum/list.size();
    }
	
	public static void main(String[] args) {
		Solution s = new Solution();
	}	
	
	
}



