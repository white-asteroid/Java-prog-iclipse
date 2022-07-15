package all_LOCAL_JavaProgs;

import java.util.Arrays;

public class BubbleRec {
	public static void BubbleRecFun (int[] arr, int s,int e)
	{
//		System.out.println("s : "+s + " e: "+e);
		if(e==0)
			return;
		else if(s<e)
		{
			
				if(arr[s]>arr[s+1])
				{
					int temp = arr[s];
					arr[s] = arr[s+1];
					arr[s+1] =temp;
					s--;
				}
				BubbleRecFun(arr,s+1,e);
				
		
		}
		else {
			BubbleRecFun(arr,0,e-1);
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {100,4,-30,40,-50,-3,2,-1,0};
		System.out.println(Arrays.toString(arr));
		BubbleRecFun(arr,0,arr.length-1);
		System.out.println(Arrays.toString(arr));
	}

}
