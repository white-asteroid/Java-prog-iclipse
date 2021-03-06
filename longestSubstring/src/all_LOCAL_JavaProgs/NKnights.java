package all_LOCAL_JavaProgs;

public class NKnights {
	public static void display(boolean[][] mat) {
		for(boolean[] m1: mat)
		{
			for(boolean m2: m1)
			{
				if(m2)
					System.out.print(" K ");
				else
					System.out.print(" X ");
					
			}

			System.out.println();
		}
		System.out.println("======= \n");
	}
	
	public static boolean isSafe(boolean[][] mat,int r, int c) {

		if(isValid(mat,r-1,c-2) )
			if(mat[r-1][c-2])
			return false;
		if(isValid(mat,r-1,c+2) )
			if( mat[r-1][c+2])
			return false;
		if(isValid(mat,r-2,c+1))
			if( mat[r-2][c+1])
			return false;
		if(isValid(mat,r-2,c-1) )
			if( mat[r-2][c-1])
			return false;
		
		return true;
	}
	public static boolean isValid(boolean[][] mat,int r, int c) {
		if(r< mat.length && c <mat.length && r>= 0 && c>=0)
			return true;
		return false;
		
	}
	
	public static int NKnightsFun(boolean[][] mat,int r , int c,int k) {
//		System.out.println("k : "+k +" r : "+r +" c : "+c);
		if(k==0)
		{
			display(mat);
			
			return 1;
		}
		if(!(r>=0 && r<mat.length))
			return 0;
		int count =0;
		if(c==mat.length ) 
		{
//			System.out.println("mat len");
			count+=NKnightsFun(mat,r+1,0,k);
			return count;
		}
		
		if(isSafe(mat,r,c)) {
			mat[r][c]=true;
			count+=NKnightsFun(mat,r,c+1,k-1);
			mat[r][c]=false;
			
		}
	
		count+=NKnightsFun(mat,r,c+1,k);
	
		
		return count;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n =3;
		boolean[][] mat = new boolean[n][n];
		System.out.println(NKnightsFun(mat,0,0,5));
//		NKnightsFun(mat,0,0,n);
	}

}
