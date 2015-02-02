package week2.hometask.object_to_file_out_to_object;

import java.io.*;
import java.util.Formatter;
import java.util.List;


/**
 * Created by Богдан on 25.01.2015.
 */
public class FileIOSerializer<T> implements IOSerializer<T> {

    public static String PATH = "C:\\cats.txt";

    private String path;
    private Formatter formatter;                        ///// that should be taught  (SimpleDateFormatt and Calendar)
    //also should be done parse method

    @Override
    public void save(List<T> tObjects) {                //and at this place could be

        Writer flwr = null;

        BufferedWriter bw = null;                       // it fluents on bw.newLine();

        try{
            flwr = new FileWriter(PATH);

            bw = new BufferedWriter(flwr);

            for(int i = 0; i < tObjects.size(); i++){
                bw.write((i+1) +". "+ tObjects.get(i).toString());       // formatting of the information in file
                bw.newLine();
            }

            bw.flush();
        }
        catch(IOException e){
            e.printStackTrace();
        }
        finally {
            try {

                // flwr.close();
                bw.close();                 // Is it necessary to close both or the type is Reader, so one it's enough?

            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }
    @Override
    public List<T> load() {
        Reader fileReader = null;
        BufferedReader bufReader = null;
        StringBuilder tempString = new StringBuilder();

        try{
            fileReader  = new FileReader(PATH);

            bufReader = new BufferedReader(fileReader);

                    // bufReader.readLine(bufReader);          //    can't get access to this method,but now it's OK
                                                                  // cause bufferedReader was anounced like Reader
                                                                 // so it's cutted off in functionality,
                                                                 // there is no need to realize the flexibility
            while(fileReader.read() != -1){
                tempString.append(bufReader.readLine());
            }
            return parse(tempString.toString());
        }
        catch(IOException e){
            e.printStackTrace();
        }
        finally {

            try {
                bufReader.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return null;

    }
    //TODO
    public List<T> parse(String newLine){
        List<T> tObjParse = null;



        return tObjParse;

    }
}
