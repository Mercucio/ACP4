package week3.day2.socket;

/**
 * Created by Богдан on 01.02.2015.
 */
public class RunServer {
    public static void main(String[] args) {
        // 192.168.1.40 9090
        ServerSocketExample serverSocketExample = new ServerSocketExample();
        serverSocketExample.start();
    }
}
