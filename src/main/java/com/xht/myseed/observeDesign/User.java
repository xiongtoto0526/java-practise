package com.xht.myseed.observeDesign;

import java.util.HashSet;
import java.util.Set;

/**
 * 观察者(订阅者)
 *
 * @author Administrator
 */
public class User implements Observer {

    private String name;

    private Set<Product> focusPdts;

    /**
     * 回调监听
     */
    public void onNotify(String msg) {
        System.out.println(this.name+"收到消息,消息内容为:");
        System.out.println(msg);
        System.out.println(this.name+"将处理消息...");
        System.out.println(this.name+"处理完成~");
    }

    public User() {
        focusPdts = new HashSet<Product>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Set<Product> getFocusPdts() {
        return focusPdts;
    }

    public void setFocusPdts(Set<Product> focusPdts) {
        this.focusPdts = focusPdts;
    }

}