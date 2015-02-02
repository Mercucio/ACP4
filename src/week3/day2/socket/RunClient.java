package week3.day2.socket;

/**
 * Created by Богдан on 01.02.2015.
 */
public class RunClient {
    public static void main(String[] args) {
        ClientSocket clientSocket = new ClientSocket("192.168.1.40",9090);
        clientSocket.start();
    }
}
