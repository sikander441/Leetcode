package week1;

public class MaxAreaOfIsland {


    static int counter=0;
    public static void DFS(int[][] grid,boolean visited[][],int i,int j){
        int m = grid.length;
        int n = grid[0].length;
        visited[i][j]=true;
        counter++;
        if(i+1<m && j<n && visited[i+1][j] == false && grid[i+1][j]==1)
            DFS(grid,visited,i+1,j);
        if(i-1>=0 && visited[i-1][j] == false && grid[i-1][j]==1)
            DFS(grid,visited,i-1,j);
        if(j+1<n && visited[i][j+1] == false && grid[i][j+1]==1)
            DFS(grid,visited,i,j+1);
        if(j-1>=0 && visited[i][j-1] == false && grid[i][j-1]==1)
            DFS(grid,visited,i,j-1);
    }

    public static int maxAreaOfIsland(int[][] grid){
        int ans=0;
        int m = grid.length;
        int n = grid[0].length;
        boolean visited[][] = new boolean[m][n];
        for(int i=0;i<m;i++){
            for(int j=0; j< n; j++){
                if(visited[i][j]==false && grid[i][j]==1){
                    DFS(grid , visited, i, j);
                    ans = Math.max(counter,ans);
                    counter=0;
                }
            }
        }
        return ans;
    }
    public static void main(String args[]){

        //int[][] grid = new int[][]{{0,0,1,0,0,0,0,1,0,0,0,0,0},{0,0,0,0,0,0,0,1,1,1,0,0,0},{0,1,1,0,1,0,0,0,0,0,0,0,0},{0,1,0,0,1,1,0,0,1,0,1,0,0},{0,1,0,0,1,1,0,0,1,1,1,0,0},{0,0,0,0,0,0,0,0,0,0,1,0,0},{0,0,0,0,0,0,0,1,1,1,1,0,0},{0,0,0,0,0,0,0,1,1,0,0,0,0}};
        int[][] grid = new int[][]{{0,1},{1,1}};
        System.out.println(maxAreaOfIsland(grid));
    }
}
