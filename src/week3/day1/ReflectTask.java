package week3.day1;

import java.lang.reflect.Field;

/**
 * Created by Богдан on 31.01.2015.
 */
public class ReflectTask {

    public static void main(String[] args) {
        Cat cat = new Cat(9,"Murzyk","Grey");
        Class cl = cat.getClass();
        createAndInit(cl);
        System.out.println(cat);

    }

    static Object createAndInit(Class cl){
        Object obj = null;
        try {
            obj = cl.newInstance();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }
        Field[] fields = cl.getDeclaredFields();
        for(Field field: cl.getDeclaredFields()){
            if(field.getType() == String.class && (field.getName() != "colour")){
                try {
                    field.setAccessible(true);
                    field.set(obj,"NoName");
                } catch (IllegalAccessException e) {
                    e.printStackTrace();
                }

            }
        }

        return obj;
    }
}
