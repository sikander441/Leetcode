import java.util.*;

public class RankTeamsbyVotes_1366 {

    public Character getTeamAtRank(Map<Character, List<Integer>> voteList,int rank,List<Character> charactersToConsider,int numOfTeams){

        //Tie not yet broken but teams exhausted.
        //Return alphabetically first;
        if(rank==numOfTeams){
            Collections.sort(charactersToConsider);
            return charactersToConsider.get(0);
        }
        List<Character> topRankers = new ArrayList<>();
        int max=0;
        for(Character ctr:charactersToConsider){
            int numOfVotesOfaTeam = voteList.get(ctr).get(rank);
            if(numOfVotesOfaTeam > max){
                topRankers.clear();
                max=numOfVotesOfaTeam;
                topRankers.add(ctr);
            }
           else if(numOfVotesOfaTeam==max){
                topRankers.add(ctr);
            }
        }
        if(topRankers.size()==1){
            return topRankers.get(0);
        }else{
            return getTeamAtRank(voteList,rank+1,topRankers,numOfTeams);
        }
    }

    public String rankTeams(String[] votes) {
        Map<Character, List<Integer>> voteList=new TreeMap<>();
        int numberOfTeams=votes[0].length();
        //initialize the tree Map;
        for(int i=0;i<numberOfTeams;i++){
            voteList.put(votes[0].charAt(i),new ArrayList<>(Collections.nCopies(numberOfTeams,0)));
        }

        for(String str:votes){
            for(int i=0;i<numberOfTeams;i++){
                List<Integer> voteListOfTeam = voteList.get(str.charAt(i));
                voteListOfTeam.set(i,voteListOfTeam.get(i)+1);
            }
        }
        List<Character> charactersToConsider = new ArrayList<>();
        for(char ch:votes[0].toCharArray()){
            charactersToConsider.add(ch);
        }
        String result = "";
        for(int i=0;i<numberOfTeams;i++){
            Character ctr = getTeamAtRank(voteList,0, charactersToConsider,numberOfTeams);
            result+=ctr;
            charactersToConsider.remove(ctr);
        }

        return result;
    }
}
