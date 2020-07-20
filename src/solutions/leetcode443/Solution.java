package solutions.leetcode443;

import java.util.ArrayList;
import java.util.List;

class Solution {
    public int compress(char[] chars) {
        int l=0, c=0;
        if(chars.length == 1)
            return 1;
        List<Character> list = new ArrayList<>();
        for(int i=0 ;i<chars.length ;i++){
            if(chars[i] == chars[l])
                c++;
            else if(c>0){
                list.add(chars[l]);
                l = i; 
                if(c!=1){
                    for(char n : ("" + c).toCharArray())
                        list.add(n);
                    c=1;
                }
            }
        }
        if(c>0){
            list.add(chars[l]);
            if(c!=1){
                for(char n : ("" + c).toCharArray())
                    list.add(n);
            }
        }
        int k=0;
        for(Character ch : list)
            chars[k++] = ch;
        return list.size();
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
