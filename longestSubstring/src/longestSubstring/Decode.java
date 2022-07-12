package longestSubstring;

import java.util.ArrayList;

public class Decode {

	public static int numDecodings(String s) {
        if(s.charAt(0)=='0')
       return 0;
    int pp = 0,pf=0,tp=0,sp=0,tt=1;
//    int[] arr= {};
    ArrayList<Integer> arr = new ArrayList<>();
    for(int i =0;i<s.length();i++)
    	arr.add ( Character.getNumericValue( s.charAt(i) ) ) ;
    

    for(int i =0;i<s.length();i++)
    	System.out.print(" , "+arr.get(i));
	System.out.println();

    for(int i = s.length() - 1 ; i> 0 ; i--)
    {
//    	int t = arr.get(i-1);
//    	int t2 = arr.get(i);
//    	System.out.println( t);
        if(arr.get(i)==0)
        {
            i--;
            pp=0;
            if(arr.get(i)==1 || arr.get(i)==2)
            continue;
            else
                return 0;
        }
        
        
        if((arr.get(i-1)*10+ arr.get(i)) <  27 && arr.get(i-1)!=0&& arr.get(i)!=0)
        {
        	if (pf==1 && pp==0)
        		sp+=tp;
        	else if(pf==1 && pp>1)
        		sp++;
        	else if(pf==1 && pp%2!=0)
        		sp+=tp-1;
        	tp++;
        	pp++;
        	pf=1;
        	
        	System.out.println("pair : "+ arr.get(i-1)+arr.get(i)+" prv-pair : "+ pp +" tp : "+tp+" sp : "+sp);
        	if(sp>0)
        	tt += tp *(sp); 
        }
        else {
        	pp=0;
//        	sp=0;
        }
    }
    System.out.println("T pair : "+tp+ " Sp : " + sp+" tT : "+tt);
return tp+sp+tp*sp+1;
    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int res = numDecodings("1212121212");
		System.out.println("result : " + res);
	}

}
