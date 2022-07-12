package longestSubstring;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;

public class SubSetRec {
	static String[] s;
	public static ArrayList<String> SubSetRecFun(String str , String s,int i){
		if(str=="")
		{	
			System.out.println(s);
//			res[i]=s;
			ArrayList<String> rl = new ArrayList<String>();
			rl.add(s);
//			strli.add(s);
			return rl;
		}
//		String[] s = ;
		ArrayList<String> left  = SubSetRecFun(str.substring(1),s+str.charAt(0),i++);
		
		ArrayList<String> right = SubSetRecFun(str.substring(1),s,i++);
		left.addAll(right);
		return left;
//		return s;
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "abca";
		ArrayList<String> strli = new ArrayList<String>();
		strli =SubSetRecFun(str,"",0);
		strli.sort(null);
		HashSet<String> hs= new HashSet<String>();
		for(String q: strli)
		{
			hs.add(q);
		}
		System.out.println(strli+""+hs);

	}

}
