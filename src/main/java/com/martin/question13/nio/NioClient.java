package com.martin.question13.nio;

import java.net.InetSocketAddress;
import java.nio.ByteBuffer;
import java.nio.channels.SocketChannel;
import java.util.Scanner;

/**
 * Package: com.tian.socketproject.BIOThread.thread
 * Description： TODO
 * Author: 田智龍
 * Date: Created in 2021/7/14 19:38
 * Copyright: Copyright (c) 2021
 * Modified By: SmartDragon
 */

/**
 目标：用戶端案例實作-基于NIO非阻塞通信。
 */
public class NioClient {
    public static void main(String[] args) throws Exception {
        // 1、擷取通道
        SocketChannel sChannel = SocketChannel.open(new InetSocketAddress("127.0.0.1", 9999));
        // 2、切換成非阻塞模式
        sChannel.configureBlocking(false);
        // 3、配置設定指定緩沖區大小
        ByteBuffer buf = ByteBuffer.allocate(1024);
        // 4、發送資料給服務端
        Scanner sc = new Scanner(System.in);
        while (true){
            System.out.println("請說：");
            String msg = sc.nextLine();
            buf.put(("波妞："+msg).getBytes());
            buf.flip();
            sChannel.write(buf);
            buf.clear();
        }
    }
}

