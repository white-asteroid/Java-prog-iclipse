package all_LOCAL_JavaProgs;


public class NQueens {
	public static boolean isSafe(boolean[][] mat , int r ,int c) {
		
		for(int i =r-1;i>-1;i--)
			if(mat[i][c])
				return false;
		int ml = Math.min(r, c);
		for(int i = 1;i<=ml;i++)
		{
			if(mat[r-i][c-i])
			{
				return false;
			}
		}
		int mr = Math.min(r, mat.length-c-1);
		for(int i = 1;i<=mr;i++)
		{
			if(mat[r-i][c+i])
			{
				return false;
			}
		}
		
		
		return true;
	}
	
	public static int NQueensFun(int r,boolean[][] mat) {
		if(r==mat.length)
		{
			for(boolean[] m1: mat)
			{
				for(boolean m2: m1)
				{
					if(m2)
						System.out.print(" Q ");
					else
						System.out.print(" X ");
						
				}

				System.out.println();
			}

			System.out.println("\n =========== \n");

			return 1;

		}
		
		int count =0;
		
		for(int c =0;c<mat.length;c++) {
			if(isSafe(mat,r,c))
			{
				mat[r][c] = true;
				count += NQueensFun(r+1,mat);
				mat[r][c] = false;
			}
		}
		
		return count;
	}
	
	public static int NQueensFunRec(int r,boolean[][] mat,int c) {
		if(r==mat.length)
		{
			for(boolean[] m1: mat)
			{
				for(boolean m2: m1)
				{
					if(m2)
						System.out.print(" Q ");
					else
						System.out.print(" X ");
						
				}

				System.out.println();
			}

			System.out.println("\n =========== \n");

			return 1;

		}
		
		int count =0;
	
			if(isSafe(mat,r,c))
			{
				mat[r][c] = true;
				count += NQueensFunRec(r+1,mat,0);
				mat[r][c] = false;
			}
			else
			{
				count += NQueensFunRec(r,mat,c+1);
			}
	
		
		return count;
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n =4;
		boolean[][] mat = new boolean[n][n];
		System.out.println(NQueensFun(0,mat));

	}

}
