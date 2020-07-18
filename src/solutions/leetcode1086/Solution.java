package solutions.leetcode1086;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;

class Solution {
    public int[][] highFive(int[][] items) {
        HashMap<Integer,List<Integer>> map = new LinkedHashMap<>();
        List<Integer> list = null;
        for(int[] item : items){
            list = map.get(item[0]);
            if(list == null)
                list = new ArrayList<>();
            list.add(item[1]);
            map.put(item[0],list);
        }
        
        int length = map.keySet().size();
        int[][] result = new int[length][2];
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
        System.out.println(list.size());
        for(int i:list)
            sum+=i;
        return sum/list.size();
    }
    
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
