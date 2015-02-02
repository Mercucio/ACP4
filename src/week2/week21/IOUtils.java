package week2.week21;

/**
 * Created by Богдан on 24.01.2015.
 */

// Input output

import java.io.*;
public class IOUtils {

    public void Save(String info){

        File temp = new File("C:\\test.txt");

        //byte [] byteArrayOfString = info.getBytes();

        OutputStream os =  null;

        try {
           os = new FileOutputStream(temp);                         // os = new FileOutputStream(temp, boolean append);
                                                                    // if append is true data will be added to the end of the
                                                                    //previous data
            if(temp.canWrite() != false) os.write(info.getBytes());

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        finally{
            if(os != null){
                try {
                    os.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }

    }

    public String Load(String path){
        String dest = "";

        InputStream is = null;                              // from JDK 1.7 could be do not closed, cause this interface
                                                            // is extends Closable

        try {
            is = new FileInputStream(new File(path));
            int c = 0;
            while((c = is.read()) != -1){
                dest += (char)c;
            }
            return dest;

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return "there is nothing to write";
    }

    public static void serial(){
        try {
            ObjectOutputStream oos = new ObjectOutputStream(
                    new BufferedOutputStream(
                            new FileOutputStream("C;//test.txt"))
                    // it's a Decorator pattern for the optimal flexible usability
            );
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
public static void reader(InputStream is){
    // Adapter
    InputStreamReader streamReader = new InputStreamReader((is));
    // Decorator
BufferedReader br = new BufferedReader(new InputStreamReader(is));

    try {
        String s = br.readLine();
    } catch (IOException e) {
        e.printStackTrace();
    }
}

}
