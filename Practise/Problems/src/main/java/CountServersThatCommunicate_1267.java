import java.util.Arrays;

//https://leetcode.com/problems/count-servers-that-communicate/
public class CountServersThatCommunicate_1267 {
    public int countServers(int[][] grid) {

        int m = grid.length;
        int n = grid[0].length;
        int colSum[] = new int[n];
        int rowSum[] = new int[m];

        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                colSum[j]+=grid[i][j];
                rowSum[i]+=grid[i][j];
            }
        }
        System.out.println(Arrays.toString(colSum));
        System.out.println(Arrays.toString(rowSum));
        int rejected_servers = 0 ;
        int total_servers=0;
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(grid[i][j]==1 && colSum[j]==1 || rowSum[i]==1)
                    rejected_servers++;
                if(grid[i][j]==1)
                    total_servers++;
            }
        }
        return total_servers-rejected_servers;
    }
}


