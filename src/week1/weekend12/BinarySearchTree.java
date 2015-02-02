package week1.weekend12;

/**
 * Created by Богдан on 18.01.2015.
 */
public class BinarySearchTree<E> implements ITree<E> {

    public BinarySearchTree(){

    }

    private Node root;
    @Override
    public void add(E element) {
        Node temp = (Node) element;

        if(root.equals(null)){
            root = temp;

        }

        }

    @Override
    public boolean contains(Object o) {
        return false;
    }

    @Override
    public void print(Object o) {

    }

    @Override
    public void traverse() {

        print(root);
    }


    private void print(Node curr) {


    }


}

 class Node<T>{
    T val;
    public Node left;
    public Node right;
    public Node parent;
    public Comparable obj;

public Node(T val, Node left, Node right, Node parent){


}

}