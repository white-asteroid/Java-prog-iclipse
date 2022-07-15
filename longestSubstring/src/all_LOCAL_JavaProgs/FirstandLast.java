package all_LOCAL_JavaProgs;


public class FirstandLast {
    public static void reverse(int[] arr)
    {
        int i=0,j=arr.length-1,temp;
        while(i<j)
        {
            temp = arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
        }
    }
    
    public int BinarySearch(int[] arr, int t) {
		int s = 0, e = arr.length-1;
		int mid = s + (e - s) / 2;
		while (s <= e) {
		
			if (arr[mid] == t)
				return mid;
			else if (arr[mid] > t)
				e = mid - 1;
			else if (arr[mid] < t)
				s = mid + 1;
			mid = s + (e - s) / 2;
		}
		return -1;

	}
    public int[] searchRange(int[] nums, int target) {
        int[] res={-1,-1};
        res[0] = BinarySearch(nums, target);
//        reverse(arr);
        res[1]= nums.length - BinarySearch(nums, target);
        
        return res;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
