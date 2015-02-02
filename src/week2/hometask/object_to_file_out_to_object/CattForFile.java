package week2.hometask.object_to_file_out_to_object;

import sun.util.resources.CalendarData_ar;

import java.io.Serializable;

/**
 * Created by Богдан on 28.01.2015.
 */
public class CattForFile implements Serializable{
    private String name;
    private int age;
    private String colour;

    public CattForFile(){

    }

    public CattForFile(String sName, int iAge, String sColour){
        this.age = iAge;
        this.name = sName;
        this.colour = sColour;
    }

    public String toString(){
        return this.name + " " + this.age
                + " " + this.colour + "\n";
    }
}
