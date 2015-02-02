package week1.weekend12;

/**
 * Created by Богдан on 18.01.2015.
 */
public class Human implements Comparable<Human> {

    private int age;
    private String Name;
    private double high;

    @Override
    public int compareTo(Human human) {
        return this.age;
    }
}
