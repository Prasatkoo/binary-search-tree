package cz.educanet;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
class TreeTest {

    @Test
    public void validate_successful_insert_and_creation_of_new_branch_in_Tree() {
        Tree<Integer> tree = new Tree<>();
        tree.setData(5);
         tree.insert(4);
         tree.insert(6);
         tree.insert(3);
         tree.insert(7);
        Assertions.assertEquals(3, tree.getRight().getRight().getData());
        Assertions.assertEquals(7, tree.getLeft().getLeft().getData());
    }

    @Test
    void validate_if_numberIsIn_tree_or_not() {
        Tree<Integer> tree = new Tree<>();
        tree.setData(5);
        tree.insert(4);
        tree.insert(6);
        tree.insert(3);
        tree.insert(7);
        Assertions.assertTrue(tree.contains(3));
        Assertions.assertFalse(tree.contains(10));
    }
    @Test
    void count_the_depth_of_the_tree() {
        Tree<Integer> tree = new Tree<>();
        tree.setData(5);
        tree.insert(4);
        tree.insert(6);
        tree.insert(3);
        tree.insert(7);
        tree.insert(8);
        Assertions.assertEquals(3, tree.depth());
    }
}