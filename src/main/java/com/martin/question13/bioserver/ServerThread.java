package com.martin.question13.bioserver;

import java.io.*;
import java.net.Socket;

/**
 * Package: com.tian.socketproject.BIOThread.thread
 * Description： TODO
 * Author: 田智龍
 * Date: Created in 2021/7/14 19:38
 * Copyright: Copyright (c) 2021
 * Modified By: SmartDragon
 */
//建立一個服務線程
public class ServerThread extends Thread{

    //套接字
    private Socket socket;

    //構造函數
    public ServerThread(Socket socket){
        this.socket = socket;
    }

    @Override
    public void run(){
        try {
            InputStream inputStream = socket.getInputStream();
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream));
            String msg;
            while ((msg = bufferedReader.readLine())!=null){
                System.out.println("接受到的消息為："+msg);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
