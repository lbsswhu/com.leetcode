package leetcode38;

import java.util.ArrayList;

/**
 * @author lbsswhu
 * @create 2018 02 26 21:34
 * @Description
 **/
public class Solution {
    public String countAndSay(int n) {
        ArrayList<Character> result = new ArrayList<>();
        ArrayList<Character> init = new ArrayList<>();
        init.add('1');
        int count = 1;
        if(n==1)
            result.add('1');
        for(int i = 1;i<n;i++){
            result.clear();
            for(int j=0;j<init.size();j++){
                if(j == init.size()-1 || init.get(j+1)!=init.get(j)){
                    result.add((char)count);
                    result.add(init.get(j));
                    count=0;
                }
                count++;
            }
            init.clear();
            for(int k = 0;k<result.size();k++)
                init.add(result.get(k));
        }
        String res = "";
        for(int i=0;i<result.size();i++)
            res = res+result.get(i);
        return res;
    }
}

/*


class Solution {
    public String countAndSay(int n) {
        StringBuilder curr=new StringBuilder("1");
	    	StringBuilder prev;
	    	int count;
	    	char say;
	        for (int i=1;i<n;i++){
	        	prev=curr;
	 	        curr=new StringBuilder();
	 	        count=1;
	 	        say=prev.charAt(0);

	 	        for (int j=1,len=prev.length();j<len;j++){
	 	        	if (prev.charAt(j)!=say){
	 	        		curr.append(count).append(say);
	 	        		count=1;
	 	        		say=prev.charAt(j);
	 	        	}
	 	        	else count++;
	 	        }
	 	        curr.append(count).append(say);
	        }
	        return curr.toString();
    }
}
 */