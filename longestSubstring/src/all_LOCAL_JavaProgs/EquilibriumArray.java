package all_LOCAL_JavaProgs;

import java.util.Arrays;

public class EquilibriumArray {

	 public static int pivotIndex(int[] arr) {
		 int i = 0,j=arr.length-1,si=0,st=0,sa=0,cp;
		 for(int k = 0;k<arr.length;k++)
			 sa+=arr[k];
		 sa/=2;
		 while(i<arr.length-1)
		 {	
			System.out.println(si);
			si+=arr[i];
			st = si;
		 	
		 	 
			if(si == sa - si - arr[i] )
			 {
				 cp = i;
				 break;
			 }
			 i++;
		 }
			 
		 return -1;
	        
	    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {-1,-1,-1,-1,-1,100};
		 
		System.out.println(pivotIndex(arr));
		System.out.println(Arrays.toString(arr));
	}

}
