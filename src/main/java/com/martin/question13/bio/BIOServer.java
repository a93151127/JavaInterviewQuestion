package com.martin.question13.bio;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * Package: com.tian.socketproject.BIO.server
 * Description： TODO
 * Author: 田智龍
 * Date: Created in 2021/7/14 19:30
 * Copyright: Copyright (c) 2021
 * Modified By: SmartDragon
 */
//服務端
public class BIOServer {
    public static void main(String[] args) {
        try {
            ServerSocket serverSocket = new ServerSocket(1000);
            Socket socket = serverSocket.accept();
            InputStream inputStream = socket.getInputStream();
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream));
            String msg;
            while ((msg = bufferedReader.readLine())!=null){
                System.out.println("接受到的msg:"+msg);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }finally {

        }
    }
}
