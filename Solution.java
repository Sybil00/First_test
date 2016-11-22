package assigncookies_455;

import java.util.Arrays;

public class Solution {
	 public int findContentChildren(int[] g, int[] s) {
	        Arrays.sort(g);
	        Arrays.sort(s);
	        int i=0,j=0;
	        while(i<g.length&&j<s.length){
	        	if(g[i]<=s[j]){
	        		i++;
	        		j++;
	        	}
	        	else j++;
	        }
	        return i;
	    }
public static void main(String args[]){
	Solution so=new Solution();
	int[] g={1,2};
	int[] s={1,2,3};
	System.out.println(so.findContentChildren(g, s));
} 
}
