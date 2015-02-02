package week3.day2.reflection;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.lang.reflect.Field;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * Created by Богдан on 01.02.2015.
 */
public class AnnotationProcessor {
    public static void save(Object obj, String path) {
        Class cl = obj.getClass();
        try (PrintWriter pw = new PrintWriter(path)) {

            for (Field field : cl.getDeclaredFields()) {
                field.setAccessible(true);
                pw.println(field.getName());
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public static Object read(String path){
        Scanner sc;
        try {
            sc = new Scanner(new File(path));
            Map<String,String> map = new LinkedHashMap<>();

            while(sc.hasNextLine()){
                String line = sc.nextLine();
                String[] keyVal = line.split("=");
                map.put(keyVal[0],keyVal[1]);
              //  if(keyVal[0] .equals("class")){
                //    Class cl  = Class.forName(keyVal[1]);
                //}
            }
            Class cl = Class.forName(map.get("class"));
            Object inst = cl.newInstance();
            for(String fieldName: map.keySet()){
                Field field = cl.getDeclaredField(fieldName);
                field.setAccessible(true);
                // TODO // define type of value and find some a few bugs
                field.set(inst, map.get(fieldName));


            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (NoSuchFieldException e) {
            e.printStackTrace();
        }
        return null;  // TODO

    }
}