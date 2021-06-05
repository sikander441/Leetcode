
class Pair<T,I>{
    T first;
    I second;
    Pair(T t,I i){
        this.first=t;
        this.second=i;
    }

    @Override
    public String toString() {
        return "Pair{" +
                "first=" + first +
                ", second=" + second +
                '}';
    }
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
public class CousinsInBinaryTree_993 {

    public Pair<TreeNode,Integer> findParentAndDepth(TreeNode root, int depth, int val){
        if(root==null)
         return null;
        if(root.left!=null && root.left.val==val){
            return new Pair<>(root,depth);
        }
        if(root.right!=null && root.right.val==val){
            return new Pair<>(root,depth);
        }
        Pair<TreeNode,Integer> result = findParentAndDepth(root.left,depth+1,val);
        if(result==null){
            result = findParentAndDepth(root.right,depth+1,val);
        }
        return result;

    }
    public boolean isCousins(TreeNode root, int x, int y) {
        Pair<TreeNode,Integer> parentAndDepth_x=findParentAndDepth(root,0, x);
        Pair<TreeNode,Integer> parentAndDepth_y=findParentAndDepth(root,0, y);
        return parentAndDepth_x.first.val != parentAndDepth_y.first.val && parentAndDepth_x.second==parentAndDepth_y.second;
    }
}
