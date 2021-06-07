import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

public class PathSumII_113Test {

    @Test
    public void pathSum() {
        PathSumII_113 solution = new PathSumII_113();
        PathSumII_113.TreeNode root = new PathSumII_113.TreeNode(5);
        root.left=new PathSumII_113.TreeNode(4);
        root.right=new PathSumII_113.TreeNode(8);
        root.left.left = new PathSumII_113.TreeNode(11);
        root.left.left.left = new PathSumII_113.TreeNode(7);
        root.left.left.right = new PathSumII_113.TreeNode(2);
        root.right.left = new PathSumII_113.TreeNode(13);
        root.right.right = new PathSumII_113.TreeNode(4);
        root.right.right.right = new PathSumII_113.TreeNode(1);
        root.right.right.left = new PathSumII_113.TreeNode(5);

        List<Integer> expected1 = new ArrayList<Integer>(Arrays.asList(5,4,11,2));
        List<List<Integer>> result = solution.pathSum(root,22);
        assertThat(result.get(0),is(expected1));
    }

    @Test
    public void pathSum2() {
        PathSumII_113 solution = new PathSumII_113();

        List<Integer> expected1 = new ArrayList<Integer>(Arrays.asList(5,4,11,2));
        List<List<Integer>> result = solution.pathSum(null,22);
        assertThat(result.get(0),is(expected1));
    }
}