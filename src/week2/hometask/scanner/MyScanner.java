package week2.hometask.scanner;

import java.nio.CharBuffer;
import java.util.regex.Pattern;

/**
 * Created by Богдан on 31.01.2015.
 */
public class MyScanner implements IScanner {

    private CharBuffer buf;

    public char[] charBuffer = new char[1024];
    @Override
    public String next() {
        return null;
    }

    @Override
    public int nextInt() {
        return 0;
    }

    @Override
    public String nextLine() {
        return null;
    }

    @Override
    public boolean hasNext() {
        return false;
    }

    @Override
    public boolean hasInt() {
        return false;
    }

    @Override
    public IScanner useDelimeter(Pattern delimPattern) {
        return null;
    }
}
