package com.martin.question13.bioserver;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
public class BioThreadServer {
    public static void main(String[] args) {
        try {
            //建立端口号
            ServerSocket serverSocket = new ServerSocket(8888);
            while (true){
                //擷取連接配接
                Socket socket = serverSocket.accept();
                //啟動線程
                new ServerThread(socket).start();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
