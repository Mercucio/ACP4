package week2.hometask.scanner;

import java.util.regex.Pattern;

/**
 * Created by Богдан on 31.01.2015.
 */
public interface IScanner {
    public String next();
    public int nextInt();
    public String nextLine();
    public boolean hasNext();
    public boolean hasInt();
    public IScanner useDelimeter(Pattern delimPattern);
}
