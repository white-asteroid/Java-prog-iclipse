package all_LOCAL_JavaProgs;

import java.lang.StringBuilder;
import java.lang.String;

public class LongestPalindromeSubStr {
	
	public static boolean checkPalindrome(String str) {
		 StringBuilder sb=new StringBuilder(str);  
		if( sb.reverse().toString() == str  )
			return true;
		
		return false;
	}
	public static String findPal(String str,int i , int j) {
		String res="";
//		int i =0,j=1;
		System.out.println("i : "+i+" j : "+j);
		System.out.println("Fun received :"+ str );
//		j--;
//		System.out.println("i : "+i+" j : "+j);
		while( i>=0 && j< str.length()  && str.charAt(i)==str.charAt(j))
		{
			i--;j++;
//			System.out.println("i : "+i+" j : "+j);
		}
		if(i<0)
			i=0;
		res = str.substring(i,j);
		System.out.println("Fun returning :"+ res );
		return res;
	}
	
	public static String longestPalindrome(String s) {
		 if(s.length()<2)
	            return s;
		 int j =0;
		 String str= Character.toString(s.charAt(0));
		 String Lstr = "";
		 for(int i = 0 ;i<s.length()-1;i++)
		 {
			 if(s.charAt(i)==s.charAt(i+1))
			 {
				 j=i+1;
				 while(s.charAt(i)==s.charAt(j))
				 {
					 j++;
				 }
				 str = findPal( s,i,j );
			 }
			 else if((i+2) < s.length())
			 {
				 if(s.charAt(i)==s.charAt(i+2))
				 {
					 str = findPal( s,i,i+2);
				 }
			 }
			 if(Lstr.length()<str.length())
				 Lstr = str;
		 }
		 
		 return Lstr;
    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(longestPalindrome("babad"));
	}

}
