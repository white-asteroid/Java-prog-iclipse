package longestSubstring;

import java.util.HashMap;
//import java.util.Map;

public class CheckInclusion {
	
	public static boolean checkInclusion(String s1, String s2) {
        
		int i =0,j=0,t;
		boolean flag =false;
		HashMap<String, Integer> map1 = new HashMap<>();
		HashMap<String, Integer> map2 = new HashMap<>();
		for(int s = 0 ;s<s1.length();s++)
		{
//			map1.merge(s1.charAt(j), 1, Integer::sum);
			if(map1.containsKey(Character.toString(s1.charAt(s))))
        	{
        		t = map1.get(Character.toString(s1.charAt(s)))+1;
//        		System.out.println("T : "+t);
        		map1.put(Character.toString(s1.charAt(s)), t);
        	}
			else
				map1.put(Character.toString(s1.charAt(s)), 1);
		}
		System.out.println("=========\nMAp 1 init=======\n");
		System.out.println("map1 : "+ map1 );
		while(j<s2.length())
		{
			
//			System.out.println("WS :" +(j-i+1)+" map2 : "+ map2 );
			if(map2.containsKey(Character.toString(s2.charAt(j)))) {
				t = map2.get(Character.toString(s2.charAt(j)));
				t+=1;
				map2.put(Character.toString(s2.charAt(j)),t);
				
			}
			else
			{
				map2.put(Character.toString(s2.charAt(j)),1);
			}
			System.out.println("=========\nFOREVERY ITERATION=======\n");
			System.out.println("input WS :" +(j-i+1)+" map2 : "+ map2 );
			if(j-i+1 < s1.length())
			{
				
				
				
			}
			
			else if((j-i+1)==s1.length())
			{
				System.out.println("Window size hit with map: "+map2);
				flag = map1.equals(map2);
				if(flag)
				{
					return true;
				}
				else
				{
					if(map2.containsKey(Character.toString(s2.charAt(i))))
        			{
        				t = map2.get(Character.toString(s2.charAt(i)));
//                		System.out.println("T : "+t);
            			t-=1;
                		map2.put(Character.toString(s2.charAt(i)), t);
            			if(t==0) {
            				map2.remove(Character.toString(s2.charAt(i)));
            			}
        			}
					System.out.println("NEW MAP AR " +map2);
				}
				i++;
			}
			j++;
		}
		
		
		return flag;
    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1="ab", s2 = "eidbaooo";
		System.out.println(checkInclusion(s1,s2));
	}

}
