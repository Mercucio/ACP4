package week1.weekend12;

/**
 * Created by Богдан on 17.01.2015.
 */
public class TestStatic {
    public static void main(String[] args) {
        A a = new A();
        a.doNonStatic();
        A.doStatic();
    }

}

class A{

    static int count = 0;
    String desc = "desc";

    public static  void doStatic(){
                                            //desc = "new";     can't be used if nonstatic variable
        System.out.println(count);
    }

    public void doNonStatic(){
        count++;

    }
}