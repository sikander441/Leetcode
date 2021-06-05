import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class RankTeamsbyVotes_1366Test {

    RankTeamsbyVotes_1366 solution;

    @Before
    public void setUp() throws Exception {
        solution = new RankTeamsbyVotes_1366();
    }

    @Test
    public void rankTeamsTest1() {
        String votes[]={"ABC","ACB","ABC","ACB","ACB"};
        String result  = solution.rankTeams(votes);
        Assert.assertEquals("ACB",result);
    }

    @Test
    public void rankTeamsTest2() {
        String votes[]={"BCA","CAB","CBA","ABC","ACB","BAC"};
        String result  = solution.rankTeams(votes);
        Assert.assertEquals("ABC",result);
    }

    @Test
    public void rankTeamsTest3() {
        String votes[]={"WXYZ","XYZW"};
        String result  = solution.rankTeams(votes);
        Assert.assertEquals("XWYZ",result);
    }

    @Test
    public void rankTeamsTest4() {
        String votes[]={"ZMNAGUEDSJYLBOPHRQICWFXTVK"};
        String result  = solution.rankTeams(votes);
        Assert.assertEquals("ZMNAGUEDSJYLBOPHRQICWFXTVK",result);
    }

    @Test
    public void rankTeamsTest5() {
        String votes[]={"M","M","M","M"};
        String result  = solution.rankTeams(votes);
        Assert.assertEquals("M",result);
    }
    @Test
    public void rankTeamsTest6() {
        String votes[]={"WXYZ","XYZW"};
        String result  = solution.rankTeams(votes);
        Assert.assertEquals("XWYZ",result);
    }
}