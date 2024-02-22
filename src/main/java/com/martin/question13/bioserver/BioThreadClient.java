package com.martin.question13.bioserver;

import java.io.IOException;
import java.io.PrintStream;
import java.net.Socket;
import java.util.Scanner;

/**
 * Package: com.tian.socketproject.BIOThread.client
 * Description： TODO
 * Author: 田智龍
 * Date: Created in 2021/7/14 19:49
 * Copyright: Copyright (c) 2021
 * Modified By: SmartDragon
 */
//用戶端
public class BioThreadClient {
    public static synchronized void main(String[] args) {
        try {
            Socket socket = new Socket("localhost",8888);
            PrintStream printStream = new PrintStream(socket.getOutputStream());
            Scanner scanner = new Scanner(System.in);
            String msg;
            while (true){
                System.out.println("請發送消息：");
                msg = scanner.nextLine();
                printStream.println(msg);
                printStream.flush();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }finally {

        }
    }
}
