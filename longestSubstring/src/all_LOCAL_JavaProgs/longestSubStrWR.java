package all_LOCAL_JavaProgs;

import java.util.HashMap;

public class longestSubStrWR {
	
	public static int lengthOfLongestSubstring(String s) {
		int i=0,j=0,m=-1,t;
        if(s.isBlank())
        	return -1;
		HashMap<String, Integer> map = new HashMap<>();
        
        while(j< s.length())
        {
        	
//        	map.merge(s.charAt(j), 1, Integer::sum);
        	if(map.containsKey(Character.toString(s.charAt(j))))
        	{
        		t = map.get(Character.toString(s.charAt(j)))+1;
//        		System.out.println("T : "+t);
        		map.put(Character.toString(s.charAt(j)), t);
        	}
        	else
        		map.put(Character.toString(s.charAt(j)), 1);
        	System.out.println("FOR EVERY ITERATION : \nMS : "+map.size()+"window : "+ (j-i+1) + " ::: " + j + " - "+" "+i +" +1" );
			System.out.println("MAP : "+ map+ " \n======\n" );
        	if(map.size()==j-i+1)
        	{
        		System.out.println("MAX AND WS "+m +" : "+(j-i+1));
        		m = Math.max(m, j-i+1);
        		System.out.println("new max  : "+m);
        	}
        	else if(map.size()<j-i+1)
        	{
        		while(map.size()<(j-i+1) && i < s.length())
        		{
        			System.out.println("bf MS : "+map.size()+"window : "+ (j-i+1) + " ::: " + j + " - "+" "+i +" +1" );
        			
        			System.out.println("MAP vf: "+ map );
        			
        			if(map.containsKey(Character.toString(s.charAt(i))))
        			{
        				t = map.get(Character.toString(s.charAt(i)));
//                		System.out.println("T : "+t);
            			t-=1;
                		map.put(Character.toString(s.charAt(i)), t);
            			if(t==0) {
            				map.remove(Character.toString(s.charAt(i)));
            			}
        			}
        				i++;
        			System.out.println("MS : "+map.size()+"window : "+ (j-i+1) + " ::: " + j + " - "+" "+i +" +1" );
        			System.out.println("MAP : "+ map );
        		}
        	}
        	j++;
        }
         return m;
    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = lengthOfLongestSubstring("aab");
		System.out.println(n);
	}

}
