package week2.hometask.object_to_file_out_to_object;

import java.io.Serializable;
import java.util.List;

/**
 * Created by Богдан on 25.01.2015.
 */
public interface IOSerializer<T> extends Serializable {
    public void save(List<T> tList);
    public List<T> load();               /// T need to be implemented

}
