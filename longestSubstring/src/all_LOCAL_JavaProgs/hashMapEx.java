package all_LOCAL_JavaProgs;
import java.util.HashMap;
import java.util.Map;


public class hashMapEx {
	// Java program to traversal a
	// Java.util.HashMap

		public static void main(String[] args)
		{
			// initialize a HashMap
			HashMap<String, Integer> map = new HashMap<>();

			// Add elements using put method
			map.put("vishal", 10);
			map.put("sachin", 30);
			map.put("vaibhav", 0);
			map.get("vishal");
			// Iterate the map using
//			map.put("vishal",map.get("vishal")+1);
//			int n map["vishal"];
			map.merge("putar", 1, Integer::sum);
			map.merge("putar", 1, Integer::sum);
			// for-each loop
			for (Map.Entry<String, Integer> e : map.entrySet())
				System.out.println("Key: " + e.getKey()
								+ " Value: " + e.getValue());
		}
	}
