package week3.day1;

/**
 * Created by Богдан on 31.01.2015.
 */
public class Cat {
    private int age;
    private String name;
    private String colour;

    public Cat(){

    }
    public Cat(int age, String name, String colour) {
        this.age = age;
        this.name = name;
        this.colour = colour;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    @Override
    public String toString() {
        return "Cat{" +
                "age=" + age +
                ", name='" + name + '\'' +
                ", colour='" + colour + '\'' +
                '}';
    }
}
