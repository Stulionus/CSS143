import com.sun.source.tree.Tree;

public class Review {

    //Fibonacci sequence
    public static void main(String[] args) {
        System.out.println(fibonacci(5));
        System.out.println(fibonacci(10));
        System.out.println();


        // tree that only returns non-leaf
        TreeNode<Integer> myBinaryTree = new TreeNode<>(3);
        myBinaryTree.left = new TreeNode<>(9);
        myBinaryTree.left.left = new TreeNode<>(1);
        myBinaryTree.right = new TreeNode<>(20);
        myBinaryTree.right.right = new TreeNode<>(8);
        myBinaryTree.right.right.right = new TreeNode<>(2);
        myBinaryTree.right.right.left = new TreeNode<>(7);

        printNonLeaf(myBinaryTree);


        //Queue explanation
        //In this example queue is used because of its fifo nature means that
        //objects will be processed in the order that they have been added to
        //queue. Main advantage of this approach is that other operations do not
        //depend on the rate at which queue is processed.


        System.out.println();
        //Return the smallest number in
        System.out.println(minInBST(myBinaryTree));

    }

    public static int fibonacci(int n) {
        if (n <= 1) {
            return n;
        }
        return fibonacci(n - 1) + fibonacci(n - 2);
    }

    public static void printNonLeaf(TreeNode<Integer> root){
        if(root == null){
            return;
        }
        if (root.left == null && root.right == null){
            return;
        }

        System.out.println(root.val);

        printNonLeaf(root.left);
        printNonLeaf(root.right);
    }

    public static Integer minInBST(TreeNode<Integer> root){


        if (root == null) {
            return null;
        }

        TreeNode<Integer> current = root;
        while (current.left != null) {
            current = current.left;
        }

        return current.val;
    }
}
