package week3.day1;

import week2.week22.Person;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

/**
 * Created by Богдан on 31.01.2015.
 */
public class IntroducedReflApi {
    public static void main(String[] args) throws IllegalAccessException, InstantiationException, NoSuchFieldException, NoSuchMethodException {
        Person person = new Person(20, 49, "Jack", new double[]{1, 2, 3});
        Class cl = person.getClass(); // structure of the person
        System.out.println(cl.getName());
        cl.newInstance();
        Field fieldName = cl.getField("num");
        System.out.println(fieldName.getName());

        Method methodSetNum = cl.getMethod("setNum", Integer.class);

        //cl.getDeclaredConstructor()


// when you do not know exact name of the methods

        Field[] fields = cl.getFields();
    }

    public static void shoeFieldInfo(Object obj) throws IllegalAccessException {
        Class cl = obj.getClass();
        for(Field field:cl.getDeclaredFields()){
            System.out.printf("type:%s,name:%s,value:%s", field.getType().getName()
                                                          , field.getName()
                                                          , field.get(obj));
        }
    }


}
