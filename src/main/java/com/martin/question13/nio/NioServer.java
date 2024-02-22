package com.martin.question13.nio;

import java.net.InetSocketAddress;
import java.nio.ByteBuffer;
import java.nio.channels.SelectionKey;
import java.nio.channels.Selector;
import java.nio.channels.ServerSocketChannel;
import java.nio.channels.SocketChannel;
import java.util.Iterator;
/**
 * Package: com.tian.socketproject.BIOThread.thread
 * Description： TODO
 * Author: 田智龍
 * Date: Created in 2021/7/14 19:38
 * Copyright: Copyright (c) 2021
 * Modified By: SmartDragon
 */
/**
 目标：NIO非阻塞通信下的入門案例：服務端開發
 */
public class NioServer {
    public static void main(String[] args) throws Exception {
        System.out.println("----服務端啟動---");
        // 1、擷取通道
        ServerSocketChannel ssChannel = ServerSocketChannel.open();
        // 2、切換為非阻塞模式
        ssChannel.configureBlocking(false);
        // 3、綁定連接配接的端口
        ssChannel.bind(new InetSocketAddress(9999));
        // 4、擷取選擇器Selector
        Selector selector = Selector.open();
        // 5、将通道都注冊到選擇器上去，并且開始指定監聽接收事件
        ssChannel.register(selector , SelectionKey.OP_ACCEPT);
        // 6、使用Selector選擇器輪詢已經就緒好的事件
        while (selector.select() > 0){
            System.out.println("開始一輪事件處理~~~");
            // 7、擷取選擇器中的所有注冊的通道中已經就緒好的事件
            Iterator<SelectionKey> it = selector.selectedKeys().iterator();
            // 8、開始周遊這些準備好的事件
            while (it.hasNext()){
                // 提取目前這個事件
                SelectionKey sk = it.next();
                // 9、判斷這個事件具體是什麼
                if(sk.isAcceptable()){
                    // 10、直接擷取目前接入的用戶端通道
                    SocketChannel schannel = ssChannel.accept();
                    // 11 、切換成非阻塞模式
                    schannel.configureBlocking(false);
                    // 12、将本用戶端通道注冊到選擇器
                    schannel.register(selector , SelectionKey.OP_READ);
                }else if(sk.isReadable()){
                    // 13、擷取目前選擇器上的讀就緒事件
                    SocketChannel sChannel = (SocketChannel) sk.channel();
                    // 14、讀取資料
                    ByteBuffer buf = ByteBuffer.allocate(1024);
                    int len = 0;
                    while((len = sChannel.read(buf)) > 0){
                        buf.flip();
                        System.out.println(new String(buf.array() , 0, len));
                        buf.clear();// 清除之前的資料
                    }
                }

                it.remove(); // 處理完畢之後需要移除目前事件
            }
        }
    }
}
