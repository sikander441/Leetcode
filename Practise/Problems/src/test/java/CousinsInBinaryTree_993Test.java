import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class CousinsInBinaryTree_993Test {

    CousinsInBinaryTree_993 solution;
    @Before
    public void setup(){
        solution = new CousinsInBinaryTree_993();
    }
    @Test
    public void isCousinsTest1() {
        TreeNode root=new TreeNode(1);
        root.left=new TreeNode(2);
        root.right=new TreeNode(3);
        root.left.left=new TreeNode(4);

        boolean result = solution.isCousins(root,4,3);
        Assert.assertEquals(false,result);
    }
    @Test
    public void isCousinsTest2() {
        TreeNode root=new TreeNode(1);
        root.left=new TreeNode(2);
        root.right=new TreeNode(3);
        root.left.right=new TreeNode(4);
        root.right.right=new TreeNode(5);

        boolean result = solution.isCousins(root,5,4);
        Assert.assertEquals(true,result);
    }
    @Test
    public void isCousinsTest3() {
        TreeNode root=new TreeNode(1);
        root.left=new TreeNode(2);
        root.right=new TreeNode(3);
        root.left.right=new TreeNode(4);

        boolean result = solution.isCousins(root,2,3);
        Assert.assertEquals(false,result);
    }


}