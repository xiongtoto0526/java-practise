package com.xht.myseed.observeDesign;

public class Client {

    public static void main(String[] args) {
        //1. 制作产品
        Product mobile = new Product();
        mobile.setName("SAMSUNG手机");
        mobile.setPrice(2000);

        Product book = new Product();
        book.setName("JAVA设计模式");
        book.setPrice(80);

        // 2. 用户订阅产品
        // 2.1 用户绑定产品
        User user1 = new User();
        user1.setName("张三");
        user1.getFocusPdts().add(mobile);//关注某一款三星手机
        //user1.getFocusPdts().add(book);//关注JAVA设计模式

        User user2 = new User();
        user2.setName("李四");
        user2.getFocusPdts().add(mobile);//关注某一款三星手机
        user2.getFocusPdts().add(book);//关注JAVA设计模式

        // 2.2 产品绑定用户
        mobile.getFocusUsers().add(user1);
        book.getFocusUsers().add(user1);
        book.getFocusUsers().add(user2);

        // 3. 发送事件
        mobile.payOff(0.1);
        book.payOff(0.2);
    }

}
