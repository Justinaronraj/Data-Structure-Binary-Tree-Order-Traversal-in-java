class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode(int x) {
        val = x;
        left = null;
        right = null;
    }
}
public class BinaryTreeTraversal_2 {
    public static void preOrder(TreeNode root) {
        if (root == null) {
            return;
        }
        System.out.print(root.val + " ");
        preOrder(root.left);
        preOrder(root.right);
    }
    public static void inOrder(TreeNode root) {
        if (root == null) {
            return;
        }
        inOrder(root.left);
        System.out.print(root.val + " ");
        inOrder(root.right);
    }
    public static void postOrder(TreeNode root) {
        if (root == null) {
            return;
        } 
        postOrder(root.left);
        postOrder(root.right);
        System.out.print(root.val + " ");
    }
    public static void main(String[] args) 
    {
        TreeNode root = new TreeNode(4);
        root.left = new TreeNode(2);
        root.right = new TreeNode(5);
        root.left.left = new TreeNode(3);
        root.left.left.right=new TreeNode(9); 
        root.left.left.right.left=new TreeNode(1);   
        root.right.right = new TreeNode(6);
        root.right.left=new TreeNode(7);
        root.right.right.left=new TreeNode(8);
        System.out.print("Pre-order Traversal: ");
        preOrder(root);
        System.out.print("\nIn-order Traversal: ");
        inOrder(root);
        System.out.print("\nPost-order Traversal: ");
        postOrder(root);
    }
}