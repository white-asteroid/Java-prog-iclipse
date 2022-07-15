package longestSubstring;

import java.util.*;
//import java.util.Arrays;

public class longestSubstring{

	
	public static void longestkSubstr(String s, int k) {
        // code here
        int j =0,i=0,msl=-1;
        HashMap<Character,Integer> map=new HashMap<>();
        while(j<s.length())
        {
//        	map.merge(s.charAt(j), 1, Integer::sum);
        	if(map.containsKey(s.charAt(j)))
        	{
        		map.put(s.charAt(j), map.get(s.charAt(j))+1);
        	}
        	else
        		map.put(s.charAt(j), 1);
        	if(map.size()<k)
        		j++;
        	if(map.size()==k) {
        		msl= Math.max(msl, j-i+1);
        	}
        	if(map.size()>k)
        	{
        		while(map.size()>k && i< s.length())
        		{
        			map.merge(s.charAt(i), -1, Integer::sum);
        			if(map.get(s.charAt(i)) ==0 )
        				map.remove(s.charAt(i));
        			i++;
        		}
        		j++;
        	}
        }
        System.out.println( msl );
	}
	public static void main(String[] args) {
		String s = "abcabcbb";
		longestkSubstr(s,3);
//		System.out.println("ans is "+ longestkSubstr(s,3));
//		int j=0;
//		while(j<s.length())
//			{
//				System.out.print(s.charAt(j++));
//			}
	}

}
