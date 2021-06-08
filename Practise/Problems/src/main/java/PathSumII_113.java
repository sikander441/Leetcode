//https://leetcode.com/problems/path-sum-ii/
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Stack;


public class PathSumII_113 {
    class PairAndParent{
        Pair pair;PairAndParent parent;
        PairAndParent(Pair p, PairAndParent pa){
            pair= p;parent=pa;
        }
    }
    class Pair{
        TreeNode root;
        int currSum;
        Pair(TreeNode root,int currSum){this.root=root;this.currSum=currSum;}
    }
    public List<List<Integer>> pathSum(TreeNode root, int targetSum) {

        List<List<Integer>> finalResult = new ArrayList<>();
        if(root==null)
            return finalResult;
        Stack<PairAndParent> st = new Stack<>();
        st.push(new PairAndParent(new Pair(root,targetSum),null));
        while(!st.empty()){
            PairAndParent currPairAndParent = st.pop();
            Pair currPair = currPairAndParent.pair;
            TreeNode curr = currPair.root;
            int currSum = currPair.currSum;
            if(curr.left == null && curr.right == null && curr.val==currSum) {
                //System.out.print(curr.val);
                List<Integer> result = new ArrayList<>();
                while(currPairAndParent!=null){
                    result.add(currPairAndParent.pair.root.val);
                    currPairAndParent = currPairAndParent.parent;
                }
                Collections.reverse(result);
                finalResult.add(result);
            }

            if(curr.right!=null){
                st.push(new PairAndParent(new Pair(curr.right,currSum-curr.val),currPairAndParent));
            }
            if(curr.left!=null){
                st.push(new PairAndParent(new Pair(curr.left,currSum-curr.val),currPairAndParent));
            }



        }
        return finalResult;
    }
    static class  TreeNode {
        int val;
        TreeNode left;
        TreeNode right;TreeNode() {}
        TreeNode(int val) { this.val = val; }
        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }
}
