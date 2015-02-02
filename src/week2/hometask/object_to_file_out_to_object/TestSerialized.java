package week2.hometask.object_to_file_out_to_object;

import java.util.LinkedList;
import java.util.List;

/**
 * Created by Богдан on 28.01.2015.
 */
public class TestSerialized {

    public static void main(String[] args) {
        CattForFile cat1 = new CattForFile("Murchik", 3,"black");
        CattForFile cat2 = new CattForFile("Gavchik", 3,"black");
        CattForFile cat3 = new CattForFile("Riabko", 3,"black");
        CattForFile cat4 = new CattForFile("Brovko", 3,"black");

        List cats = new LinkedList();
        cats.add(cat1);
        cats.add(cat2);
        cats.add(cat3);
        cats.add(cat4);


            System.out.println(cats);

        FileIOSerializer<CattForFile> fios = new FileIOSerializer<CattForFile>();

        fios.save(cats);


    }
}
