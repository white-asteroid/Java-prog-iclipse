package all_LOCAL_JavaProgs;

import java.util.*;
public class DiceProb {
	public static void DiceProbFun(String p, int up ) {
		if(up == 0) {
			System.out.println(p);
			return;
		}
		for(int i = 1;i<=6 && i<=up;i++) {
//			char ch = (char)(up - i);
			DiceProbFun(p+i,up-i);
			
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		String s= "4";
		DiceProbFun("",4);
	}

}
