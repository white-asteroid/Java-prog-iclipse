package all_LOCAL_JavaProgs;

import java.util.Arrays;

public class SudokuSolver {

	
	public static boolean isSafe(int[][] b, int r,int c, int n) {
	
		for(int i =0;i<9;i++) {
			if(b[r][i] == n  ) 
				return false;//looking in row
			
			if(b[i][c] == n)
				return false; //looking in col
		}
		int rl = r - r%3;
		int cl = c - c%3;
		for(int i = rl;i<rl+3;i++)
		{
			for(int j = cl;j<cl+3;j++)
			{
				if(b[i][j]==n)
					return false;
			}
				
		}
		return true;
	}
	
	public static boolean solve(int[][] b) 
	{
		int r=-1,c=-1;
		boolean emptyleft = false;
		for(int i=0;i<b.length;i++)
		{
			for(int j = 0;j<b[i].length;j++) {
				if(b[i][j] == 0) {
					r=i;
					c=j;
					emptyleft = true;
					break;
				}
			}

			if(emptyleft)
				break;
		}
//		System.out.println("r,c : "+ r+" , "+ c);
		if(!emptyleft) {
			return true;
		}
		
		for(int num =1;num<10;num++) {
			if(isSafe(b,r,c,num)) {
				b[r][c] = num;
				if(solve(b)) {
					return true;
				}
				else {
					b[r][c] =0;
				}
				
			}
			
		}
		
		
		return false;
	}
	

	
	public static boolean isSafeString(char[][] b, int r,int c, int n) {
	
		for(int i =0;i<9;i++) {
			if(b[r][i] == (char)n  ) 
				return false;//looking in row
			
			if(b[i][c] == (char)n)
				return false; //looking in col
		}
		int rl = r - r%3;
		int cl = c - c%3;
		for(int i = rl;i<rl+3;i++)
		{
			for(int j = cl;j<cl+3;j++)
			{
				if(b[i][j]==(char)n)
					return false;
			}
				
		}
		return true;
	}
	
	public static boolean solveString(char[][] b) 
	{
		int r=-1,c=-1;
		boolean emptyleft = false;
		for(int i=0;i<b.length;i++)
		{
			for(int j = 0;j<b[i].length;j++) {
				if(b[i][j] == '.') {
					r=i;
					c=j;
					emptyleft = true;
					break;
				}
			}

			if(emptyleft)
				break;
		}
//		System.out.println("r,c : "+ r+" , "+ c);
		if(!emptyleft) {
			return true;
		}
		
		for(int num =1;num<10;num++) {
			if(isSafeString(b,r,c,num)) {
				b[r][c] = (char)num;
				if(solveString(b)) {
					return true;
				}
				else {
					b[r][c] ='.';
				}
				
			}
			
		}
		
		
		return false;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] b= { {3, 0, 6, 5, 0, 8, 4, 0, 0}, 
		         {5, 2, 0, 0, 0, 0, 0, 0, 0}, 
		         {0, 8, 7, 0, 0, 0, 0, 3, 1}, 
		         {0, 0, 3, 0, 1, 0, 0, 8, 0}, 
		         {9, 0, 0, 8, 6, 3, 0, 0, 5}, 
		         {0, 5, 0, 0, 9, 0, 6, 0, 0}, 
		         {1, 3, 0, 0, 0, 0, 2, 5, 0}, 
		         {0, 0, 0, 0, 0, 0, 0, 7, 4}, 
		         {0, 0, 5, 2, 0, 6, 3, 0, 0} };
//		for(int[] b1: b ) {
//			System.out.println(Arrays.toString(b1));
//				
//		}
		if(solve(b)) {
			for(int[] b1: b ) {
				System.out.println(Arrays.toString(b1));
					
			}
		}
		else {
			System.out.println("wrong");
		}
		char[][] board = {{'5','3','.','.','7','.','.','.','.'},
				{'6','.','.','1','9','5','.','.','.'},
				{'.','9','8','.','.','.','.','6','.'},
				{'8','.','.','.','6','.','.','.','3'},
				{'4','.','.','8','.','3','.','.','1'},
				{'7','.','.','.','2','.','.','.','6'},
				{'.','6','.','.','.','.','2','8','.'},
				{'.','.','.','4','1','9','.','.','5'},
				{'.','.','.','.','8','.','.','7','9'}};
		System.out.println("\n\n-----Sting wala --------");
		if(solveString(board)) {
			for(int[] b1: b ) {
				System.out.println(Arrays.toString(b1));
					
			}
		}
		else {
			System.out.println("wrong");
		}
	}
	
}
	
	
	


