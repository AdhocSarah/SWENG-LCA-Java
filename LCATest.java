import org.junit.Test;

import static org.junit.Assert.*;

public class LCATest {

    @Test
    public void testEmpty(){
        BinaryTree tree = new BinaryTree();
        assertEquals("LCA of nodes 4 & 5", -1, tree.findLCA(4,5));
    }

    @Test
    public void testValid(){
        BinaryTree tree = new BinaryTree();
        tree.root = new Node(1);
        tree.root.left = new Node(2);
        tree.root.right = new Node(3);
        tree.root.left.left = new Node(4);
        tree.root.left.right = new Node(5);
        tree.root.right.left = new Node(6);
        tree.root.right.right = new Node(7);
        assertEquals("LCA of nodes 4 & 5", 2, tree.findLCA(4,5));
        assertEquals("LCA of nodes 4 & 6", 1, tree.findLCA(4,6));
        assertEquals("LCA of nodes 3 & 4", 1, tree.findLCA(3,4));
        assertEquals("LCA of nodes 2 & 4", 2, tree.findLCA(2,4));
    }

    @Test
    public void testInvalid(){
        BinaryTree tree = new BinaryTree();
        tree.root = new Node(1);
        tree.root.left = new Node(2);
        tree.root.right = new Node(3);
        tree.root.left.left = new Node(4);
        tree.root.left.right = new Node(5);
        tree.root.right.left = new Node(6);
        tree.root.right.right = new Node(7);
        assertEquals("LCA of nodes 4 & 8", -1, tree.findLCA(4,8));
    }



}