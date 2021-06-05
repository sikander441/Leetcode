package week1;

import java.util.*;

public class OpenTheLock {

    class Pair{
        String first;int second;
        Pair(String s,int level){
            first =s;
            second=level;
        }
    }
    public int openLock(String[] deadends, String target) {

        int result = BFS("0000".toCharArray(),target.toCharArray(),deadends);
        return result;
    }

    private int BFS(char[] start, char[] target, String[] deadEnds){

        Set<String> visisted = new TreeSet<>();
        visisted.addAll(Arrays.asList(deadEnds.clone()));
        Queue<Pair> queue = new LinkedList<>();

        queue.add(new Pair(String.valueOf(start),0));
        if(visisted.contains(String.valueOf(start)))
            return -1;
        visisted.add((String.valueOf(start)));

        while(!queue.isEmpty()){
            Pair currentPair = queue.poll();
            char[] current= currentPair.first.toCharArray();

            //System.out.print(String.valueOf(current)+", ");

            //match found
            if(currentPair.first.equals(String.valueOf(target)))
                return currentPair.second;

            int indexes[] = {0,0,1,1,2,2,3,3};
            int dx[]={1,-1,1,-1,1,-1,1,-1};

            for(int i=0;i<8;i++){
                char[] neighbour = current.clone();
                if(dx[i]==-1 && neighbour[indexes[i]]=='0')
                    neighbour[indexes[i]]='9';
                else if(dx[i]==1 && neighbour[indexes[i]]=='9')
                    neighbour[indexes[i]]='0';
                else
                    neighbour[indexes[i]]+=dx[i];

                if(!visisted.contains(String.valueOf(neighbour))){
                    visisted.add(String.valueOf(neighbour));
                    queue.add(new Pair(String.valueOf(neighbour),currentPair.second+1));
                }
            }
        }
        return -1;
    }

}
