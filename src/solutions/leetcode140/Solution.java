package sokutions.leetcode140;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

class Solution {
    public List<String> wordBreak(String s, List<String> wordDict) {
        Queue<String> q = new LinkedList<>(wordDict);
        List<String> res = new ArrayList<>();
        String str = null;
        while(!q.isEmpty()){
            str = q.poll();
            if(s.equals(str.replace(" ","")))
                res.add(str);
            else
                for(String chk: wordDict)
                    if(s.startsWith(str.replace(" ","")+chk))
                        q.add(str+" "+chk);
        }
        return res;
    }

    public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
