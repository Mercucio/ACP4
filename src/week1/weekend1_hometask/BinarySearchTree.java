package week1.weekend1_hometask;

import java.util.Iterator;

/**
 * Created by Богдан on 20.01.2015.
 */
public class BinarySearchTree<T extends Comparable> implements IBinaryTree,
        Iterator {

    private Node root;

    public void add(Comparable compValue){
        if (this.root == null) {
            this.root = new Node(null, null, compValue, null);
        }else
        {
            add(root,compValue);
        }
    }
    @Override
    public void add(Object object, Comparable compValue) {
        Node current = (Node) object;


        if (compValue.compareTo(current.val) < 0) {

            if (current.leftChild == null) {
                current.leftChild = new Node(null, null, compValue, current);
            } else {
                add(current, compValue);
            }
        }
        if (compValue.compareTo(current.val) > 0) {
            if (current.rightChild == null) {
                current.rightChild = new Node(null, null, compValue, current);
            } else {
                add(current, compValue);
            }
        }
    }


    @Override
    public void traverse() {


    }

    @Override
    public void findMin() {

    }

    @Override
    public void findMax() {

    }

    @Override
    public boolean hasNext() {
        return false;
    }

    @Override
    public Object next() {
        return null;
    }

    @Override
    public void remove() {

    }

    private class Node {
            private Node leftChild;
            private Node rightChild;
            private Comparable val;
            private Node parent;


            public Node(Node lChild, Node rChild, Comparable cObj, Node nParent) {

                this.leftChild = lChild;
                this.rightChild = rChild;
                this.val = cObj;
                this.parent = nParent;
            }

            public String toString() {
                return "\n Node's value " + this.val;
            }
        }



}