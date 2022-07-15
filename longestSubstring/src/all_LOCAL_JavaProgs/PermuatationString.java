package all_LOCAL_JavaProgs;

public class PermuatationString {
	public static void PermuatationStringFun(String up, String p) {
		String sub, ch = "";
		if(p.length()==1) {
			up = up + p.charAt(0);
			System.out.println(up);
		}
		for(int i =0;i<p.length();i++) {
			ch = Character.toString(p.charAt(i));
			sub = p.substring(0,i) + p.substring(i+1,p.length());
			PermuatationStringFun(up+ch,sub);
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "abc";
		PermuatationStringFun("",str);
	}

}
