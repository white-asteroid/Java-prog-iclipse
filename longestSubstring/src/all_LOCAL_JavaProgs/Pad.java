package all_LOCAL_JavaProgs;

import java.util.*;

public class Pad {
	public static List<String> PadFun(String p,String up){
		if(up == "") {
			ArrayList<String> list1 = new ArrayList<String>();
			list1.add(p);
			
			return list1;
			
		}
		ArrayList<String> list = new ArrayList<String>();
		int d = up.charAt(0) - '0'; 
		// TODO Auto-generated method stub
//		System.out.println(d);
		
		int i = (d-2)*3;
		int len = i+3;
		if(d==7 || d==9) {
			len = i+4;
		}
		if(d>7) {
			i=(d-2)*3 + 1;
			len++;
		}
		for(;i<len;i++)
		{
//			ArrayList<String> list = new ArrayList<String>();
			char ch = (char)('a'+i);
			list.addAll(PadFun(p+ch,up.substring(1)));
			
		}
		
		return list;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(PadFun("","87"));
		int i= 1;
		String ch = "p" + i;
		System.out.println("p"+i+" : " +ch);
		
	}

}
