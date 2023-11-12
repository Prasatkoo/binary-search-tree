package cz.educanet;

import cz.educanet.bst.BinarySearchTree;

public class Tree<T extends Comparable<T>> implements BinarySearchTree<T> {
    private T data;
    private Tree<T> left;
    private Tree<T> right;


    @Override
    public void insert(T item) {
        if (item.compareTo(data) > 0){
            if (left == null){
                left = new Tree<T>();
               left.data = item;
            }
            else {
                left.insert(item);
            }
        }
        else {
            if (right == null){
                right = new Tree<T>();
                right.data = item;
            }
            else {
                right.insert(item);
            }

        }

    }

    @Override
    public int depth() {
        if (left != null && right != null){
            return 1 + Math.max(left.depth(), right.depth());
        }
        else if (left != null){
            return 1 + left.depth();
        }
        else if (right != null){
            return 1 + right.depth();
        }
        return 0;
    }

    @Override
    public boolean contains(T item) {
        if (item == data){
            return true;
        }
        else if (item.compareTo(data) > 0){
            if (left == null){
                return false;
            }
            else {
                return left.contains(item);
            }
        }
        else {
            if (right == null){
                return false;
            }
            else {
                return right.contains(item);
            }
        }

    }

    public T getData() {
        return data;
    }
    public void setData(T data) {
        this.data = data;
    }

    public Tree getLeft() {
        return left;
    }

    public void setLeft(Tree left) {
        this.left = left;
    }

    public Tree getRight() {
        return right;
    }

    public void setRight(Tree right) {
        this.right = right;
    }



}
