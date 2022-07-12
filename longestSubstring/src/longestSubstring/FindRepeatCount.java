package longestSubstring;

import java.util.HashMap;
import java.util.Map;

public class FindRepeatCount {

	public static boolean CountRepeat(int[] arr) {
		HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
		for(int i = 0 ;i < arr.length;i++)
			{
				try{
					map.put(arr[i], map.get(arr[i])+1  );
				}
				catch(Exception e){
					map.put(arr[i], 1);
				}
				for (Map.Entry<Integer, Integer> e : map.entrySet()) {
					if(e.getValue()>1)
						return true;
				}
			}
		
		return false;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean a;
		int[] arr = {1,2,3,4};
		a= CountRepeat(arr);
		System.out.println(a);

	}

}
