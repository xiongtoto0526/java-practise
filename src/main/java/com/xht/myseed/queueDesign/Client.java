package com.xht.myseed.queueDesign;

public class Client {

    /**
     * 简单队列实现思路: 同一个jvm实现.
     * 0. customer 向queueManager中注册监听.
     * 1. producer 向queueManager发送请求.
     * 2. queueManager记录请求,并从执行线程中拉取有效线程执行(观察者模式).
     * 3. queueManager中执行完成后,更新queue队列(一般是删除请求),同时检测是否有未处理
     *    的请求.若存在,则再次执行.如此往复,直到队列清空.
     *
     */
}
