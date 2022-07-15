package all_LOCAL_JavaProgs;
import java.lang.String;

public class CeilingOfaNum {
	

	public static char nextGreatestLetter(char[] letters, char target) {

		int s= 0, e = letters.length-1,mid;
	    
		mid = s+(e-s)/2;
		while(s<=e)
		{
            mid = s+(e-s)/2;   
			if(letters[mid] <= target)
				s=mid+1;
			else if(letters[mid]>target)
				e=mid-1;
         
		}
		// mid = mid % letters.length;
		return letters[s % letters.length];
		}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	}

}
