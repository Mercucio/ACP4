package week2.week22;

/**
 * Created by Богдан on 25.01.2015.
 */
public class Person {
    private int age;
    private double salary;
    private String name;
    private long id;

    private double[] dId;
    public Person(){

    }

    public Person(int age, double salary, String name, double[] id) {
        this.age = age;
        this.salary = salary;
        this.name = name;
        this.dId = id;
    }

    @Override
    public String toString() {
        return "Person{" +
                "age=" + age +
                ", salary=" + salary +
                ", name='" + name + '\'' +
                ", id=" + id +
                '}';
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Person person = (Person) o;

        if (id != person.id) return false;

        return true;
    }
//@Override
//      public boolean equals(Object obj){
//      if(obj == null) return false;
//      if(this == obj) return true;
//      if(Person.class != o.getClass()) return false
//      Person other = (Person) o;
//      return this.id == other.id &&
//      this.age == other.age &&
//      (this.name != null && name.equals(other.name))
//      && Double.compare(this.salary, other.salary) == 0;

    // Effective Java  - info about
    @Override
    public int hashCode() {
        int hash = 1;
        hash = 31 * hash + age;
        hash = 31 * hash+ (name != null ? name.hashCode() : 0);
        hash  = 31 * hash + (int)(id ^ (id >>> 32));
        long temp = Double.doubleToLongBits(salary);
        hash = 31 * hash + (int)(temp ^ (temp >>> 32));
        return hash;
    }
}
