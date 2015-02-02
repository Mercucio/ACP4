package week1.weekend1_hometask;

/**
 * Created by Богдан on 20.01.2015.
 */
public interface IBinaryTree<T> {

    void add( T t, Comparable compValue);

    public void traverse();
    public void findMin();
    public void findMax();
}
