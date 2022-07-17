package all_LOCAL_JavaProgs;

import java.util.Arrays;

public class MazeRec {
	public static void MazeRecFun(String p, int r, int c ,boolean[][] maze,int[][] path,int step) {
		if(r==2 && c == 2) {
			path[r][c] = step;
			for(int i= 0;i<path.length;i++)
			{
				System.out.println(Arrays.toString(path[i]));
			}
			System.out.println(p);
			return;
		}
		if(maze[r][c]==false)
			return;
		
		maze[r][c]= false;
		path[r][c] = step; 
		if(r< maze.length - 1)
		{
			
			MazeRecFun(p+"D",r+1,c,maze,path,step+1);
		}
		if(c< maze[0].length - 1)
		{
			MazeRecFun(p+"R",r,c+1,maze,path,step+1);
		}
		if( r> 0)
		{
			MazeRecFun(p+"U",r-1,c,maze,path,step+1);
		}
		if(c>0)
		{
			MazeRecFun(p+"L",r,c-1,maze,path,step+1);
		}
		maze[r][c]= true;
		path[r][c] = 0; 
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean[][] maze = {{true,true,true},{true,true,true},{true,true,true}};
		int[][] path = new int[maze.length][maze[0].length];
		MazeRecFun("",0,0,maze,path,1);
	}
}
