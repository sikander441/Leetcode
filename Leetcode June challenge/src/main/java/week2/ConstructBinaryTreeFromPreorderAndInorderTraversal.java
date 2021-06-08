package week2;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;


public class ConstructBinaryTreeFromPreorderAndInorderTraversal {
    public TreeNode recursivelyAdd(Stack<Integer> preStack,int[] inorder, int l, int r){
        if(l>r)
            return null;
        int root = preStack.pop();

        int index = findIndex(inorder,root,l,r);
        TreeNode left_node = recursivelyAdd(preStack,inorder,l,index-1);
        TreeNode right_node = recursivelyAdd(preStack,inorder,index+1,r);

        return new TreeNode(root,left_node,right_node);
    }
    public TreeNode buildTree(int[] preorder, int[] inorder) {

        Stack<Integer> preStack = new Stack<>();
        for(int i=preorder.length-1;i>=0;i--)
            preStack.push(preorder[i]);

        return recursivelyAdd(preStack,inorder,0,inorder.length-1);

    }

    private int findIndex(int[] arr,int x,int l, int r) {
        for(int i=l;i<=r;i++)
            if(arr[i]==x)
                return i;

        return -1;
    }

    class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode() {}
        TreeNode(int val) { this.val = val; }
        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }
}



/*
pre=[3,5,1,6,4] inorder = [5,1,3,6,4]
            3
         5     6
           1     4

 */