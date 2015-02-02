package week3.day2.socket;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Date;

/**
 * Created by Богдан on 01.02.2015.
 */
public class ServerSocketExample {
    private int count = 0;
    public void start(){
        try {
            ServerSocket serverSocket = new ServerSocket(9090);
            serverSocket.accept(); // it blocks whole process till the information gets here
            // action
            while(true) {
                Socket client = serverSocket.accept();
                System.out.printf("%d client address = %s",count, client.getInetAddress());
                //action
                PrintWriter pw = new PrintWriter(client.getOutputStream());
                pw.printf("hello from server,%d current date = %tc \n", serverSocket.getInetAddress(),count,new Date());
                count++;
                pw.flush();
                pw.close();

            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
