package all_LOCAL_JavaProgs;

import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;
//import java.util.Comparator;

public class ThreeSum {
	
public static void threeSum(int[] arr) {
    
	List<List<Integer>> l = new ArrayList<List<Integer>>();
	Arrays.sort(arr);
	for(int i =0;i<arr.length;i++ )
		System.out.print(arr[i]+" , ");
	System.out.println();
	
	int i=0,sum=0;
//	int[] res= {-1,-1,-1};
//    Comparator<Short> comp = null;
    int j = i+1,k =arr.length-1;
	for(i =0;i+2<arr.length;i++)
    {
		System.out.println("i "+i );
	    k=arr.length-1;
        while(i>0 && i<arr.length && arr[i]==arr[i-1] )
            i++;

        j=i+1;
  
       
        while(j<k)
        {
            sum = arr[j]+arr[k]+arr[i] ;
            System.out.println("sum : "+sum + " arr[i]"+arr[i] +" i : "+i +" j : "+j +" k : "+k );
            if(sum== 0)
            {	
//            	System.out.println("pika");
                
                		l.add(Arrays.asList(arr[i] , arr[j],arr[k] ));
                		System.out.println("pika");
                		for(int t =0;t<arr.length;t++ )
                			System.out.print(arr[t]+" , ");
                		System.out.println();       		
                k--;
                while(j<k && arr[k]==arr[k+1])
                	k--;
            }
            else if(sum> 0)
            {
                k--;
                System.out.println("K : "+ k);
            }
            else
            {
               
               j++;
                
               
            }
          
            while(k-1 >= 0 && arr[k]==arr[k-1])
            	k--;

        }
    }
	 System.out.println(l);
//        return l;
        
        }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		int[] arr= {-1,0,1,2,-1,-4,-2,-3,3,0,4};
		int[] arr={2,0,-2,-5,-5,-3,2,-4};
		threeSum(arr);
	}

}
