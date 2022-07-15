package all_LOCAL_JavaProgs;

import java.util.Arrays;

public class MergeSortRec {
	public static void MergeIt(int[] arr,int s,int mid, int e)
	{
		int[] mix = new int[e-s+1];
		int i = s , j= mid+1;
		int k = 0;

		System.out.println(" in merge i : "+i +" mid : "+ mid +" j : "+j);
		while(i <= mid && j<=e) {
			if(arr[i]<arr[j])
			{
				mix[k]=arr[i];
				i++;
			}
			else {
				mix[k]=arr[j];
				j++;
			}
			k++;
			
		}
		System.out.println(" in merge i : "+i +" mid : "+ mid +" j : "+j+" e : "+e);
		System.out.println("k " +k);
		while(i <= mid) {
			mix[k]= arr[i];
			i++;k++;
		}
		System.out.println("Ak " +k);
		while(j <= e) {
			mix[k]= arr[j];
			j++;k++;
		}
		System.out.println(k);
		for(int l = 0;l<mix.length;l++)
			arr[s+l] = mix[l];
		System.out.println(Arrays.toString(arr));
	}
	public static void MergeSortRecFun(int[] arr, int s , int e)
	{
		
//		if(mid == s) {
		System.out.println("S : "+s +" e : "+e);
		if((e-s) == 0 ) {
			return;
		}
		int mid = s+(e-s)/2;
		
		MergeSortRecFun(arr,s,mid);
		MergeSortRecFun(arr,mid+1,e);
		System.out.println(" when passing S : "+s +" mid : "+ mid +" e : "+e);
		MergeIt(arr,s,mid,e);
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {5,4,3,2,1,0};
		System.out.println(Arrays.toString(arr));
		MergeSortRecFun(arr,0,arr.length-1);
		System.out.println(Arrays.toString(arr));
		
		String[] s = {"shivam","garg"};
		String[] h =s.clone();
		System.out.println(Arrays.toString(s)+ Arrays.toString(h));
		s[0]= "heello";

		System.out.println(Arrays.toString(s)+ Arrays.toString(h));
		
	}

}
